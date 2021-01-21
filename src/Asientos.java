public class Asientos {
    private int[] butacas=new int[72];
    private boolean disponibilidad=true;

    public Asientos(){};
    public void comprovarButaca(int posicion){
        if (butacas[posicion]==1){
            disponibilidad=false;
        }
    }

    public void acuparAsiento(int posicion){
        if (butacas[posicion]==0){
            butacas[posicion]=1;
        }
    }
    public int[] getButacas() {
        return butacas;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }
}
