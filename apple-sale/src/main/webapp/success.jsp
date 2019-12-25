<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="zh">

	<head>
		<title>Blog</title>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="description" content="aStar Fashion Template Project">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" type="text/css" href="styles/bootstrap-4.1.3/bootstrap.css">
		<link href="plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
		<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.carousel.css">
		<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
		<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/animate.css">
		<link rel="stylesheet" type="text/css" href="styles/blog.css">
		<link rel="stylesheet" type="text/css" href="styles/blog_responsive.css">
		<script src="js/jquery-3.2.1.min.js"></script>
	</head>

	<body>

		<div class="super_container">


			<div id="dd_div">
				<script>
					<!--会重新向服务器请求一下 sidebar.jsp页面-->
					$("#dd_div").load("sidebar.jsp");
				</script>

			</div>

			<!-- Home -->

			<div class="home">
				<div class="parallax_background parallax-window" data-parallax="scroll" data-image-src="images/blog.jpg" data-speed="0.8"></div>
				<div class="home_container">
					<div class="home_content">
						<div class="home_title">付款成功</div>
					</div>
				</div>
			</div>

			<!-- Blog -->

			<div class="blog">
				<div class="section_container">
					<div class="container">
						<div class="row">
							<div class="col">

								<h1>付款成功</h1>
							</div>
						</div>
						<div class="row load_more_row">
							<div class="col">
								<div class="load_more_button trans_200 ml-auto mr-auto">
									<a href="index">我还要买</a>
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
		<script src="js/blog.js"></script>
	</body>

</html>