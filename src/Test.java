public class Test {
    public static void main(String[] args) { ;
        long tStart, Tlong, TEnd;
        tStart=System.currentTimeMillis();
        Pelicula Endgame = new Pelicula("Endgame", 180, 14, "Hermanos Russo");
        Cine Ocimax = new Cine(Endgame, 8);
        Espectador tofol = new Espectador();
        Asientos butacas= new Asientos();
        butacas.ocuparAsiento(tofol, butacas, Endgame, Ocimax);
        TEnd=System.currentTimeMillis();
        Tlong=(TEnd-tStart);
        System.out.println(Tlong);
        }
    }
