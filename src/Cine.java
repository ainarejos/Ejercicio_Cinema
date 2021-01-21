class Cine {
    private String Pelicula;
    private int Precio;

    public Cine(Pelicula pelicula, int Precio){
        this.Pelicula=pelicula.getTitulo();
        this.Precio=Precio;
    }
    public int getPrecio() {
        return Precio;
    }
    public String getPelicula() {
        return Pelicula;
    }
}
