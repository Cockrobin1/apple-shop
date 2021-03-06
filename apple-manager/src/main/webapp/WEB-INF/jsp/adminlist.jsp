<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>欢迎页面-X-admin2.0</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="./xadmin/css/font.css">
    <link rel="stylesheet" href="./xadmin/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="./xadmin/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="./xadmin/js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">演示</a>
        <a>
          <cite>导航元素</cite></a>
      </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"
       href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
</div>
<form class="layui-form layui-col-md12 x-so" action="adminList">
    <div class="x-body">
        <div class="layui-row">

            <input type="hidden" name="pageNum" value="${pageInfo.pageNum}">
            <input type="hidden" name="pageSize" value="${pageInfo.pageSize}">
            <%--<input class="layui-input" placeholder="开始日" name="start" id="start">
            <input class="layui-input" placeholder="截止日" name="end" id="end">--%>
            <input type="text" name="aname" placeholder="请输入用户名" value="${adminEntity.aname}" autocomplete="off"
                   class="layui-input">
            <input type="text" name="aphone" placeholder="请输入手机" value="${adminEntity.aphone}" autocomplete="off"
                   class="layui-input">
            <button class="layui-btn" lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>

        </div>
        <xblock>
            <button type="button" class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>
            </button>

            <a  class="layui-btn" href="jumpAdminAdd"><i class="layui-icon"></i>添加用户</a>

            <span class="x-right" style="line-height:40px">共有数据：${pageInfo.total} 条</span>
        </xblock>
        <table class="layui-table">
            <thead>
            <tr>
                <th>
                    <div class="layui-unselect header layui-form-checkbox" lay-skin="primary">
                        <i class="layui-icon">&#xe605;</i>
                    </div>
                </th>
                <th>ID</th>
                <th>登录名</th>
                <th>手机</th>
                <th>邮箱</th>
                <th>角色</th>
                <th>加入时间</th>
                <th>状态</th>
                <th>操作</th>
            </thead>
            <tbody>
            <c:forEach items="${pageInfo.list}" var="admin" >
                <tr>
                    <td>
                        <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='${admin.aid}'>
                            <i class="layui-icon">&#xe605;</i></div>
                    </td>
                    <td>${admin.aid}</td>
                    <td>${admin.aacount}</td>
                    <td>${admin.aphone}</td>
                    <td>${admin.aname}</td>
                    <td>${role.rname}</td>
                    <td>1111-11-11 11:11:11</td>
                    <td class="td-status">
                        <span class="layui-btn layui-btn-normal layui-btn-mini">已启用</span></td>
                    <td class="td-manage">
                        <a onclick="member_stop(this,'10001')" href="javascript:;" title="启用">
                            <i class="layui-icon">&#xe601;</i>
                        </a>
                        <a title="编辑"  href="jumpEdit">
                            <i class="layui-icon">&#xe642;</i>
                        </a>
                        <a title="删除" onclick="member_del(this,'要删除的id')" href="javascript:;">
                            <i class="layui-icon">&#xe640;</i>
                        </a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <div class="page">
            <div>
                <a class="prev" href="adminList?pageNum=1">&lt;&lt;</a>

                <c:forEach items="${pageInfo.navigatepageNums}" var="pg">

                    <c:if test="${pageInfo.pageNum != pg}">
                        <a class="num" href="javascript:void(0)" onclick="pageSubmit(${pg})">${pg}</a>
                    </c:if>

                    <c:if test="${pageInfo.pageNum eq pg}">
                        <span class="current">${pg}</span>
                    </c:if>
                </c:forEach>

                <a class="next" href="adminList?pageNum=${pageInfo.pages}">&gt;&gt;</a>
            </div>
        </div>

    </div>
</form>
<script>

    function pageSubmit(pageNum) {
        $("input[name='pageNum']").val(pageNum);
        $("form").submit();
    }

    $(document).ready(function(){

        $("input[name='aname']").change(function(){
            $("input[name='pageNum']").val(1);
        });

    })

    layui.use('laydate', function () {
        var laydate = layui.laydate;

        //执行一个laydate实例
        laydate.render({
            elem: '#start' //指定元素
        });

        //执行一个laydate实例
        laydate.render({
            elem: '#end' //指定元素
        });
    });

    /*用户-停用*/
    function member_stop(obj, id) {
        layer.confirm('确认要停用吗？', function (index) {

            if ($(obj).attr('title') == '启用') {

                //发异步把用户状态进行更改
                $(obj).attr('title', '停用')
                $(obj).find('i').html('&#xe62f;');

                $(obj).parents("tr").find(".td-status").find('span').addClass('layui-btn-disabled').html('已停用');
                layer.msg('已停用!', {icon: 5, time: 1000});

            } else {
                $(obj).attr('title', '启用')
                $(obj).find('i').html('&#xe601;');

                $(obj).parents("tr").find(".td-status").find('span').removeClass('layui-btn-disabled').html('已启用');
                layer.msg('已启用!', {icon: 5, time: 1000});
            }

        });
    }

    /*用户-删除*/
    function member_del(obj, id) {
        var data = tableCheck.getData();

        layer.confirm('确认要删除吗？', function (index) {
            //发异步删除数据
            var aa = ''+tableCheck.getData();
            console.info(aa);
            console.info(tableCheck.getData());
            $.ajax({
                url:"dalAdmins",
                data:{'aid':aa},
                type:"post",
                success:function(result){
                    layer.msg('已删除!', {icon: 1, time: 1000});
                    $(obj).parents("tr").remove();
                    location.replace(location.href); //刷新当期那页面
                }
            });
        });
    }

    function delAll(argument) {

        var data = tableCheck.getData();

        layer.confirm('确认要删除吗？' + data, function (index) {
            //捉到所有被选中的，发异步进行删除

            //向后台发送ajax就可以删除多条记录; 获取所有被选中的id
            //data  1,2,3->字符串
            var aa = ''+tableCheck.getData();
            console.info(aa);
            console.info(tableCheck.getData());

            $.ajax({
                url:"delAdmins",
                data:{'ids':aa},
                type:"post",
                success:function(result){
                    layer.msg('删除成功', {icon: 1});
                    $(".layui-form-checked").not('.header').parents('tr').remove();
                    location.replace(location.href); //刷新当期那页面
                }
            });
        });
    }
</script>
</body>

</html>