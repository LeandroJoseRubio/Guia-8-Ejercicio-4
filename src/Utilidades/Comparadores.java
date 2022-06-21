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
package Utilidades;

import Entidades.Pelicula;
import java.util.Comparator;

public class Comparadores {

    //• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo 
    //en pantalla.
    public static Comparator<Pelicula> ordenarPeliculasDuracionMayorAMenor = new Comparator<Pelicula>/*Control+Espacio*/() {
        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo
        public int compare(Pelicula t, Pelicula t1) {// Le pasamos dos objetos a comparar
            return t1.getDuracion().compareTo(t.getDuracion()); // Los comparamos usando el get y el compareTo
        }
    }; // Le tengo que agregar el;

    //• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo 
    //en pantalla.
    public static Comparator<Pelicula> ordenarPeliculasDuracionMenorAMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion()); //
        }
    };

    //• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
    public static Comparator<Pelicula> ordenarPeliculasTituloAlfabeticamente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo()); // Los comparamos usando el get y el compareTo
        }
    };
    //• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    public static Comparator<Pelicula> ordenarPeliculasDirectorAlfabeticamente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector()); // Los comparamos usando el get y el compareTo
        }
    };

}
