package lab3p2_diegomaradiaga;

import java.util.ArrayList;

public class Concesionaria {
    private String Nempresa;
    private int Id;
    private String direccion;
    private ArrayList <Vehiculos> Vehiculos = new ArrayList();
    private ArrayList <Clientes> Clientes = new ArrayList();
    private double saldo;

    public Concesionaria() {
    }

    public Concesionaria(String Nempresa, int Id, String direccion, double saldo) {
        this.Nempresa = Nempresa;
        this.Id = Id;
        this.direccion = direccion;
        this.saldo = saldo;
    }

    public String getNempresa() {
        return Nempresa;
    }

    public void setNempresa(String Nempresa) {
        this.Nempresa = Nempresa;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Vehiculos> getVehiculos() {
        return Vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculos> Vehiculos) {
        this.Vehiculos = Vehiculos;
    }

    public ArrayList<Clientes> getClientes() {
        return Clientes;
    }

    public void setClientes(ArrayList<Clientes> Clientes) {
        this.Clientes = Clientes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Concesionaria{" + "Nempresa=" + Nempresa + ", Id=" + Id + ", direccion=" + direccion + ", Vehiculos=" + Vehiculos + ", Clientes=" + Clientes + ", saldo=" + saldo + '}';
    }
    
    
}
