<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
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
<body id="bodyregistro">
	<!-- jsp:include Trae añ Navbar -->
	<jsp:include page="navbar.jsp"></jsp:include>

	<!-- Formulario Login -->

	<div id="bodylogin">

		<form class="form" id="formlogin" roler="login" action="login"
			method="POST">
			<h2 class="form__title" id="">Inicia Sesion</h2>
			<p class="form__paragraph" id="formparagraphlogin">
				¿Aun no tienes una cuenta? <a href="#" class="form__link"
					id="formlinklogin">Entra aquí</a>
			</p>

			<div class="form__container">

				<div class="form__group">
					<input type="text" id="user" class="form__input" placeholder=" "
						name="username"> <label for="user" class="form__label">Usuario:</label>
					<span class="form__line"></span>
				</div>
				<div class="form__group">
					<input type="password" id="password" class="form__input"
						placeholder=" " name="password"> <label for="password"
						class="form__label">Contraseña:</label> <span class="form__line"></span>
				</div>

				<button class="btn btn-primary" type="submit" value="Entrar">Entrar
				</button>


			</div>


		</form>
	</div>

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