/*

Guia 8 Colecciones Ejercicio 4

Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
cuenta lo que se pide a continuación:
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo 
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo 
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.

 */
package guia.pkg8.colecciones.ejercicio.pkg4;

import Servicios.ServicioPelicula;

public class Guia8ColeccionesEjercicio4 {

    public static void main(String[] args) {

        ServicioPelicula sp = new ServicioPelicula();

        sp.fabricaPelicula();
        sp.mostrarPeliculas();
        sp.mostrarPeliculasMayores1Hs();
        sp.mostrarPeliculasDuracionMayorAMenor();
        sp.mostrarPeliculasDuracionMenorAMayor();
        sp.mostrarPeliculasTituloAlfabeticamente();
        sp.mostrarPeliculasDirectorAlfabeticamente();

    }

}
