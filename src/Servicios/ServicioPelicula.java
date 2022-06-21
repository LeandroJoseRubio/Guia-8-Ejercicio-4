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
package Servicios;

import Entidades.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServicioPelicula {

    Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    private ArrayList<Pelicula> pelicula;

    Comparadores comp;

    //Quizas tendria que poner un constructor vacio.
    public ServicioPelicula() {
        this.pelicula = new ArrayList();
        this.comp = new Comparadores();
    }

    public void fabricaPelicula() {
        Pelicula p;
        String Salir = "";
        do {
            p = crearPelicula();
            agregarPelicula(p);
            do {
                System.out.println("¿Desea salir? 'si' o 'no'");
                Salir = Leer.next().toLowerCase();
            } while (Salir.equals("si") == false && Salir.equals("no") == false);
        } while (Salir.equals("no"));
    }

    public Pelicula crearPelicula() {
        Pelicula p;
        System.out.println("Ingrese titulo de la pelicula: ");
        String titulo = Leer.next();
        System.out.println("Ingrese nombre del director de la pelicula: ");
        String director = Leer.next();
        System.out.println("Ingrese la duracion de la pelicula en horas: ");
        Double duracion = Leer.nextDouble();
        p = new Pelicula(titulo, director, duracion);
        return p;
    }

    public void agregarPelicula(Pelicula p) {
        pelicula.add(p);
    }

    //• Mostrar en pantalla todas las películas.
    public void mostrarPeliculas() {
        System.out.println("=========================== Peliculas guardadas =========================");
        int i = 0;
        for (Pelicula pel : pelicula) {
            i += 1;
            System.out.println("La pelicula numero " + i + " es '" + pel.getTitulo() + "' del director '" + pel.getDirector() + "' y tiene una duracion de '" + pel.getDuracion() + "' horas.");
        }
    }

    //• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void mostrarPeliculasMayores1Hs() {
        int cont = 0;
        System.out.println("=========================== Peliculas mayor a 1 hora =========================");
        for (Pelicula pel : pelicula) {
            if (pel.getDuracion() > (1.0)) {
                System.out.println("'" + pel.getTitulo() + "' del director '" + pel.getDirector() + "' y tiene una duracion de '" + pel.getDuracion() + "' horas.");
                cont = 1;
            }
        }
        if (cont == 0) {
            System.out.println("No se encontraron pelicullas mayor a 1 hora.");
        }
    }

    //• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo 
    //en pantalla.
    public void mostrarPeliculasDuracionMayorAMenor() {
        System.out.println("=========================== Las películas de acuerdo a su duración de mayor a menor =========================");
        Collections.sort(pelicula, Comparadores.ordenarPeliculasDuracionMayorAMenor);
        for (Pelicula peli : pelicula) {
            System.out.println(peli);
        }
    }

    //• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo 
    //en pantalla.
    public void mostrarPeliculasDuracionMenorAMayor() {
        System.out.println("=========================== Las películas de acuerdo a su duración de menor a mayor =========================");
        Collections.sort(pelicula, Comparadores.ordenarPeliculasDuracionMenorAMayor);
        for (Pelicula peli : pelicula) {
            System.out.println(peli);
        }
    }

    //• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
    public void mostrarPeliculasTituloAlfabeticamente() {
        System.out.println("=========================== Las películas por titulo alfabéticamente =========================");
        Collections.sort(pelicula, Comparadores.ordenarPeliculasTituloAlfabeticamente);
        for (Pelicula peli : pelicula) {
            System.out.println(peli);
        }
    }

    //• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    public void mostrarPeliculasDirectorAlfabeticamente() {
        System.out.println("=========================== Las películas por director alfabéticamente =========================");
        Collections.sort(pelicula, Comparadores.ordenarPeliculasDirectorAlfabeticamente);
        for (Pelicula peli : pelicula) {
            System.out.println(peli);
        }
    }

}
