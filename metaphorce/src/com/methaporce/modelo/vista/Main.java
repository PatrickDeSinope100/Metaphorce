package com.methaporce.vista;

import com.methaporce.modelo.GestorPelicula;
import com.methaporce.modelo.Pelicula;
import java.util.List;

/**
 * Clase principal para demostrar el funcionamiento del gestor de películas
 */
public class Main {
    public static void main(String[] args) {
        // Crear el gestor de películas
        GestorPelicula gestor = new GestorPelicula();

        // Agregar algunas películas
        gestor.agregarPelicula(new Pelicula(1, "El Padrino", true));
        gestor.agregarPelicula(new Pelicula(2, "Pulp Fiction", false));
        gestor.agregarPelicula(new Pelicula(3, "El Señor de los Anillos", true));
        gestor.agregarPelicula(new Pelicula(4, "Interestelar", false));
        gestor.agregarPelicula(new Pelicula(5, "Matrix", true));

        // Mostrar todas las películas
        System.out.println("=== TODAS LAS PELÍCULAS ===");
        imprimirPeliculas(gestor.obtenerPeliculas());

        // Eliminar una película (ID 3)
        gestor.eliminarPelicula(3);
        System.out.println("\n=== DESPUÉS DE ELIMINAR ID 3 ===");
        imprimirPeliculas(gestor.obtenerPeliculas());

        // Marcar película ID 2 como disponible
        gestor.marcarPeliculaComoDisponible(2);
        System.out.println("\n=== DESPUÉS DE MARCAR ID 2 COMO DISPONIBLE ===");
        imprimirPeliculas(gestor.obtenerPeliculas());

        // Mostrar películas no disponibles
        System.out.println("\n=== PELÍCULAS NO DISPONIBLES ===");
        imprimirPeliculas(gestor.obtenerPeliculasNoDisponibles());
    }

    /**
     * Método auxiliar para imprimir una lista de películas
     * @param peliculas Lista de películas a imprimir
     */
    private static void imprimirPeliculas(List<Pelicula> peliculas) {
        if (peliculas.isEmpty()) {
            System.out.println("No hay películas en la lista.");
        } else {
            for (Pelicula p : peliculas) {
                System.out.println(p);
            }
        }
    }
}