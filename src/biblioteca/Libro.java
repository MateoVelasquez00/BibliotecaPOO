package biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private boolean prestado;

    public Libro(String titulo, String autor,) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void prestar(){
        if (!prestado){
            prestado = true;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        }else {
            System.out.println("El libro '" + titulo + "' no ha sido prestado.");
        }
    }
    public void devolver(){
        if (prestado){
            prestado = false;
            System.out.println("El libro '" + titulo + "' ha sido devuelto.");
        }else {
            System.out.println("El libro '" + titulo + "' no esta prestado.");
        }
    }

    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo + ", autor: " + autor + ", prestado: " + prestado);
    }
}
