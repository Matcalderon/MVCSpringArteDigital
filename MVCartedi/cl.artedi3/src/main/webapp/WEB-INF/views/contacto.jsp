<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contacto</title>
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

<body id="bodycontacto">
	<!-- jsp:include Trae al Navbar -->
	<jsp:include page="navbar.jsp"></jsp:include>

	<!-- Formulario de contacto -->

	<div class="container my-5">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1>Contactanos</h1>
				<form action="enviar.php" method="POST">
					<div class="mb-3">
						<label for="nombre" class="form-label">Nombre:</label> <input
							type="text" class="form-control" id="nombre" name="nombre"
							required>
					</div>
					<div class="mb-3">
						<label for="email" class="form-label">Email:</label> <input
							type="email" class="form-control" id="email" name="email"
							required>
					</div>
					<div class="mb-3">
						<label for="mensaje" class="form-label">Mensaje:</label>
						<textarea class="form-control" id="mensaje" name="mensaje"
							rows="5" required></textarea>
					</div>
					<button type="submit" class="btn btn-primary">Enviar</button>
				</form>
			</div>
		</div>
	</div>
	<br>
	<br>
	<div class="white-space"></div>


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

</body>
</html>