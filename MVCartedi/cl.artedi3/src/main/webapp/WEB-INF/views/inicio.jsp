<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ArtDi</title>
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="resources/style.css">
<!-- iconos -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
<body id="bodyinicio">
	<!-- jsp:include Trae al Navbar -->
	<jsp:include page="navbar.jsp"></jsp:include>

	<!-- Primer Parrafo con descripcion de la aplicacion web -->
	<div class="container" id="parrafo1">
		<div class="row">
			<div class="col-md-6">
				<div class="image-container">
					<div class="card" id="imagencarta1">
						<img src="resources/images/oleo1.png"
							alt="Descripción de la imagen" class="img-fluid d-block">
						<div class="card-info" id="imagencartainfo">
							<h2>
								<b>Pintura al oleo</b>
							</h2>
							<p>Estilo de pintura con detalle fino digital</p>
						</div>
					</div>

				</div>
			</div>
			<div class="col-md-6">
			<h2> <b id="texto"></b></h2>
				<p>Bienvenido a nuestra aplicación web. Estamos emocionados de
					presentarles una plataforma diseñada específicamente para compartir
					promps o ideas basadas en imágenes digitales creadas con
					inteligencia artificial. En nuestra aplicación, los usuarios tienen
					la oportunidad de compartir y explorar una amplia gama de imágenes
					digitales generadas por algoritmos de inteligencia artificial.
					Desde paisajes y retratos hasta abstracciones y arte conceptual,
					nuestra comunidad ofrece una amplia gama de estilos y técnicas.</p>
				<p>Además, nuestra plataforma está diseñada para fomentar la
					colaboración y el intercambio de ideas. Los usuarios pueden
					comentar y calificar lo que fomenta un diálogo constructivo y
					creativo en torno a la tecnología y la creatividad.</p>
				<a href="galeria" class="btn btn-primary" id="botongaleria">Ver
					galería</a>
			</div>
		</div>
	</div>
	<br>

	<!-- Imagen Estatica -->

	<div class="overlay"></div>
	<div class="container">
		<div class="row">
			<div class="bg-img"
				style="background-image: url('resources/images/estatica.png')"
				id="matias">
				<div class="col-md-8 mx-auto text-center">
					<h1 class="mt-5" id="letraestatica">Arte digital</h1>
					<p class="lead" id="letraestatica">El arte digital es una forma
						de arte que utiliza tecnología digital para crear obras de arte.</p>
				</div>
			</div>
		</div>
	</div>
	<br>

	<!-- Seccion Galeria de Imagenes -->


	<div class="container">
		<div class="row">
			<div class="col">
				<h2>Galería de arte digital</h2>
				<div class="row row-cols-1 row-cols-md-3 g-4">
					<!-- Seccion Galeria de Imagen 1 -->
					<div class="col" id="tituloGaleria">
						<div class="card">
							<img src="resources/images/inicio1.jpg" class="card-img-top"
								alt="Descripción de la imagen 1" data-bs-toggle="modal"
								data-bs-target="#imagen1" id="matisan">
							<div class="modal fade" id="imagen1" tabindex="-1"
								aria-labelledby="imagen1Label" aria-hidden="true">
								<div class="modal-dialog modal-lg">
									<div class="modal-content">
										<div class="modal-header">
											<h5 class="modal-title" id="imagen1Label">NeonELF</h5>
											<button type="button" class="btn-close"
												data-bs-dismiss="modal" aria-label="Cerrar"></button>
										</div>
										<div class="modal-body">
											<img src="resources/images/inicio1.jpg"
												class="img-fluid rounded mb-3"
												alt="Descripción de la imagen 1">
											<p class="fw-bold mb-0">Autor: Shown</p>
											<p>
												<b>Prompt: </b>neon ambiance, abstract black oil, gear
												mecha, detailed acrylic, grunge, intricate complexity,
												rendered in unreal engine, photorealistic
											</p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<!-- Seccion Galeria de Imagen 2 -->
					<div class="col" id="tituloGaleria2">
						<div class="card">
							<img src="resources/images/inicio2.jpg" class="card-img-top"
								alt="Descripción de la imagen 2" data-bs-toggle="modal"
								data-bs-target="#imagen2" id="vangogh">
							<div class="modal fade" id="imagen2" tabindex="-1"
								aria-labelledby="imagen2Label" aria-hidden="true">
								<div class="modal-dialog modal-lg">
									<div class="modal-content">
										<div class="modal-header">
											<h5 class="modal-title" id="imagen2Label">ColorBi</h5>
											<button type="button" class="btn-close"
												data-bs-dismiss="modal" aria-label="Cerrar"></button>
										</div>
										<div class="modal-body">
											<img src="resources/images/inicio2.jpg"
												class="img-fluid rounded mb-3"
												alt="Descripción de la imagen 2">
											<p class="fw-bold mb-0">Autor: Sana</p>
											<p>
												<b>Prompt: </b>Explosion color marigold flowers :: intricate
												:: smoke :: shiny --ar 9:16 --uplight
											</p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<!-- Seccion Galeria de Imagen 3 -->

					<div class="col" id="tituloGaleria3">
						<div class="card">
							<img src="resources/images/inicio3.jpg" class="card-img-top"
								alt="Descripción de la imagen 3" data-bs-toggle="modal"
								data-bs-target="#imagen3" id="rembrandt">
							<div class="modal fade" id="imagen3" tabindex="-1"
								aria-labelledby="imagen3Label" aria-hidden="true">
								<div class="modal-dialog modal-lg">
									<div class="modal-content">
										<div class="modal-header">
											<h5 class="modal-title" id="imagen3Label">GirolBorg</h5>
											<button type="button" class="btn-close"
												data-bs-dismiss="modal" aria-label="Cerrar"></button>
										</div>
										<div class="modal-body">
											<img src="resources/images/inicio3.jpg"
												class="img-fluid rounded mb-3"
												alt="Descripción de la imagen 3">
											<p class="fw-bold mb-0">Autor: JHawkk</p>
											<p>
												<b>Prompt:</b> full body cyborg| full-length portrait|
												detailed face| symmetric| steampunk| cyberpunk| cyborg|
												intricate detailed| to scale| hyperrealistic| cinematic
												lighting| digital art| concept art| mdjrny-v4 style
											</p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<!-- Cierre de la sección de la galería -->
				</div>
			</div>
		</div>
	</div>
	<br>
	<br>


	<!-- Footer -->
	<jsp:include page="Footer.jsp"></jsp:include>


	<!-- Etiquetas Script para Bootstrap -->
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js"
		integrity="sha384-zYPOMqeu1DAVkHiLqWBUTcbYfZ8osu1Nd6Z89ify25QV9guujx43ITvfi12/QExE"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js"
		integrity="sha384-Y4oOpwW3duJdCWv5ly8SCFYWqFDsfob/3GkgExXKV4idmbt98QcxXYs9UoXAB7BZ"
		crossorigin="anonymous"></script>
		<script src="resources/js/main.js"></script>
</body>
</html>