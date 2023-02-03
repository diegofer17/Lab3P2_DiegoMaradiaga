package lab3p2_diegomaradiaga;

public class Motos extends Vehiculos{
    private String desplazamiento;
    private String tipoM;

    public Motos() {
        super();
    }

    public Motos(String desplazamiento, String tipoM, String color, String marca, String modelo, int fabricacion, int precio, int cantLL) {
        super(color, marca, modelo, fabricacion, precio, cantLL);
        this.desplazamiento = desplazamiento;
        this.tipoM = tipoM;
    }

    public String getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(String desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public String getTipoM() {
        return tipoM;
    }

    public void setTipoM(String tipoM) {
        this.tipoM = tipoM;
    }

    @Override
    public String toString() {
        return super.toString()+"Motos{" + "desplazamiento=" + desplazamiento + ", tipoM=" + tipoM + '}';
    }
    
}
