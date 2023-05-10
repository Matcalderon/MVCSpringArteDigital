// Obtener el elemento HTML con id "texto" y almacenarlo en la variable "texto"
const texto = document.getElementById("texto");
// Definir el mensaje que se mostrará en modo máquina de escribir
const mensaje = "Arte Digital";
// Crear una variable "index" para llevar un registro de la posición actual de la letra en el mensaje
let index = 0;

// Función para mostrar la siguiente letra del mensaje
function mostrarSiguienteLetra() {
  // Obtener la letra actual del mensaje utilizando la variable "index"
  const letraActual = document.getElementsByClassName("letra")[index];
  // Cambiar la opacidad de la letra actual a 1 para hacerla visible
  letraActual.style.opacity = "1";
  // Incrementar la variable "index" en 1
  index++;
  // Si se han mostrado todas las letras del mensaje, ocultar el texto después de 500 milisegundos
  if (index >= mensaje.length) {
    setTimeout(ocultarTexto, 500);
  }
}

// Función para mostrar el texto en modo máquina de escribir
function mostrarTexto() {
  // Reiniciar la variable "index" a 0
  index = 0;
  // Establecer la opacidad de todas las letras en el mensaje a 0 (ocultas)
  for (const letra of document.getElementsByClassName("letra")) {
    letra.style.opacity = "0";
  }
  // Después de 500 milisegundos, comenzar a mostrar las letras del mensaje una por una
  setTimeout(() => {
    // Crear un intervalo para mostrar las letras con una frecuencia de 100 milisegundos
    const intervalo = setInterval(() => {
      mostrarSiguienteLetra();
      // Si se han mostrado todas las letras del mensaje, detener el intervalo
      if (index >= mensaje.length) {
        clearInterval(intervalo);
      }
    }, 100);
  }, 500);
}

// Dividir el texto en letras y crear elementos HTML para cada letra
for (const char of mensaje) {
  const letra = document.createElement("span");
  letra.textContent = char;
  letra.classList.add("letra");
  texto.appendChild(letra);
}

// Llamar a la función mostrarTexto() después de un retraso de 1 segundo
setTimeout(mostrarTexto, 500);


 function mostrarCampos() {
			var seleccion = document.getElementById("tipo_usuario").value;
			var campos_cliente = document.getElementById("campos_cliente");
			var campos_administrativo = document.getElementById("campos_administrativo");
			if (seleccion == "cliente") {
				campos_cliente.style.display = "block";
				campos_administrativo.style.display = "none";
			} else if (seleccion == "administrativo") {
				campos_cliente.style.display = "none";
				campos_administrativo.style.display = "block";
			} else {
				campos_cliente.style.display = "none";
				campos_administrativo.style.display = "none";
			}
		}