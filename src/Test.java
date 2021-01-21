public class Test {
    public static void main(String[] args) { ;
        Pelicula Endgame = new Pelicula("Endgame", 180, 14, "Hermanos Russo");
        Cine Ocimax = new Cine(Endgame, 8);
        Espectador tofol = new Espectador();
        Asientos butacas= new Asientos();
        while (){
            int i=(int)(Math.random()*72);
            tofol=new Espectador();
            butacas.comprovarButaca(i);
            System.out.println(tofol.getEdad() + " " + tofol.getDinero());
            if ((tofol.getEdad()>=Endgame.getEdad_minima())&&(tofol.getDinero()>=Ocimax.getPrecio()&&(butacas.getDisponibilidad()))){
                butacas.ocuparAsiento(i);
            }
            for (int j = 0; j <butacas.getButacas().length ; j++) {
                System.out.println(butacas.getButacas()[j]);
            }
        }
        //butacas.acuparAsiento(0);

        }
        //Comprobador


    }
}
