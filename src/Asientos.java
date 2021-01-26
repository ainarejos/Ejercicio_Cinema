public class Asientos {
    private int[] butacas=new int[72];

    public Asientos(){};
    public boolean comprovarButaca(int posicion){
         boolean disponibilidad=true;
        if (butacas[posicion]==1){
            disponibilidad=false;
        }
        return disponibilidad;
    }

    public boolean comprovadorLlneo(){
        boolean comprovador=true;
        int maclamore=0;
        for (int i = 0; i < butacas.length ; i++) {
            if (butacas[i]==1){
                maclamore++;
            }
        }
        if (maclamore==72){
            comprovador=false;
        }
        return comprovador;
    }

    public void ocuparAsiento(Espectador espectador, Asientos asientos, Pelicula pelicula, Cine cine){
        while (comprovadorLlneo()){
            int i=(int)(Math.random()*72);
            espectador=new Espectador();
            if ((espectador.getEdad()>=pelicula.getEdad_minima())&&(espectador.getDinero()>=cine.getPrecio())&&(asientos.comprovarButaca(i))){
                // Nucleo
                if (butacas[i]==0){
                    butacas[i]=1;
                }
                //
            }
        }
        for (int j = 0; j <asientos.getButacas().length ; j++) {
            System.out.println(asientos.getButacas()[j]);
        }
    }
    public int[] getButacas() {
        return butacas;
    }
}
