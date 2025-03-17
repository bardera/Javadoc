package Javadoc;

/**
 * Clase que representa a un usuario
 *
 * @author Ismael Bardera
 * @version 1.0
 * @since 2025
 */
public class Usuario {
    private String nombre;
    private int edad;

    /**
     * Constructor de la clase usuario
     *
     * @param nombre Nombre del usuario
     * @param edad Es la edad del usuario
     */

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Obtiene el nombre del usuario
     *
     * @return El nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el usuario
     *
     * @param nombre Es el nuevo nombre del usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
