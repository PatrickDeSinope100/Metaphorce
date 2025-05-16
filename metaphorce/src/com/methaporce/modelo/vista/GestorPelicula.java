package com.methaporce.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para gestionar una colección de películas
 */
public class GestorPelicula {
    private List<Pelicula> peliculas;

    /**
     * Constructor que inicializa la lista de películas
     */
    public GestorPelicula() {
        this.peliculas = new ArrayList<>();
    }

    /**
     * Agrega una nueva película a la colección
     * @param pelicula Película a agregar
     */
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    /**
     * Elimina una película por su ID
     * @param id ID de la película a eliminar
     * @return true si se eliminó, false si no se encontró
     */
    public boolean eliminarPelicula(int id) {
        return peliculas.removeIf(p -> p.getId() == id);
    }

    /**
     * Obtiene todas las películas
     * @return Lista de todas las películas
     */
    public List<Pelicula> obtenerPeliculas() {
        return new ArrayList<>(peliculas);
    }

    /**
     * Obtiene solo las películas disponibles
     * @return Lista de películas disponibles
     */
    public List<Pelicula> obtenerPeliculasDisponibles() {
        List<Pelicula> disponibles = new ArrayList<>();
        for (Pelicula p : peliculas) {
            if (p.isDisponible()) {
                disponibles.add(p);
            }
        }
        return disponibles;
    }

    /**
     * Obtiene solo las películas no disponibles
     * @return Lista de películas no disponibles
     */
    public List<Pelicula> obtenerPeliculasNoDisponibles() {
        List<Pelicula> noDisponibles = new ArrayList<>();
        for (Pelicula p : peliculas) {
            if (!p.isDisponible()) {
                noDisponibles.add(p);
            }
        }
        return noDisponibles;
    }

    /**
     * Marca una película como disponible por su ID
     * @param id ID de la película a marcar como disponible
     * @return true si se actualizó, false si no se encontró
     */
    public boolean marcarPeliculaComoDisponible(int id) {
        for (Pelicula p : peliculas) {
            if (p.getId() == id) {
                p.setDisponible(true);
                return true;
            }
        }
        return false;
    }
}