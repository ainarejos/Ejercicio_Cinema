class Pelicula {
    private String titulo;
    private int duracion;
    private int edad_minima;
    private String director;

    public Pelicula(String titulo, int duracion, int edad_minima, String director){
        this.titulo=titulo;
        this.duracion=duracion;
        this.edad_minima=edad_minima;
        this.director=director;
    }

    public String getTitulo() {
        return titulo;
    }
    public int getEdad_minima() {
        return edad_minima;
    }

}
