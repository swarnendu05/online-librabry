<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Library Management System</title>
<link rel="stylesheet" href="homStyle.css" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous" />
</head>

<body>

	<jsp:include page="nevber.jsp" />


	<div class="container">
		<!-- <a class="navbar-brand" href="#"><h3>Books Bank!</h3></a> -->
	</div>


	<!-- carousel slider -->

	<div id="carouselExampleAutoplaying"
		class="carousel slide carousel-fade" data-bs-ride="carousel">
		<!-- <div class="carousel-inner area">
        
        <div id="carouselExampleDark" class="carousel carousel-dark slide"> -->
		<div class="carousel-indicators ">
			<button type="button" data-bs-target="#carouselExampleDark"
				data-bs-slide-to="0" class="active" aria-current="true"
				aria-label="Slide 1"></button>
			<button type="button" data-bs-target="#carouselExampleDark"
				data-bs-slide-to="1" aria-label="Slide 2"></button>
			<button type="button" data-bs-target="#carouselExampleDark"
				data-bs-slide-to="2" aria-label="Slide 3"></button>
		</div>
		<div class="carousel-inner area ">
			<div class="carousel-item active" data-bs-interval="10000">
				<img src="../img/5.jpeg" class="d-block w-100 " alt="First Slider" />
				<div class="carousel-caption d-none d-md-block">
					<h5 class="slide-text">Welcome to Our Library</h5>
					<p class="slide-text">Keep Learning keep Exploring</p>
					<button class="btn btn-danger">Technology</button>
					<button class="btn btn-primary">Advance Tech.</button>
					<button class="btn btn-success">Humanities</button>
				</div>
			</div>

		</div>

	</div>


	<div class="album py-5 bg-light">
		<div class="container border-up ">
			<h3 class="my-3 heading">Our Collaction</h3>
		</div>

		<div class="container">
			<div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">

				<div class="col">

					<div class="card shadow-sm">
						<img src="../img/th1.jpeg" alt="" class="set-width img-hover">

						<rect width="100%" height="100%" fill="#55595c"></rect>
						</svg>
						<div class="card-body">
							<p class="card-text">This is a wider card with supporting
								text below as a natural lead-in to additional content. This
								content is a little bit longer.</p>
							<div class="d-flex justify-content-between align-items-center">
								<div class="btn-group">
									<button type="button" class="btn btn-sm btn-outline-secondary">
										View...</button>

								</div>
								<small class="text-muted">9 mins</small>
							</div>
						</div>
					</div>

				</div>


				<div class="col">
					<div class="card shadow-sm">
						<img src="../img/th2.jpeg" alt="" class="set-width img-hover">
						<title>Placeholder</title>
						<rect width="100%" height="100%" fill="#55595c"></rect>
						<!-- <text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text> -->

						<div class="card-body">
							<p class="card-text">This is a wider card with supporting
								text below as a natural lead-in to additional content. This
								content is a little bit longer.</p>
							<div class="d-flex justify-content-between align-items-center">
								<div class="btn-group">
									<button type="button" class="btn btn-sm btn-outline-secondary">
										View...</button>

								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card shadow-sm ">
						<img src="../img/th5.jpeg" alt="" class="set-width img-hover">
						<title>Placeholder</title>
						<rect width="100%" height="100%" fill="#55595c"></rect>

						</svg>
						<div class="card-body">
							<p class="card-text">This is . a wider card with supporting
								text below as a natural lead-in to additional content. This
								content is a little bit longer.</p>
							<div class="d-flex justify-content-between align-items-center">
								<div class="btn-group">
									<button type="button" class="btn btn-sm btn-outline-secondary">
										View...</button>

								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="col">
					<div class="card shadow-sm">
						<img src="../img/th8.jpeg " alt=""
							class="set-width select-hi img-hover">
						<div class="card-body">
							<p class="card-text">This is a wider card with supporting
								text below as a natural lead-in to additional content. This
								content is a little bit longer.</p>
							<div class="d-flex justify-content-between align-items-center">
								<div class="btn-group">
									<button type="button" class="btn btn-sm btn-outline-secondary">
										View...</button>

									Edit
									</button>
									-->
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card shadow-sm">
						<img src="../img/th3.jpeg" alt=""
							class="set-width select-hi img-hover">
						<div class="card-body">
							<p class="card-text">This is a wider card with supporting
								text below as a natural lead-in to additional content. This
								content is a little bit longer.</p>
							<div class="d-flex justify-content-between align-items-center">
								<div class="btn-group">
									<button type="button" class="btn btn-sm btn-outline-secondary">
										View...</button>

								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card shadow-sm">
						<img src="../img/th7.jpeg" alt=""
							class="set-width select-hi img-hover">
						<div class="card-body">
							<p class="card-text">This is a wider card with supporting
								text below as a natural lead-in to additional content. This
								content is a little bit longer.</p>
							<div class="d-flex justify-content-between align-items-center">
								<div class="btn-group">
									<button type="button" class="btn btn-sm btn-outline-secondary">
										View...</button>

								</div>
							</div>
						</div>
					</div>
				</div>




			</div>


			<!-- footer- mid -->
			<div class="container my-3">
				<div class="card text-center">
					<!-- <div class="card-header">
      Featured
    </div> -->
					<div class="card-body">
						<h5 class="card-title">Special title treatment</h5>
						<p class="card-text">With supporting text below as a natural
							lead-in to additional content.</p>
						<a href="#" class="btn btn-primary">Back to top</a>
					</div>

				</div>
			</div>
			<!-- footer-
    <footer class="log-footer">
      <p>This is a central Library <a href="https://getbootstrap.com/">Books Bank</a> by <a href="//">@mdo</a>.</p>
      <p>
        <a href="#">Back to top</a>
      </p> 
    </footer> -->

			<script
				src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
				integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
				crossorigin="anonymous"></script>




			<!-- Copyright -->
			<div class="text-center p-3"
				style="background-color: rgba(0, 0, 0, 0.2);">
				© 2023 Copyright: <a class="text-dark" href="">swarnendu20</a>
			</div>
			<!-- Copyright -->
			</footer>

		</div>
</body>

</html>