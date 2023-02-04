package lab3p2_diegomaradiaga;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_DiegoMaradiaga {
    static Scanner leer = new Scanner(System.in);
    static ArrayList<Concesionaria> concesionarias = new ArrayList();
    static ArrayList<Vehiculos> vehiculos = new ArrayList();
    static ArrayList<Clientes> clientes = new ArrayList();
        
    public static void main(String[] args) {
        int opcion;
        
        do {
            System.out.println("-------------------------------------------------------");
            System.out.println(">>>     Alcaldía Municipal del Distrito Central     <<<");
            System.out.println("");
            System.out.println("1. CRUD Concesionaria ");
            System.out.println("2. CRUD Clientes      ");
            System.out.println("3. CRUD Vehiculos     ");
            System.out.println("4. Compra/Venta de vehiculos por parte de un cliente ");
            System.out.println("5. Salir");
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
                            concesionarias.add(newConcesionaria());
                            System.out.println("Concesionaria agregada exitosamente");
                            break;
                        case 2:
                            if(!concesionarias.isEmpty()){
                                for (Object t : concesionarias) {
                                    System.out.println(""+concesionarias.indexOf(t)+" )"+" "+t);
                                }
                                
                                int indexM = 0;
                                do{
                                    System.out.print("Ingrese la consecionaria que desea modificar: ");
                                    indexM= leer.nextInt();
                                }while(indexM<0 && indexM > concesionarias.size());
                                
                                System.out.print("Solo puede modificar la direccion\n"
                                        + "Ingrese una nueva direccion: ");
                                String Ndireccion = leer.next();
                                
                                ((Concesionaria)concesionarias.get(indexM)).setDireccion(Ndireccion);
                            }else{
                                System.out.println("Debe agregar una concesionaria");
                            }//Fin else
                            break;
                        case 3:
                            if(!concesionarias.isEmpty()){
                                for (Object t : concesionarias) {
                                    System.out.println(""+concesionarias.indexOf(t)+" )"+" "+t);
                                }
                                int indexC = 0;
                                do{
                                    System.out.print("Ingrese la consecionaria que desea eliminar: ");
                                    indexC= leer.nextInt();
                                }while(indexC<0 && indexC > concesionarias.size());
                            
                                concesionarias.remove(indexC);
                            }else{
                                System.out.println("Debe agregar una concesionaria");
                            }//Fin else
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }//Fin switch
                }
                break;
                case 2: {
                    if (!concesionarias.isEmpty()) {
                        System.out.println(">> Clientes <<\n"
                                + "\n"
                                + "1. Agregar Clientes\n"
                                + "2. Eliminar Clientes\n"
                                + "\n"
                                + "Ingrese una opcion: ");
                        int opcionC = leer.nextInt();

                        switch (opcionC) {
                            case 1:
                                clientes.add(newClientes());
                                System.out.println("Cliente agregado exitosamente");
                                break;
                            case 2:
                                if (!clientes.isEmpty()) {
                                    for (Object t : clientes) {
                                        System.out.println("" + clientes.indexOf(t) + " )" + " " + t);
                                    }
                                    int indexC = 0;

                                    do {
                                        System.out.print("Ingrese el cliente que desea eliminar: ");
                                        indexC = leer.nextInt();
                                    } while (indexC < 0 && indexC > clientes.size());

                                    clientes.remove(indexC);

                                } else {
                                    System.out.println("Debe agregar una concesionaria");
                                }//Fin else
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }//Fin switch
                    } else {
                        System.out.println("Debe agregar una concesionaria");
                    }//Fin else

                }
                break;
                case 3: {
                    if (!concesionarias.isEmpty()) {
                        System.out.println(">> Vehiculos <<\n"
                                + "\n"
                                + "1. Agregar Vehiculos\n"
                                + "2. Modificar Vehiculos\n"
                                + "3. Eliminar Vehiculos\n"
                                + "\n"
                                + "Ingrese una opcion: ");
                        int opcionC = leer.nextInt();
                        
                        switch (opcionC) {
                            case 1:
                                for (Object t : concesionarias) {
                                    System.out.println("" + concesionarias.indexOf(t) + " )" + " " + t);
                                }
                                int indexCo = 0;

                                do {
                                    System.out.print("Elija la consecionaria a la que desea agregar un vehiculo: ");
                                    indexCo = leer.nextInt();
                                } while (indexCo < 0 && indexCo > concesionarias.size());
                                
                                System.out.println("Creacion del vehiculo\n"
                                        + "\n");
                                System.out.print("Ingrese el color del vehiculo: ");
                                String colorV = leer.next();
                                System.out.print("Ingrese la marca del vehiculo: ");
                                String marcaV = leer.next();
                                System.out.print("Ingrese el modelo del vehiculo: ");
                                String modeloV = leer.next();
                                System.out.println("Ingrese el anio del vehiculo: ");
                                int anioV = leer.nextInt();
                                System.out.println("Ingrese el precio del vehiculo: ");
                                int precioV = leer.nextInt();
                                int cantll = 0;
                                do {
                                    System.out.println("Ingrese la cantidad de llantas (2 o 4): ");
                                    cantll = leer.nextInt();
                                } while (cantll != 2 && cantll != 4);

                                switch (cantll) {
                                    case 2:
                                        int opcionl2 = 0;
                                        do {
                                            System.out.println("Elija (1 = Moto/ 2 = Bici)? ");
                                            opcionl2 = leer.nextInt();
                                        } while (opcionl2 != 1 && opcionl2 != 2);
                                        switch (opcionl2) {
                                            case 1:
                                                Vehiculos moto = newMotos(colorV, marcaV, modeloV, marcaV, precioV, cantll);
                                                vehiculos.add(moto);
                                                concesionarias.get(indexCo).getVehiculos().add(moto);
                                                break;
                                            case 2:
                                                Vehiculos bici = newBicis(colorV, marcaV, modeloV, marcaV, precioV, cantll);
                                                vehiculos.add(bici);
                                                concesionarias.get(indexCo).getVehiculos().add(bici);
                                                break;
                                        }//Fin switch
                                        break;
                                    case 4:
                                        int opcionl4 = 0;
                                        do {
                                            System.out.println("Elija (1 = Carro/ 2 = Camion/ 3= Bus)? ");
                                            opcionl4 = leer.nextInt();
                                        } while (opcionl4 != 1 && opcionl4 != 2 && opcionl4 != 3);
                                        switch (opcionl4) {
                                            case 1:
                                                Vehiculos carro = newCarros(colorV, marcaV, modeloV, marcaV, precioV, cantll);
                                                vehiculos.add(carro);
                                                concesionarias.get(indexCo).getVehiculos().add(carro);
                                                break;
                                            case 2:
                                                Vehiculos camion = newCamiones(colorV, marcaV, modeloV, marcaV, precioV, cantll);
                                                vehiculos.add(camion);
                                                concesionarias.get(indexCo).getVehiculos().add(camion);
                                                break;
                                            case 3:
                                                Vehiculos bus = newBuses(colorV, marcaV, modeloV, marcaV, precioV, cantll);
                                                vehiculos.add(bus);
                                                concesionarias.get(indexCo).getVehiculos().add(bus);
                                                break;
                                        }//Fin switch
                                        break;
                                    default:

                                }//Fin switch
                                concesionarias.get(indexCo).getVehiculos().add(new Vehiculos(colorV, marcaV, modeloV, precioV, precioV, cantll));
                                System.out.println("Vehiculo creado exitosamente");
                                break;
                            case 2:
                                if (!vehiculos.isEmpty()) {
                                    for (Object t : concesionarias) {
                                        System.out.println("" + concesionarias.indexOf(t) + " )" + " " + t);
                                    }
                                    int indexCon = 0;
                                    
                                    do {
                                        System.out.print("Elija la concesionaria de la que desea modificar un vehiculo: ");
                                        indexCon = leer.nextInt();
                                    } while (indexCon < 0 && indexCon > concesionarias.size());
                                    
                                    ArrayList<Vehiculos> carros = ((Concesionaria)concesionarias.get(indexCon)).getVehiculos();
                                    for (Vehiculos t : carros) {
                                        System.out.println(""+carros.indexOf(t) + " )" + " " + t);
                                    }
                                    int indexM = 0;
                                    do {
                                        System.out.print("Ingrese el vehiculo que desea modificar: ");
                                        indexM = leer.nextInt();
                                    } while (indexM < 0 && indexM > vehiculos.size());
                                    
                                    if (concesionarias.get(indexCon).getVehiculos().get(indexM) instanceof Carros){
                                        System.out.print("Opciones\n"
                                                + "1. Cantidad de puertas\n"
                                                + "2. Descripcion del motor\n"
                                                + "3. Velocidad maxima\n"
                                                + "Ingrese una opcion: ");
                                        int opcionmod = leer.nextInt();
                                        
                                        switch(opcionmod){
                                            case 1:
                                                System.out.println("Ingrese la nueva cantidad de puertas: ");
                                                int cantP = leer.nextInt();
                                                ((Carros)vehiculos.get(indexM)).setCantPuertas(cantP);
                                                break;
                                            case 2:
                                                System.out.println("Ingrese la nueva descripcion del motor: ");
                                                String Dmotor = leer.next();
                                                ((Carros)vehiculos.get(indexM)).setDesmotor(Dmotor);
                                                break;
                                            case 3:
                                                System.out.println("Ingrese la nueva velocidad maxima : ");
                                                int vm = leer.nextInt();
                                                ((Carros)vehiculos.get(indexM)).setVelocidadMax(opcionmod);
                                                break;
                                            default:
                                                System.out.println("Opcion no valida");
                                                break;
                                        }//Fin switch  
                                    }//Fin if
                                    if (concesionarias.get(indexCon).getVehiculos().get(indexM) instanceof Camiones){
                                        System.out.print("Opciones\n"
                                                + "1. Volumen de carga\n"
                                                + "2. Altura\n"
                                                + "Ingrese una opcion: ");
                                        int opcionmod = leer.nextInt();
                                        
                                        switch(opcionmod){
                                            case 1:
                                                System.out.println("Ingrese el nuevo volumen de carga: ");
                                                int Vcarga = leer.nextInt();
                                                ((Camiones)vehiculos.get(indexM)).setVolumenC(opcionC);
                                                break;
                                            case 2:
                                                System.out.println("Ingrese la nueva altura: ");
                                                int height = leer.nextInt();
                                                ((Camiones)vehiculos.get(indexM)).setAltura(height);
                                                break;
                                            default:
                                                System.out.println("Opcion no valida");
                                                break;
                                        }//Fin switch  
                                    }//Fin if           
                                    if (concesionarias.get(indexCon).getVehiculos().get(indexM) instanceof Buses){
                                        System.out.print("Opciones\n"
                                                + "1. Cantidad de pasajeros\n"
                                                + "Ingrese una opcion: ");
                                        int opcionmod = leer.nextInt();
                                        
                                        switch(opcionmod){
                                            case 1:
                                                System.out.println("Ingrese la nueva cantidad de pasajeros: ");
                                                int pasajeros = leer.nextInt();
                                                ((Buses)vehiculos.get(indexM)).setPasajeros(pasajeros);
                                                break;
                                            default:
                                                System.out.println("Opcion no valida");
                                                break;
                                        }//Fin switch  
                                    }//Fin if    
                                    if (concesionarias.get(indexCon).getVehiculos().get(indexM) instanceof Motos){
                                        System.out.print("Opciones\n"
                                                + "1. Desplazamiento\n"
                                                + "Ingrese una opcion: ");
                                        int opcionmod = leer.nextInt();
                                        
                                        switch(opcionmod){
                                            case 1:
                                                System.out.println("Ingrese el nuevo desplazamiento: ");
                                                String desplazamiento = leer.next();
                                                ((Motos)vehiculos.get(indexM)).setDesplazamiento(desplazamiento);
                                                break;
                                            default:
                                                System.out.println("Opcion no valida");
                                                break;
                                        }//Fin switch  
                                    }//Fin if
                                    if (concesionarias.get(indexCon).getVehiculos().get(indexM) instanceof Bicis){
                                        System.out.print("Opciones\n"
                                                + "1. Descripcion\n"
                                                + "2. Radio de la rueda\n"
                                                + "Ingrese una opcion: ");
                                        int opcionmod = leer.nextInt();
                                        
                                        switch(opcionmod){
                                            case 1:
                                                System.out.println("Ingrese el nuevo desplazamiento: ");
                                                String descripcion = leer.next();
                                                ((Bicis)vehiculos.get(indexM)).setDescripcion(descripcion);
                                                break;
                                            case 2:
                                                System.out.println("Ingrese el nuevo radio de la rueda: ");
                                                int radio = leer.nextInt();
                                                ((Bicis)vehiculos.get(indexM)).setRadioR(radio);
                                                break;
                                            default:
                                                System.out.println("Opcion no valida");
                                                break;
                                        }//Fin switch  
                                    }//Fin if   
                                } else {
                                    System.out.println("Debe agregar una concesionaria");
                                }//Fin else
                                break;
                            case 3:
                                if (!vehiculos.isEmpty()) {
                                    for (Object t : concesionarias) {
                                        System.out.println("" + concesionarias.indexOf(t) + " )" + " " + t);
                                    }
                                    int indexCon = 0;
                                    
                                    do {
                                        System.out.print("Elija la concesionaria de la que desea eliminar un vehiculo: ");
                                        indexCon = leer.nextInt();
                                    } while (indexCon < 0 && indexCon > concesionarias.size());
                                    
                                    
                                    for (Object t : vehiculos) {
                                        System.out.println("" + vehiculos.indexOf(t) + " )" + " " + t);
                                    }
                                    int indexC = 0;

                                    do {
                                        System.out.print("Ingrese el vehiculo que desea eliminar: ");
                                        indexC = leer.nextInt();
                                    } while (indexC < 0 && indexC > vehiculos.size());

                                    vehiculos.remove(indexC);
                                } else {
                                    System.out.println("Debe agregar una concesionaria");
                                }//Fin else
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }//Fin switch
                    } else {
                        System.out.println("Debe agregar una concesionaria");
                    }//Fin else

                }
                break;
                case 4: {
                    
                }break;
                default:
                   System.out.println("Opcion no valida");
                   break;
            }//Fin switch
        }while(opcion!=5);
    }//Fin main
    
    static Concesionaria newConcesionaria(){
        Concesionaria retorno;
        System.out.println("Creacion de concesionaria\n"
                + "\n");
        System.out.print("Ingrese el nombre de la concesionaria: ");
        String nombreE = leer.next();
        System.out.print("Ingrese la direccion de la concesionaria: ");
        String direccionE = leer.next();
        System.out.println("Ingrese el saldo de la concesionaria: ");
        int saldoE = leer.nextInt();
        
        retorno = new Concesionaria(nombreE, concesionarias.size()+1, direccionE, saldoE);
        return retorno;
    }
    
    static Clientes newClientes(){
        Clientes retorno;
        System.out.println("Creacion de cliente\n"
                + "\n");
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreC = leer.next();
        System.out.println("Ingrese el saldo del cliente: ");
        int saldoC = leer.nextInt();
        
        retorno = new Clientes(clientes.size()+1, nombreC, saldoC);
        return retorno;
    }
      
    static Carros newCarros(String color, String marca, String modelo, String anio, double precio, int cantLL){
        Carros retorno;
        
        retorno = new Carros();
        return retorno;    
    }
    
    static Camiones newCamiones(String color, String marca, String modelo, String anio, double precio, int cantLL){
        Camiones retorno;
        System.out.println("Ingrese el volumen maximo de carga del camion: ");
        int Vcamion = leer.nextInt();
        System.out.println("Ingrese la altura del camion: ");
        int altura = leer.nextInt();
        System.out.println("El camion tiene retroexcavadora (1 = Si/ 2 = No)?: ");
        int opcionC = leer.nextInt();
        
        boolean E = true;
        switch (opcionC) {
            case 1:
                E = true;
                break;
             case 2:
                E = false;
                break;
        }
        
        retorno = new Camiones();
        return retorno;    
    }
    
    static Buses newBuses(String color, String marca, String modelo, String anio, double precio, int cantLL){
        Buses retorno;
        System.out.println("Ingrese la cantidad de pasajeros del bus: ");
        int cantP = leer.nextInt();
        
        retorno = new Buses();
        return retorno;    
    }
    
    static Motos newMotos(String color, String marca, String modelo, String anio, double precio, int cantLL){
        Motos retorno;
        System.out.println("Ingrese el desplazamiento de la moto: ");
        String desp = leer.next();
        System.out.println("La moto es electrica (1 = Si/ 2= No)?: ");
        int opcionM = leer.nextInt();
        boolean E = true;
        switch (opcionM) {
            case 1:
                E = true;
                break;
            case 2:
                E = false;
                break;
        }
        
        retorno = new Motos(desp, E, color, marca, modelo, opcionM, opcionM, cantLL);
        return retorno;    
    }
    
    static Bicis newBicis(String color, String marca, String modelo, String anio, double precio, int cantLL){
        Bicis retorno;
        
        System.out.println("Ingrese la descripcion de la bicicleta: ");
        String descripcion = leer.next();
        System.out.println("Ingrese el radio de la rueda de la bicicleta: ");
        int radio = leer.nextInt();
        System.out.println("Ingrese el tipo de bicicleta (1. BMX / 2. De calle): ");
        int opcionBici = leer.nextInt();
        
        String tipoBici = "";
        switch(opcionBici){
            case 1:
                tipoBici = "BMX";
                break;   
            case 2:
                tipoBici = "De calle";
                break;
        }
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
