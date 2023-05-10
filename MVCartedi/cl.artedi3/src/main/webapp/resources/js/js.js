// Esperar a que se cargue la página
window.onload = function() {
	// Seleccionar elementos HTML
	var filterButtons = document.querySelectorAll('.filter-button');
	var galleryItems = document.querySelectorAll('.gallery-item');

	// ----------------Añadir evento click a los botones de filtro-----------------------
	filterButtons.forEach(function(button) {//forEach() para iterar sobre cada botón en un arreglo llamado filterButtons.
		button.addEventListener('click', function() { //event listener está a la espera de que el usuario haga clic en el botón.
			var filter = this.getAttribute('data-filter'); //Cuando el usuario hace clic en el botón, se ejecuta otra función anonima que obtiene el valor del atributo data-filter del botón haciendo uso del método getAttribute()
			filterItems(filter);// función llamada filterItems() y se le pasa como argumento el valor del filtro que se acaba de obtener. Esta función es la encargada de aplicar el filtro a la lista de elementos correspondiente en la página.
		});
	});

	// --------------Filtrar las imágenes y aplicar animaciones ---------------------


	function filterItems(filter) {// función llamada filterItems() que recibe un argumento llamado filter, que representa el filtro que se debe aplicar a una lista de elementos en la pagina.
		galleryItems.forEach(function(item) {

			/* Este bloque if-else aplica una animación de aparición y hace visible un elemento si el filtro coincide, y 
			aplica una animación de desvanecimiento y oculta el elemento si el filtro no coincide..*/

			/*si la variable filter es igual a la cadena 'all' o si el elemento item contiene una clase que coincide con el valor de filter. 
			Si alguna de estas condiciones es verdadera, se va aplicar la animacion de aparicion.*/
			if (filter === 'all' || item.classList.contains(filter)) {
				item.style.animation = 'fadeIn 1s ease';// Aplica animacion animación de aparición (fadeIn) al elemento item con una duración de 1 segundo y ease. Esta animación hará que el elemento aparezca suavemente en la pantalla.
				item.style.display = 'block';//Cambia la propiedad CSS display del elemento item a 'block', haciendo que el elemento sea visible en la pantalla.
			} else {
				item.style.animation = 'fadeOut 1s ease';// Aplica una animación de desvanecimiento (fadeOut) al elemento item con una duración de 1 segundo y una función de tiempo de ease. Esta animación hará que el elemento desaparezca suavemente de la pantalla.
				setTimeout(function() {
					item.style.display = 'none';//ocultando el elemento de la pantalla. Este cambio de propiedad se realizará después de 0.5 segundos.
				}, 500);
			}
		});
	}
}