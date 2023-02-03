package lab3p2_diegomaradiaga;

public class Camiones extends Vehiculos{
    private int volumenC;
    private int altura;
    private boolean retro;

    public Camiones() {
        super();
    }

    public Camiones(int volumenC, int altura, boolean retro, String color, String marca, String modelo, int fabricacion, int precio, int cantLL) {
        super(color, marca, modelo, fabricacion, precio, cantLL);
        this.volumenC = volumenC;
        this.altura = altura;
        this.retro = retro;
    }

    public int getVolumenC() {
        return volumenC;
    }

    public void setVolumenC(int volumenC) {
        this.volumenC = volumenC;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isRetro() {
        return retro;
    }

    public void setRetro(boolean retro) {
        this.retro = retro;
    }

    @Override
    public String toString() {
        return super.toString()+"Camiones{" + "volumenC=" + volumenC + ", altura=" + altura + ", retro=" + retro + '}';
    }
    
    
    
}
