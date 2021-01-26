public class Test {
    public static void main(String[] args) { ;
        Pelicula Endgame = new Pelicula("Endgame", 180, 14, "Hermanos Russo");
        Cine Ocimax = new Cine(Endgame, 8);
        Espectador tofol = new Espectador();
        Asientos butacas= new Asientos();
        butacas.ocuparAsiento(tofol, butacas, Endgame, Ocimax);
        }
    }
