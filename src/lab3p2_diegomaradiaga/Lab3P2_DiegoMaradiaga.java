package lab3p2_diegomaradiaga;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_DiegoMaradiaga {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        int X = 0;
        ArrayList lista = new ArrayList();
        ArrayList<Concesionaria> concesionarias = new ArrayList();
        ArrayList<Vehiculos> vehiuclos = new ArrayList();
        ArrayList<Clientes> clientes = new ArrayList();
        
        do {
            System.out.println("-------------------------------------------------------");
            System.out.println(">>>     Alcaldía Municipal del Distrito Central     <<<");
            System.out.println("");
            System.out.println("1. CRUD Concesionaria ");
            System.out.println("2. CRUD Clientes      ");
            System.out.println("3. CRUD Vehiculos     ");
            System.out.println("4. Compra/Venta de vehiculos por parte de un cliente ");
            System.out.println("");
            System.out.print("Ingrese su opcion: ");
            opcion = leer.nextInt();
            System.out.println("");

            switch (opcion) {

                case 1: {
                    System.out.println(">> Concesionaria <<\n"
                            + "\n"
                            + "1. Agregar Conceionaria\n"
                            + "2. Modificar Concesionaria\n"
                            + "3. Eliminar Concesionaria\n"
                            + "\n"
                            + "Ingrese una opcion: ");
                    int opcionC = leer.nextInt();
                    
                    switch (opcionC){
                        case 1:
                            newConcesionaria();
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }//Fin switch
                }break;
                case 2: {
                    System.out.println(">> Clientes <<\n"
                            + "\n"
                            + "1. Agregar Clientes\n"
                            + "2. Eliminar Clientes\n"
                            + "\n"
                            + "Ingrese una opcion: ");
                    int opcionC = leer.nextInt();
                    
                    switch (opcionC){
                        case 1:
                            newClientes();
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }//Fin switch
                }break;
                case 3: {
                    System.out.println(">> Vehiculos <<\n"
                            + "\n"
                            + "1. Agregar Vehiculos\n"
                            + "2. Modificar Vehiculos\n"
                            + "3. Eliminar Vehiculos\n"
                            + "\n"
                            + "Ingrese una opcion: ");
                    int opcionC = leer.nextInt();
                    
                    switch (opcionC){
                        case 1:
                            newVehiculos();
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }//Fin switch
                }break;
                case 4: {
                    
                }break;
                default:
                   System.out.println("Opcion no valida");
                   break;
            }//Fin switch
        }while(opcion!=3);
    }//Fin main
    
    static Concesionaria newConcesionaria(){
        Concesionaria retorno;
        System.out.println("Creacion de concesionaria\n"
                + "\n");
        System.out.print("Ingrese el nombre de la concesionaria: ");
        String nombreE = leer.next();
        System.out.print("Ingrese el ID de la concesionaria: ");
        int IdE = leer.nextInt();
        System.out.print("Ingrese la direccion de la concesionaria: ");
        String direccionE = leer.next();
        System.out.println("Ingrese el saldo de la concesionaria: ");
        int saldoE = leer.nextInt();
        
        retorno = new Concesionaria(nombreE, IdE, direccionE, saldoE);
        return retorno;
    }
    
    static Clientes newClientes(){
        Clientes retorno;
        System.out.println("Creacion de cliente\n"
                + "\n");
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreC = leer.next();
        System.out.print("Ingrese el ID del cliente: ");
        int IdC = leer.nextInt();
        System.out.println("Ingrese el saldo del cliente: ");
        int saldoC = leer.nextInt();
        
        retorno = new Clientes(IdC, nombreC, saldoC);
        return retorno;
    }
    
    static Vehiculos newVehiculos(){
        Vehiculos retorno;
        System.out.println("Creacion del vehiculo\n"
                + "\n");
        System.out.print("Ingrese el color del vehiculo: ");
        String colorV = leer.next();
        System.out.print("Ingrese la marca del vehiculo: ");
        String marcaV = leer.next();
        System.out.print("Ingrese el modelo del vehiculo: ");
        String modeloV = leer.next();
        System.out.println("Ingrese el ano del vehiculo: ");
        int anioV = leer.nextInt();
        System.out.println("Ingrese el precio del vehiculo: ");
        int precioV = leer.nextInt();
        int cantll=0;
        do{
        System.out.println("Ingrese la cantidad de llantas (2 o 4): ");
        cantll = leer.nextInt();
        }while( cantll !=2 || cantll !=4);
        
        switch (cantll) {
            case 2:
                int opcionl2 = 0;
                do{
                System.out.println("Elija (1 = Moto/ 2 = Bici)");
                opcionl2 = leer.nextInt();
                }while(opcionl2 != 1 || opcionl2 != 2);
                    switch(opcionl2){
                        case 1:
                            
                            break;
                        case 2:
                            
                            break;
                    }
                break;
            case 4:
                
                break;
            default:
                throw new AssertionError();
        }
        retorno = new Vehiculos(colorV, marcaV, modeloV, precioV, precioV, cantll);
        return retorno;
    }
    
    static Carros newCarros(){
        Carros retorno;
        
        retorno = new Carros();
        return retorno;    
    }
    
    static Camiones newCamiones(){
        Camiones retorno;
        
        retorno = new Camiones();
        return retorno;    
    }
    
    static Buses newBuses(){
        Buses retorno;
        
        retorno = new Buses();
        return retorno;    
    }
    
    static Motos newMotos(){
        Motos retorno;
        
        retorno = new Motos();
        return retorno;    
    }
    
    static Bicis newBicis(){
        Bicis retorno;
        
        
        retorno = new Bicis ();
        return retorno;    
    }
    
    
    
    /*static ArrayList<Alas> newAla(int X) {
        ArrayList <Alas> alas = new ArrayList();
        
        for (int i = 1; i <= X; i++) {
            int pesoA = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el peso del ala (Max 200): "));
            int longitudA = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la longitud del ala: "));
            alas.add(new Alas(pesoA, longitudA, newArmamento()));
        }

        return alas;
    }*/
    
}//FIn clase
