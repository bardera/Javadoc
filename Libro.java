package Javadoc;

/**
 * Clase que representa el libro
 *
 * @author Ismael Bardera
 * @version 1.0
 * @since 2025
 */
public class Libro {
    private String titulo;
    private String autor;

    /**
     * Constructor de la clase Libro
     *
     * @param titulo Titulo del libro
     * @param autor Autor del libro
     */
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    /**
     * Obtiene el título del libro
     *
     * @return El titulo del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece un nuevo título para el libro
     *
     * @param titulo Nuevo título del libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el autor del libro
     *
     * @return el autor del libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece el nuevo autor del libro
     *
     * @param autor Nuevo autor del libro
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
}
