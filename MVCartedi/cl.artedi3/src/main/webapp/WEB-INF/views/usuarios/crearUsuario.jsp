<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <!--   etiquetas de Bootstrap  -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="../resources/style.css">

  <!--   Iconos de footer -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
<title>Crear Usuario</title>
</head>
<body>
<!--            Navbar          -->
  <nav>
  <%@include file="../navbar.jsp"%>
  </nav>
  
    <!-- Cuerpo de la Pagina  -->
  <div class="container">
	<h2>Crear Usuario</h2>
	<form action="crearUsuario" method="POST"> 
		<div class="mb-3">
			<label for="tipo_usuario" class="form-label">Tipo de usuario:</label>
			<select id="tipo_usuario" class="form-select" onchange="mostrarCampos()" name="tipo_usuario">
				<option value="">Seleccione una opción</option>
				<option value="cliente">Cliente</option>
				<option value="administrativo">Administrativo</option>
			</select>
		</div>

		<!-- Campos fijos para todos los usuarios -->
		<div class="mb-3">
			<label for="username" class="form-label">Username:</label>
			<input type="text" class="form-control" id="username" name="username">
		</div>
		<div class="mb-3">
			<label for="nombre" class="form-label">Nombre:</label>
			<input type="text" class="form-control" id="nombre" name="nombre">
		</div>
		<div class="mb-3">
			<label for="apellido" class="form-label">Apellido:</label>
			<input type="text" class="form-control" id="apellido" name="apellido">
		</div>
		<div class="mb-3">
			<label for="fechanacimiento" class="form-label">Fecha Nacimiento:</label>
			<input type="date" class="form-control" id="fechanacimiento" name="fechanacimiento">
		</div>
		<div class="mb-3">
			<label for="run" class="form-label">RUN:</label>
			<input type="text" class="form-control" id="run" name="run" placeholder="12345678-K" pattern="^[0-9]+-[0-9kK]{1}$">
		</div>
		<div class="mb-3">
			<label for="clave" class="form-label">Contraseña:</label>
			<input type="password" class="form-control" id="clave" name="clave">
		</div>

		<div id="campos_cliente" style="display: none;">
			<div class="mb-3">
				<label for="telefono" class="form-label">Telefono:</label>
				<input type="tel" class="form-control" id="telefono" name="telefono">
			</div>
			<div class="mb-3">
				<label for="email" class="form-label">Correo electrónico:</label>
				<input type="email" class="form-control" id="email" name="email">
			</div>
			<!-- Otros campos para clientes -->
		</div>

		<div id="campos_administrativo" style="display: none;">
			<div class="mb-3">
				<label for="area" class="form-label">Area:</label>
				<input type="text" class="form-control" id="area" name="area">
			</div>
		</div>

		<button type="submit" class="btn btn-success btn-block">Registrarse</button>
	</form>
</div><br><br>
<!-- Agregar un espacio en blanco  -->
<div style="margin-top: 50px;"></div>

<!--  relleno (padding) -->
<div style="padding-top: 50px;"></div>

  <!------------------ Footer ----------------->

 
  <%@include file="../Footer.jsp" %>
 
  
<script src="../resources/js/main.js"></script>
 <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js"
    integrity="sha384-zYPOMqeu1DAVkHiLqWBUTcbYfZ8osu1Nd6Z89ify25QV9guujx43ITvfi12/QExE"
    crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js"
    integrity="sha384-Y4oOpwW3duJdCWv5ly8SCFYWqFDsfob/3GkgExXKV4idmbt98QcxXYs9UoXAB7BZ"
    crossorigin="anonymous"></script>
</body>
</html>