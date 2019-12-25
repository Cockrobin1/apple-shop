
//页面加载的事件
$(document).ready(function(){
	
	//给添加商品到购物车的按钮,绑定一个点击事件;
	var funclick = function(event) {

		$.ajax({

			url: "addShopCar",
			data: {"gid": $(this).attr("gid")}, //$(this):代表当前(点击)的对象
			type: "post",
			success: function (json) {

				if (json.resultCode =="00000") { //添加成功
				  $("#cart_num").html(json.total);
				  var str = "￥"+json.totalPrice+"("+(json.total)+")";
					$("#cart_price").html(str);
					// 添加成功//实现一个动画效果;
					// div_left = $(event.target).offset().left;
					// div_top = $(event.target).offset().top;
					//
					// //1:创建一个div;并且制定这个div的位置:
					//
					// $("body").append($("<div id='sc_div'>").addClass("shopcar_div").css('left',div_left).css('top',div_top));
					//
					//
					// //2:使用动画效果,将div移到目标位置,并且删掉/隐藏;
					// target_left = $("#cart_num").offset().left;
					// target_top = $("#cart_num").offset().top;
					//
					// $("#sc_div").animate({left:target_left,top:target_top,width:"0px",height:"0px"},2000);
					//
					// setTimeout(function(){
					// 	$("#sc_div").remove();
					// 	$(".addshopcar").click(fun);
					// }, 2010);

					//是对数据的展示

					//  numberCount:0
					//  priceCount:0.00
					// 	var tt = json.resultMsg.split(",");
					//
					// 	var number = tt[0]; //商品的总数
					// 	var price = tt[1];//商品的总价
					// 	var str = '¥'+price+'('+number+')';
					//
					// 	$("#cart_num").html(number);
					// 	$("#cart_price").html(str);
					//
					// 	// var str = json.msg.split(",");//"255.00,3"
					// 	// $("#cart_num").html(str[1]);//str[1]:咱们的数量
					// 	// $("#cart_price").html('¥'+str[0]+'('+str[1]+')');
					// }else{
					// 	alert(json.msg);
				}
			}
		});
	}
		// //获取当前点击a标签的gid的属性
		// ${this}.attr("gid");//获取静态属性，使用attr    动态使用prop

		$(".addshopcar").click(funclick); //给这个按钮解绑这个事件

	
	// $(".addshopcar").click(fun);
	
});