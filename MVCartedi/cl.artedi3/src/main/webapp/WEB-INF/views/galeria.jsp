<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>Galeria</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
  integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="resources/style.css">
<!-- iconos -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
<body id="bodygaleria2">

<!-- jsp:include Trae al Navbar -->
<jsp:include page="navbar.jsp"></jsp:include>

<!-- cuerpo Galeria -->
  <div class="filter-buttons" id="botonesgaleria">
    <button class="filter-button" data-filter="all">All</button>
    <button class="filter-button" data-filter="personas">Personas</button>
    <button class="filter-button" data-filter="animals">Animals</button>
    <button class="filter-button" data-filter="food">Food</button>
  </div>
   <!-- Imagen ejemploo -->
  <div class="gallery" id="imagesgaleria">
    <div class="gallery-item personas" >
      <img src="resources/images/persona1.jpg" id="image-1">
    </div>
    <!-- Contenedor para imagen en grande, formulario y cuadro de mensajes -->
<div id="image-modal" class="modal">
  <div class="modal-content">
    <span class="close">&times;</span>
    <img id="large-image" src="">
    <div class="message-box">
      <h4>Ideas o Prompt:</h4>
      <div id="sent-messages"></div>
    </div>
    <form id="message-form">
      <label for="message">Enviar mensaje:</label>
      <input type="text" id="message" name="message">
      <button type="submit">Enviar</button>
    </form>
  </div>
   <!-- Continuacion de imagenes  -->
</div>
    <div class="gallery-item animals">
      <img src="resources/images/animal1.jpg" id="image-2">
    </div>
    <div class="gallery-item food">
      <img src="resources/images/food4.jpg"id="image-3">
    </div>
    <div class="gallery-item personas">
      <img src="resources/images/persona5.jpg"id="image-4">
    </div>
    <div class="gallery-item food">
      <img src="resources/images/food1.jpg"id="image-5">
    </div>
    <div class="gallery-item personas">
      <img src="resources/images/persona3.jpg"id="image-6">
    </div>
    <div class="gallery-item animals">
      <img src="resources/images/animal2.jpg"id="image-7">
    </div>
    <div class="gallery-item animals">
      <img src="resources/images/animal3.jpg"id="image-8">
    </div>
    <div class="gallery-item food">
      <img src="resources/images/food2.jpg"id="image-9">
    </div>
    <div class="gallery-item food">
      <img src="resources/images/food3.jpg"id="image-10">
    </div>
    <div class="gallery-item animals">
      <img src="resources/images/animal4.jpg"id="image-11">
    </div>
    <div class="gallery-item personas">
      <img src="resources/images/persona4.jpg"id="image-1">
    </div>
  </div>
<!-- Footer -->
<jsp:include page="Footer.jsp"></jsp:include>
<!-- Etiquetas Script para Bootstrap -->
<script src="resources/js/script.js"></script>
<script src="resources/js/js.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js" integrity="sha384-zYPOMqeu1DAVkHiLqWBUTcbYfZ8osu1Nd6Z89ify25QV9guujx43ITvfi12/QExE" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js" integrity="sha384-Y4oOpwW3duJdCWv5ly8SCFYWqFDsfob/3GkgExXKV4idmbt98QcxXYs9UoXAB7BZ" crossorigin="anonymous"></script>
</body>
</html>