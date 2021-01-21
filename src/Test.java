public class Test {
    public static void main(String[] args) {
        int i=0;
        Pelicula Endgame = new Pelicula("Endgame", 180, 14, "Hermanos Russo");
        Cine Ocimax = new Cine(Endgame, 8);
        Asientos butacas= new Asientos();
        Espectador tofol=new Espectador();
        //butacas.acuparAsiento(0);
        butacas.comprovarButaca(i);
        System.out.println(tofol.getEdad() + " " + tofol.getDinero());
        if ((tofol.getEdad()>=Endgame.getEdad_minima())&&(tofol.getDinero()>=Ocimax.getPrecio()&&(butacas.getDisponibilidad()))){
            butacas.acuparAsiento(i);
        }
        //Comprobador
        for (int j = 0; j <butacas.getButacas().length ; j++) {
            System.out.println(butacas.getButacas()[j]);
        }
    }
}
