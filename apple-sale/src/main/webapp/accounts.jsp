<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="zh">
<head>
<title>Checkout</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="aStar Fashion Template Project">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="styles/bootstrap-4.1.3/bootstrap.css">
<link href="plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.carousel.css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/animate.css">
<link rel="stylesheet" type="text/css" href="styles/checkout.css">
<link rel="stylesheet" type="text/css" href="styles/checkout_responsive.css">
<script src="js/jquery-3.2.1.min.js"></script>
</head>
<body>
<form method="post">
<!-- 在购物车页面跳转过来的时候,用户所需要结算的商品id -->
<input type="hidden" value="${ids}" name="ids"/>

<div class="super_container">

	<div id="dd_div">
		<script>
			$("#dd_div").load("sidebar.jsp");
			
		</script>
		
	</div>

	<div class="home">
		<div class="parallax_background parallax-window" data-parallax="scroll" data-image-src="images/checkout.jpg" data-speed="0.8"></div>
		<div class="home_container">8
			<div class="home_content">
				<div class="home_title">结算</div>
				<div class="breadcrumbs">
					<!--<ul class="d-flex flex-row align-items-center justify-content-start">
						<li><a href="index.html">Home</a></li>
						<li><a href="cart.html">Your Cart</a></li>
						<li>Checkout</li>
					</ul>-->
				</div>
			</div>
		</div>
	</div>

	<!-- Checkout -->

	<div class="checkout">
		<div class="section_container">
			<div class="container">
				<div class="row">
					<div class="col">
						<div class="checkout_container d-flex flex-xxl-row flex-column align-items-start justify-content-start">
							
							<!-- Billing -->
							<div class="billing checkout_box">
								<div class="checkout_title">我的地址</div>
								
								<div class="checkout_form_container" >
								<c:forEach items="${alist}" var="adr">
									<input type="radio" name="adr_radio" value="${adr.aid}"/>
									 ${adr.address} - ${adr.uphone} <br/>
								</c:forEach>
								</div>
								
								<div class="checkout_form_container" 
								<c:if test="${not empty alist}">style="display:none"</c:if>
								>
									<form action="#" id="checkout_form" class="checkout_form">
										<div class="row">
											<div class="col-lg-6">
												<!-- Name -->
												<label for="checkout_name">姓*</label>
												<input type="text" id="checkout_name" class="checkout_input" required="required">
											</div>
											<div class="col-lg-6">
												<!-- Last Name -->
												<label for="checkout_last_name">名*</label>
												<input type="text" id="checkout_last_name" class="checkout_input" required="required">
											</div>
										</div>
										<div>
											<!-- City / Town -->
											<label for="checkout_city">省份*</label>
											<select name="checkout_city" id="checkout_city" class="dropdown_item_select checkout_input" require="required">
												<option></option>
												<option>广东</option>
												<option>广东</option>
												<option>广东</option>
												<option>广东</option>
											</select>
										</div>
										<div>
											<!-- Province -->
											<label for="checkout_province">城市*</label>
											<select name="checkout_province" id="checkout_province" class="dropdown_item_select checkout_input" require="required">
												<option></option>
												<option>深圳</option>
												<option>深圳</option>
												<option>深圳</option>
												<option>深圳</option>
											</select>
										</div>
										<div>
											<!-- Address -->
											<label for="checkout_address">详细地址*</label>
											<input type="text" id="checkout_address" class="checkout_input" required="required">
											<!--<input type="text" id="checkout_address_2" class="checkout_input checkout_address_2" required="required">-->
										</div>
										<div>
											<!-- Phone no -->
											<label for="checkout_phone">手机*</label>
											<input type="phone" id="checkout_phone" class="checkout_input" required="required">
										</div>
										<div>
											<!-- Email -->
											<label for="checkout_email">邮箱*</label>
											<input type="phone" id="checkout_email" class="checkout_input" required="required">
										</div>
										<div class="checkout_extra">
											<ul>
												<li class="billing_info d-flex flex-row align-items-center justify-content-start">
													<label class="checkbox_container">
														<input type="checkbox" id="cb_1" name="billing_checkbox" class="billing_checkbox">
														<span class="checkbox_mark"></span>
														<span class="checkbox_text">同意快递协议</span>
													</label>
												</li>
												<!-- <li class="billing_info d-flex flex-row align-items-center justify-content-start">
													<label class="checkbox_container">
														<input type="checkbox" id="cb_3" name="billing_checkbox" class="billing_checkbox">
														<span class="checkbox_mark"></span>
														<span class="checkbox_text">保存到我的地址</span>
													</label>
												</li> -->
											</ul>

											<div class="checkout_button trans_200"><a href="javascript:void(0);" id="save_adr">保存地址</a></div>

										</div>
									</form>
								</div>
							</div>

							<!-- Cart Total -->
							<div class="cart_total">
							
							
								<div class="cart_total_inner checkout_box">
									<div class="checkout_title">结算</div>
									<ul class="cart_extra_total_list">
										<li class="d-flex flex-row align-items-center justify-content-start">
											<div class="cart_extra_total_title">总价</div>
											<div class="cart_extra_total_value ml-auto">$29.90</div>
										</li>
										<li class="d-flex flex-row align-items-center justify-content-start">
											<div class="cart_extra_total_title">快递</div>
											<div class="cart_extra_total_value ml-auto">顺丰</div>
										</li>
										<li class="d-flex flex-row align-items-center justify-content-start">
											<div class="cart_extra_total_title">总计</div>
											<div class="cart_extra_total_value ml-auto">$29.90</div>
										</li>
									</ul>

									<!-- Payment Options -->
									<div class="payment">
										<div class="payment_options">
											<label class="payment_option clearfix">在线支付
												<input type="radio" name="radio">
												<span class="checkmark"></span>
											</label>
											<label class="payment_option clearfix">货到付款
												<input type="radio" name="radio">
												<span class="checkmark"></span>
											</label>
											<label class="payment_option clearfix">不给钱
												<input type="radio" name="radio">
												<span class="checkmark"></span>
											</label>
										</div>
									</div>

									<!-- Order Text -->
									<div class="order_text">感谢你来土商城购买，请你注意买到就是赚到，哈哈哈哈哈</div>

									<div class="checkout_button trans_200"><a href="javascript:void(0);" id="act_pay">立即支付</a></div>
								</div>
							
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


</div>

</form>
</body>
<script src="styles/bootstrap-4.1.3/popper.js"></script>
<script src="styles/bootstrap-4.1.3/bootstrap.min.js"></script>
<script src="plugins/greensock/TweenMax.min.js"></script>
<script src="plugins/greensock/TimelineMax.min.js"></script>
<script src="plugins/scrollmagic/ScrollMagic.min.js"></script>
<script src="plugins/greensock/animation.gsap.min.js"></script>
<script src="plugins/greensock/ScrollToPlugin.min.js"></script>
<script src="plugins/OwlCarousel2-2.2.1/owl.carousel.js"></script>
<script src="plugins/easing/easing.js"></script>
<script src="plugins/parallax-js-master/parallax.min.js"></script>
<script src="js/checkout.js"></script>
</html>