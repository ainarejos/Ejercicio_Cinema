class Espectador {
    private int edad;
    private int dinero;

    public Espectador(){
        this.edad=(int)(Math.random()*100);
        this.dinero=(int)(Math.random()*20);
    }

    public int getEdad() {
        return edad;
    }
    public int getDinero() {
        return dinero;
    }
}
