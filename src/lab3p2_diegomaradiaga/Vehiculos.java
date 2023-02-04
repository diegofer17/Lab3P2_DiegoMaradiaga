package lab3p2_diegomaradiaga;

import java.awt.Color;

public class Vehiculos {
    protected String color;
    protected String marca;
    protected String modelo;
    protected int fabricacion;
    protected double precio;
    protected int cantLL;

    public Vehiculos() {
    }

    public Vehiculos(String color, String marca, String modelo, int fabricacion, double precio, int cantLL) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.fabricacion = fabricacion;
        this.precio = precio;
        this.cantLL = cantLL;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(int fabricacion) {
        this.fabricacion = fabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantLL() {
        return cantLL;
    }

    public void setCantLL(int cantLL) {
        this.cantLL = cantLL;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", fabricacion=" + fabricacion + ", precio=" + precio + ", cantLL=" + cantLL + '}';
    }
    
    
    
}
