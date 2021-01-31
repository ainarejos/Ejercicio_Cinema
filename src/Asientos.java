public class Asientos {
    //Atributos.
    private int[] butacas=new int[72];

    //Constructor
    public Asientos(){};


    //Metodo combrobar butaca
    public boolean comprovarButaca(int posicion){
         boolean disponibilidad=true;
        if (butacas[posicion]==1){
            disponibilidad=false;
        }
        return disponibilidad;
    }

    public boolean comprovadorLlneo(){
        boolean comprovador=true;
        int ocupados=0;
        for (int i = 0; i < butacas.length ; i++) {
            if (butacas[i]==1){
                ocupados++;
            }
        }
        if (ocupados==72){
            comprovador=false;
        }
        return comprovador;
    }

    public void ocuparAsiento(Espectador espectador, Asientos asientos, Pelicula pelicula, Cine cine){
        System.out.println("Array antes de la ejecución: " + "\n------------------------------");
        for (int j = 0; j <asientos.getButacas().length ; j++) {
            System.out.print(asientos.getButacas()[j] + " ");
        }
        System.out.println("\n------------------------------");
        while (comprovadorLlneo()){
            int i=(int)(Math.random()*72);
            espectador=new Espectador();
            if ((espectador.getEdad()>=pelicula.getEdad_minima())&&(espectador.getDinero()>=cine.getPrecio())&&(asientos.comprovarButaca(i))){
                if (butacas[i]==0){
                    butacas[i]=1;
                }
            }
        }
        System.out.println("Array despues de la ejecución: " + "\n------------------------------");
        for (int j = 0; j <asientos.getButacas().length ; j++) {
            System.out.print(asientos.getButacas()[j] + " ");
        }
    }
    //getters
    public int[] getButacas() {
        return butacas;
    }
}
