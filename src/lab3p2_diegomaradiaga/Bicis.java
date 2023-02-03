package lab3p2_diegomaradiaga;

public class Bicis extends Vehiculos{
    private String descripcion;
    private int RadioR;
    private String tipoB;

    public Bicis() {
        super();
    }

    public Bicis(String descripcion, int RadioR, String tipoB, String color, String marca, String modelo, int fabricacion, int precio, int cantLL) {
        super(color, marca, modelo, fabricacion, precio, cantLL);
        this.descripcion = descripcion;
        this.RadioR = RadioR;
        this.tipoB = tipoB;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getRadioR() {
        return RadioR;
    }

    public void setRadioR(int RadioR) {
        this.RadioR = RadioR;
    }

    public String getTipoB() {
        return tipoB;
    }

    public void setTipoB(String tipoB) {
        this.tipoB = tipoB;
    }

    @Override
    public String toString() {
        return super.toString()+"Bicis{" + "descripcion=" + descripcion + ", RadioR=" + RadioR + ", tipoB=" + tipoB + '}';
    }
    
        
}
