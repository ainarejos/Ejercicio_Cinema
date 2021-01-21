public class Test {
    public static void main(String[] args) {
        int i=0;
        Pelicula Endgame = new Pelicula("Endgame", 180, 14, "Hermanos Russo");
        Cine Ocimax = new Cine(Endgame, 8);
        Asientos butacas= new Asientos();

        while (butacas.getButacas()[i]==0){
            i++;
            if (i==79){
                i=0;
            }
        }
    }
}
