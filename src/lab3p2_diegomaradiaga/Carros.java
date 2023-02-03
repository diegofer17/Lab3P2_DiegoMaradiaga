package lab3p2_diegomaradiaga;

public class Carros extends Vehiculos{
    private int cantPuertas;
    private String Desmotor;
    private int velocidadMax;

    public Carros() {
        super();
    }

    public Carros(int cantPuertas, String Desmotor, int velocidadMax, String color, String marca, String modelo, int fabricacion, int precio, int cantLL) {
        super(color, marca, modelo, fabricacion, precio, cantLL);
        this.cantPuertas = cantPuertas;
        this.Desmotor = Desmotor;
        this.velocidadMax = velocidadMax;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public String getDesmotor() {
        return Desmotor;
    }

    public void setDesmotor(String Desmotor) {
        this.Desmotor = Desmotor;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    @Override
    public String toString() {
        return super.toString()+"Carros{" + "cantPuertas=" + cantPuertas + ", Desmotor=" + Desmotor + ", velocidadMax=" + velocidadMax + '}';
    }
    
    
    
}
