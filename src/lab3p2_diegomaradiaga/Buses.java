package lab3p2_diegomaradiaga;

public class Buses extends Vehiculos{
    private int pasajeros;
    private String tipoB;

    public Buses() {
        super();
    }

    public Buses(int pasajeros, String TipoB, String color, String marca, String modelo, int fabricacion, int precio, int cantLL) {
        super(color, marca, modelo, fabricacion, precio, cantLL);
        this.pasajeros = pasajeros;
        if (pasajeros > 50) {
            this.tipoB = "De Ruta";
        } else {
            this.tipoB = "Rapidito";
        }
       
    }
     
    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getTipoB() {
        return tipoB;
    }

    public void setTipoB(String tipoB) {
        if (pasajeros > 50) {
            this.tipoB = "De Ruta";
        } else {
            this.tipoB = "Rapidito";
        }
    }

    @Override
    public String toString() {
        return super.toString()+"Buses{" + "pasajeros=" + pasajeros + ", tipoB=" + tipoB + '}';
    }
    
    
    
    
}
