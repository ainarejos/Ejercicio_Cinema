class Cine {
    //Atributos.
    private String Pelicula;
    private int Precio;

    //Constructor.
    public Cine(Pelicula pelicula, int Precio){
        this.Pelicula=pelicula.getTitulo();
        this.Precio=Precio;
    }
    //Getters.
    public int getPrecio() {
        return Precio;
    }
    public String getPelicula() {
        return Pelicula;
    }
}
