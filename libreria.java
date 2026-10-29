public class libreria {
    private String titulo;
    private String editorial;
    private String autor;
    private String precio;

    public libreria(String titulo, String editorial, String autor, String precio) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.autor = autor;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getAutor() {
        return autor;
    }

    public String getPrecio() {
        return precio;
    }
}
