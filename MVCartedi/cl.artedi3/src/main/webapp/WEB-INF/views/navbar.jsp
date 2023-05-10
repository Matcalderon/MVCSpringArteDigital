<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="<c:url value='/'/>"> <img
			src="<c:url value='/resources/images/logo.png'/>"
			alt="Logo de la empresa" width="70" height="40">
		</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link" aria-current="page"
					href="<c:url value='/'/>">Inicio</a></li>
				<li class="nav-item"><a class="nav-link"
					href="<c:url value='/contacto'/>">Contacto</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#"
					role="button" aria-expanded="false">Usuarios</a>
					<ul class="dropdown-menu" id="dropdownmenu1">
						<li><a class="dropdown-item"
							href="<c:url value='/usuarios/listarUsuarios'/>">Listar</a></li>
						<li><a class="dropdown-item"
							href="<c:url value='/usuarios/editarUsuario'/>">Editar</a></li>
						<li><a class="dropdown-item"
							href="<c:url value='/usuarios/eliminarUsuario'/>">Eliminar</a></li>
					</ul></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#"
					role="button" aria-expanded="false">Galeria</a>
					<ul class="dropdown-menu" id="dropdownmenu1">
						<li><a class="dropdown-item" href="<c:url value='/galeria'/>">Arte
								Digital</a></li>
					</ul></li>
			</ul>
			<div class="loginSector d-flex">
				<%
				String username = (String) session.getAttribute("username");
				%>
				<%
				if (username != null) {
				%>
				<div class="d-flex ms-auto">
					<p class="nav-link" id="texlogin">
						Welcome,&nbsp;<%=username%></p>
					<form action="logout" method="POST">
						<button id="btnlogout" class="btn btn-outline-success btn-sm"
							type="submit">Logout</button>
					</form>
				</div>
				<%
				} else {
				%>
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link"
						href="<c:url value='/login'/>">Login</a></li>
					<li class="nav-item"><a class="nav-link"
						href="<c:url value='/usuarios/crearUsuario'/>">Registrarse</a></li>
				</ul>
				<%
				}
				%>
			</div>
		</div>
	</div>
</nav>
<c:if test="${not empty message}">
	<div id="popupbadlogin"
		class="alert alert-dismissible alert-danger d-flex">
		<button type="button" class="btn-close" data-bs-dismiss="alert"></button>
		${message}
	</div>
</c:if>
