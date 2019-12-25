<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>


<!DOCTYPE html>
<html lang="zh">

<head>
<title>Cart</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="aStar Fashion Template Project">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css"
	href="styles/bootstrap-4.1.3/bootstrap.css">
<link href="plugins/font-awesome-4.7.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css"
	href="plugins/OwlCarousel2-2.2.1/owl.carousel.css">
<link rel="stylesheet" type="text/css"
	href="plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
<link rel="stylesheet" type="text/css"
	href="plugins/OwlCarousel2-2.2.1/animate.css">
<link rel="stylesheet" type="text/css" href="styles/cart.css">
<link rel="stylesheet" type="text/css" href="styles/cart_responsive.css">
<script src="js/jquery-3.2.1.min.js"></script>
</head>

<body>

	<div class="super_container">

		<div id="dd_div">
			<script>
				$("#dd_div").load("sidebar.jsp");
			</script>

		</div>

		<div class="home">
			<div class="parallax_background parallax-window"
				data-parallax="scroll"
				data-image-src="images/product_background.jpg" data-speed="0.8"></div>
			<div class="home_container">
				<div class="home_content">
					<div class="home_title">订单详情</div>
					<div class="breadcrumbs">
						<ul
							class="d-flex flex-row align-items-center justify-content-start">
							<li><a href="index.html">主页</a></li>
							<li>俺的订单详情</li>
						</ul>
					</div>
				</div>
			</div>
		</div>

		<!-- Cart -->

		<div class="cart_section">
			<div class="section_container">
				<div class="container">
					<div class="row">
						<div class="col">
							<div class="cart_container">
							<form method="post">
								<!-- Cart Bar -->
								<div class="cart_bar">
									<ul
										class="cart_bar_list item_list d-flex flex-row align-items-center justify-content-start">
										<li>订单详情id</li>
										<li>商品名称</li>
										<li>订单价格</li>
										<li>订单数量</li>
										<li>总价</li>
									</ul>
								</div>

								<!-- Cart Items -->
								<div class="cart_items">
									<ul class="cart_items_list">

										<c:forEach items="${order}" var="order">
											<li id="li_${order.aid}" class="cart_item item_list d-flex flex-lg-row flex-column align-items-lg-center align-items-start justify-content-start">
												<div class="product_color text-lg-center product_text">
												${order.oid}
												</div>

												<div class="product_price text-lg-center product_text">${order.aid}</div>
												<div class="product_price text-lg-center product_text">${order.odate }</div>
												<div class="product_price text-lg-center product_text">${order.ostatus}</div>
												<div class="product_price text-lg-center product_text">
												${order.ototal}
												</div>
											</li>
										</c:forEach>
									</ul>
								</div>

							</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>

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
	<script src="js/cart.js"></script>
</body>

</html>