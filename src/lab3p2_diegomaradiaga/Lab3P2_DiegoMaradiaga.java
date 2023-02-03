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
                            + "2. Modificar Clientes\n"
                            + "3. Eliminar Clientes\n"
                            + "\n"
                            + "Ingrese una opcion: ");
                    int opcionC = leer.nextInt();
                    
                    switch (opcionC){
                        case 1:
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
    
}//FIn clase
