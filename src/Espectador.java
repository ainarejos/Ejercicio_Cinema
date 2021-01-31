class Espectador {
    //Atributos.
    private int edad;
    private int dinero;

    //Cosntructor
    public Espectador(){
        this.edad=(int)(Math.random()*100);
        this.dinero=(int)(Math.random()*20);
    }

    //Getters.
    public int getEdad() {
        return edad;
    }
    public int getDinero() {
        return dinero;
    }
}
