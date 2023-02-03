package lab3p2_diegomaradiaga;

import java.util.ArrayList;

public class Clientes {
    private int Id;
    private String nombre;
    private ArrayList <Vehiculos> Vehiculos = new ArrayList();
    private double saldo;

    public Clientes() {
    }

    public Clientes(int Id, String nombre, double saldo) {
        this.Id = Id;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vehiculos> getVehiculos() {
        return Vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculos> Vehiculos) {
        this.Vehiculos = Vehiculos;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Clientes{" + "Id=" + Id + ", nombre=" + nombre + ", Vehiculos=" + Vehiculos + ", saldo=" + saldo + '}';
    }
        
}
