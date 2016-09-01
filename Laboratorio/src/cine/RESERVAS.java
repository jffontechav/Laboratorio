package cine;

import java.util.Scanner;

public class RESERVAS {

    public static boolean TARCINE;
    //public static String [][] Sillas = {{"A1","A2","A3","A4","A5","A6","A7","A8","A9","A10","A11","A12","A13","A14","A15","A16","A17","A18","A19","A20"},{"B1","B2","B3","B4","B5","B6","B7","B8","B9","B10","B11","B12","B13","B14","B15","B16","B17","B18","B19","B20"},{"C1","C2","C3","C4","C5","C6","C7","C8","C9","C10","C11","C12","C13","C14","C15","C16","C17","C18","C19","C20"},{"D1","D2","D3","D4","D5","D6","D7","D8","D9","D10","D11","D12","D13","D14","D15","D16","D17","D18","D19","D20"},{"E1","E2","E3","E4","E5","E6","E7","E8","E9","E10","E11","E12","E13","E14","E15","E16","E17","E18","E19","E20"},{"F1","F2","F3","F4","F5","F6","F7","F8","F9","F10","F11","F12","F13","F14","F15","F16","F17","F18","F19","F20"},{"G1","G2","G3","G4","G5","G6","G7","G8","G9","G10","G11","G12","G13","G14","G15","G16","G17","G18","G19","G20"},{"H1","H2","H3","H4","H5","H6","H7","H8","H9","H10","H11","H12","H13","H14","H15","H16","H17","H18","H19","H20"},{"I1","I2","I3","I4","I5","I6","I7","I8","I9","I10","I11","I12","I13","I14","I15","I16","I17","I18","I19","I20"},{"J1","J2","J3","J4","J5","J6","J7","J8","J9","J10","J11","J12","J13","J14","J15","J16","J17","J18","J19","J20"},{"K1","K2","K3","K4","K5","K6","K7","K8","K9","K10","K11","K12","K13","K14","K15","K16","K17","K18","K19","K20"}};//
    public static double precio;
    public static String[] Filas = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"};
    public static String[] Columnas = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
    public static int[] clientesConTarjeta = new int[6];
    public static double[] saldosClientes = new double[6];
    public static String[][] Sillas = new String[11][20];
    public static int filas = 0, columnas = 0;
    public static double[] deuda = new double[6];
    public static String[] sillasDeReservas = new String[10];

    public static void main(String[] args) {

        for (filas = 0; filas < Sillas.length; filas++) {
            for (columnas = 0; columnas < Sillas[filas].length; columnas++) {
                Sillas[filas][columnas] = Filas[filas] + Columnas[columnas];
            }
        }

        // EL PROGRAMA ESTÁ DISEÑADO PARA LA CREACION DE 6 TARJETAS MAXIMO //
        for (int iniciar = 0; iniciar < 10; iniciar++) {
            int numCliente = 0;

            System.out.println("");
            System.out.println("->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->");
            System.out.println("->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->");
            System.out.println("Bienvenido a CINE UN");

            System.out.println("");
            System.out.println("Si desea comprar boletas sin reserva oprima 1.");
            System.out.println("Si desea ingresar al menu de reservas oprima 2.");

            System.out.println("Si desea adquirir la tarjeta TARCINE oprima 3.");
            System.out.println("Si desea recargar la tarjeta TARCINE oprima 4.");
            System.out.println("Si desea salir oprima 0.");
            Scanner menuprincipal = new Scanner(System.in);
            int menu = menuprincipal.nextInt();

            System.out.println("->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->");
            System.out.println("->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->");
            System.out.println("");

            switch (menu) {

                case 1:
                    int m;
                    for (m = 0; m < 2; m++) {
                        System.out.println("");
                        System.out.println("Si posee la TARCINE escriba si, de lo contrario escriba no.");

                        Scanner tarjeta = new Scanner(System.in);
                        String t = tarjeta.next();
                        if (t.compareTo("si") == 0) {
                            System.out.println("Ingrese su documento de identidad");
                            Scanner identificacion = new Scanner(System.in);
                            int numIdentificacion = identificacion.nextInt();
                            for (int i = 0; i < 1; i++) {
                                int j;
                                for (j = 0; j < 6; j++) {
                                    if (numIdentificacion == clientesConTarjeta[j]) {
                                        TARCINE = true;
                                        System.out.println("Numero de tarjeta: " + clientesConTarjeta[j] + " Saldo : " + saldosClientes[j]);
                                        numCliente = j;
                                        clientesConTarjeta[numCliente] = clientesConTarjeta[j];
                                        saldosClientes[numCliente] = saldosClientes[j];
                                        j = 7;
                                        m = 2;
                                    }
                                }
                                if (j == 6) {
                                    System.out.println("->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->");
                                    System.out.println("Este numero de tarjeta no existe");
                                    System.out.println("Por favor, intente de nuevo.");
                                    System.out.println("->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->");
                                    i = 1;
                                    m = 0;
                                }

                            }
                        } else if (t.compareTo("no") == 0) {
                            TARCINE = false;
                            m = 1;
                        } else {
                            System.out.println("Escriba si o no");
                            m = 0;
                        }
                    }

                    System.out.println("->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->");

                    System.out.println("Cuantos asientos desea comprar?");
                    Scanner asientos = new Scanner(System.in);
                    int a = asientos.nextInt();
                    String[] asientosReservados = new String[a];
                    double[] precioTotal = new double[a];
                    String b;

                    Scanner fila = new Scanner(System.in);
                    System.out.println("->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->");
                    for (int z = 0; z < 11; z++) {
                        int numAsientos = 0;
                        int sillaNoDisp;
                        if (numAsientos == a) {
                            z = 11;
                        } else {
                            for (sillaNoDisp = 0; sillaNoDisp < 10; sillaNoDisp++) {

                                for (numAsientos = 0; numAsientos < a; numAsientos++) {
                                    int numArrfila = 11;
                                    int numArrCol = 0;
                                    int i;
                                    int k;

                                    System.out.println("Asiento " + (numAsientos + 1));
                                    System.out.println("");
                                    System.out.println("Recuerde que las filas preferenciales son I, J y K.");
                                    System.out.println("Las filas A hasta H son de categoria general.");
                                    System.out.println("");
                                    //String[][] Sillas = {{"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10", "A11", "A12", "A13", "A14", "A15", "A16", "A17", "A18", "A19", "A20"}, {"B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10", "B11", "B12", "B13", "B14", "B15", "B16", "B17", "B18", "B19", "B20"}, {"C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "C11", "C12", "C13", "C14", "C15", "C16", "C17", "C18", "C19", "C20"}, {"D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", "D11", "D12", "D13", "D14", "D15", "D16", "D17", "D18", "D19", "D20"}, {"E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8", "E9", "E10", "E11", "E12", "E13", "E14", "E15", "E16", "E17", "E18", "E19", "E20"}, {"F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12", "F13", "F14", "F15", "F16", "F17", "F18", "F19", "F20"}, {"G1", "G2", "G3", "G4", "G5", "G6", "G7", "G8", "G9", "G10", "G11", "G12", "G13", "G14", "G15", "G16", "G17", "G18", "G19", "G20"}, {"H1", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10", "H11", "H12", "H13", "H14", "H15", "H16", "H17", "H18", "H19", "H20"}, {"I1", "I2", "I3", "I4", "I5", "I6", "I7", "I8", "I9", "I10", "I11", "I12", "I13", "I14", "I15", "I16", "I17", "I18", "I19", "I20"}, {"J1", "J2", "J3", "J4", "J5", "J6", "J7", "J8", "J9", "J10", "J11", "J12", "J13", "J14", "J15", "J16", "J17", "J18", "J19", "J20"}, {"K1", "K2", "K3", "K4", "K5", "K6", "K7", "K8", "K9", "K10", "K11", "K12", "K13", "K14", "K15", "K16", "K17", "K18", "K19", "K20"}};//

                                    System.out.println("Estos son los asientos disponibles: ");
                                    if (numAsientos < 2) {
                                        for (filas = 0; filas < Sillas.length; filas++) {
                                            System.out.print("|");

                                            for (columnas = 0; columnas < Sillas[filas].length; columnas++) {

                                                System.out.print(Sillas[filas][columnas]);
                                                if (columnas != Sillas[filas].length - 1) {
                                                    System.out.print("\t");
                                                }
                                            }
                                            System.out.println("|");

                                        }
                                    } else {
                                        for (filas = 0; filas < Sillas.length; filas++) {
                                            System.out.print("|");

                                            for (columnas = 0; columnas < Sillas[filas].length; columnas++) {

                                                System.out.print(Sillas[filas][columnas]);
                                                if (columnas != Sillas[filas].length - 1) {
                                                    System.out.print("\t");
                                                }
                                            }
                                            System.out.println("|");
                                        }
                                    }

                                    System.out.println("");
                                    System.out.println("Con letra mayuscula escriba la fila en la que desea su asiento numero " + (numAsientos + 1));

                                    b = fila.nextLine();

                                    int j;

                                    for (i = 0; i < 11; i++) {
                                        if (b.compareTo(Filas[i]) == 0) {
                                            numArrfila = i;

                                        }
                                    }

                                    if (numArrfila > 10) {
                                        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::>Esta fila no existe <:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                                        System.out.println("Desea intentar de nuevo?");
                                        Scanner intento = new Scanner(System.in);
                                        String intentar = intento.next();
                                        for (int q = 0; q < 2; q++) {
                                            if (intentar.compareTo("si") == 0) {
                                                sillaNoDisp = 0;
                                                numAsientos = numAsientos - 1;
                                                q = 1;
                                            } else if (intentar.compareTo("no") == 0) {
                                                sillaNoDisp = 10;
                                                numAsientos = a + 1;
                                                z = 12;
                                                q = 1;
                                            } else {
                                                System.out.println("Escriba si o no");
                                                q = 0;
                                                intentar = intento.next();
                                            }

                                            z = 0;
                                        }
                                    } else {

                                        for (j = 0; j < 20; j++) {

                                            System.out.println("Que numero de silla desea en la fila " + Filas[numArrfila] + "?");
                                            Scanner numeroasiento = new Scanner(System.in);
                                            String c = numeroasiento.nextLine();

                                            for (k = 0; k < 20; k++) {
                                                if (c.compareTo(Columnas[k]) == 0) {
                                                    j = 20;
                                                    numArrCol = k;
                                                }
                                            }
                                            if (j != 20) {
                                                System.out.println("Seleccione un numero del 1 hasta el 20");
                                                j = 0;
                                            }
                                        }

                                        if (Sillas[numArrfila][numArrCol].compareTo("X") == 0) {
                                            System.out.println("Esta silla no esta disponible");
                                            sillaNoDisp = 10;
                                            System.out.println("Desea intentar de nuevo?");
                                            Scanner intento = new Scanner(System.in);
                                            String intentar = intento.next();
                                            for (int q = 0; q < 2; q++) {
                                                if (intentar.compareTo("si") == 0) {
                                                    sillaNoDisp = 0;
                                                    numAsientos = numAsientos - 1;
                                                    q = 1;
                                                } else if (intentar.compareTo("no") == 0) {
                                                    sillaNoDisp = 10;
                                                    numAsientos = a + 1;
                                                    z = 12;
                                                    q = 1;
                                                } else {
                                                    System.out.println("Escriba si o no");
                                                    q = 0;
                                                }

                                            }

                                        } else {
                                            System.out.println("----------------------------------------------------");
                                            System.out.println("La silla que seleccionó es: " + Sillas[numArrfila][numArrCol]);
                                            asientosReservados[numAsientos] = Sillas[numArrfila][numArrCol];
                                            Sillas[numArrfila][numArrCol] = "X";
                                            if (numArrfila < 9) {

                                                precio = 8000;
                                                if (TARCINE == true) {
                                                    precio = precio - (precio * 0.1);

                                                }
                                            } else {
                                                precio = 11000;
                                                if (TARCINE == true) {
                                                    precio = precio - (precio * 0.1);
                                                }
                                            }
                                            precioTotal[numAsientos] = precio;

                                            System.out.println("Este asiento cuesta: " + precio);

                                            System.out.println("----------------------------------------------------");
                                            sillaNoDisp = 10;
                                        }
                                    }
                                }

                            }
                            System.out.println("Los asientos seleccionados son: ");
                            for (int arregloasientosComprados = 0; arregloasientosComprados < a; arregloasientosComprados++) {
                                System.out.println("  " + "#" + asientosReservados[arregloasientosComprados]);
                            }

                            double totalVenta = 0;

                            for (int arregloPrecioTotal = 0; arregloPrecioTotal < a; arregloPrecioTotal++) {
                                totalVenta = totalVenta + precioTotal[arregloPrecioTotal];
                            }
                            System.out.println("----------------------------------------------------");
                            System.out.println("El precio a pagar es: $" + totalVenta);
                            System.out.println("----------------------------------------------------");

                            for (int q = 0; q < 2; q++) {
                                System.out.println("");
                                System.out.println("Si desea pagar con tarjeta oprima 1");
                                System.out.println("Si desea pagar en efectivo oprima 2");
                                Scanner pago = new Scanner(System.in);
                                int pagar = pago.nextInt();
                                switch (pagar) {
                                    case 1:
                                        System.out.println(clientesConTarjeta[numCliente]);
                                        System.out.println(saldosClientes[numCliente]);
                                        saldosClientes[numCliente] -= totalVenta;
                                        System.out.println("----------------------------------------------------");
                                        System.out.println("Usuario: " + clientesConTarjeta[numCliente] + " Nuevo Saldo: " + saldosClientes[numCliente]);
                                        System.out.println("----------------------------------------------------");
                                        q = 2;
                                        break;
                                    case 2:
                                        System.out.println("----------------------------------------------------");
                                        System.out.println("El precio a pagar en efectivo es: $" + totalVenta);
                                        System.out.println("----------------------------------------------------");
                                        q = 2;
                                        break;
                                    default:
                                        System.out.println("----------------------------------------------------");
                                        System.out.println("Digite 1 o 0");
                                        System.out.println("----------------------------------------------------");
                                        q = 0;
                                        break;
                                }

                            }

                            z = 11;
                        }
                    }

                    iniciar = 0;
                    break;

                case 2: //RESERVAR//
                    for (iniciar = 0; iniciar < 10; iniciar++) {

                        for (int i = 0; i < 2; i++) {
                            System.out.println("Ingrese su numero de tarjeta");
                            Scanner identificacion = new Scanner(System.in);
                            int numIdentificacion = identificacion.nextInt();
                            int j;
                            for (j = 0; j < 6; j++) {
                                if (numIdentificacion == clientesConTarjeta[j]) {
                                    TARCINE = true;
                                    System.out.println("Numero de tarjeta: " + clientesConTarjeta[j] + " Saldo : " + saldosClientes[j]);
                                    numCliente = j;
                                    clientesConTarjeta[numCliente] = clientesConTarjeta[j];
                                    saldosClientes[numCliente] = saldosClientes[j];
                                    j = 7;
                                    i = 2;
                                }
                            }
                            if (j == 6) {
                                System.out.println("->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->");
                                System.out.println("Este numero de tarjeta no existe");
                                System.out.println("Por favor, intente de nuevo.");
                                System.out.println("->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->");
                                i = 0;
                            }
                        }
                        System.out.println("->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->");
                        System.out.println("Si desea hacer una reserva oprima 1");
                        System.out.println("Si desea pagar una reserva oprima 2");
                        System.out.println("Si desea cancelar una reserva oprima 3");
                        System.out.println("Si desea salir oprima 0");
                        Scanner reservaMenu = new Scanner(System.in);
                        int menuReser = reservaMenu.nextInt();
                        int reser;
                        String[] SillasOcupadas = new String[10];
                        double[] precioReserTotal;
                        String b_reser;
                        double totalVenta = 0;
                        switch (menuReser) {

                            case 1:
                                System.out.println("->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->");

                                System.out.println("Cuantos asientos desea reservar?");
                                Scanner asientosReser = new Scanner(System.in);
                                reser = asientosReser.nextInt();
                                SillasOcupadas = new String[reser];
                                precioReserTotal = new double[reser];
                                Scanner filaReser = new Scanner(System.in);
                                System.out.println("->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->");
                                for (int z = 0; z < 11; z++) {
                                    int numAsientos = 0;
                                    int sillaNoDisp;
                                    if (numAsientos == reser) {
                                        z = 11;
                                    } else {
                                        for (sillaNoDisp = 0; sillaNoDisp < 10; sillaNoDisp++) {

                                            for (numAsientos = 0; numAsientos < reser; numAsientos++) {
                                                int numArrfila = 11;
                                                int numArrCol = 0;
                                                int i;
                                                int k;
                                                System.out.println("Asiento " + (numAsientos + 1));
                                                System.out.println("");
                                                System.out.println("Recuerde que las filas preferenciales son I, J y K.");
                                                System.out.println("Las filas A hasta H son de categoria general.");
                                                System.out.println("");
                                                //String[][] Sillas = {{"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10", "A11", "A12", "A13", "A14", "A15", "A16", "A17", "A18", "A19", "A20"}, {"B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10", "B11", "B12", "B13", "B14", "B15", "B16", "B17", "B18", "B19", "B20"}, {"C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "C11", "C12", "C13", "C14", "C15", "C16", "C17", "C18", "C19", "C20"}, {"D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", "D11", "D12", "D13", "D14", "D15", "D16", "D17", "D18", "D19", "D20"}, {"E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8", "E9", "E10", "E11", "E12", "E13", "E14", "E15", "E16", "E17", "E18", "E19", "E20"}, {"F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12", "F13", "F14", "F15", "F16", "F17", "F18", "F19", "F20"}, {"G1", "G2", "G3", "G4", "G5", "G6", "G7", "G8", "G9", "G10", "G11", "G12", "G13", "G14", "G15", "G16", "G17", "G18", "G19", "G20"}, {"H1", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10", "H11", "H12", "H13", "H14", "H15", "H16", "H17", "H18", "H19", "H20"}, {"I1", "I2", "I3", "I4", "I5", "I6", "I7", "I8", "I9", "I10", "I11", "I12", "I13", "I14", "I15", "I16", "I17", "I18", "I19", "I20"}, {"J1", "J2", "J3", "J4", "J5", "J6", "J7", "J8", "J9", "J10", "J11", "J12", "J13", "J14", "J15", "J16", "J17", "J18", "J19", "J20"}, {"K1", "K2", "K3", "K4", "K5", "K6", "K7", "K8", "K9", "K10", "K11", "K12", "K13", "K14", "K15", "K16", "K17", "K18", "K19", "K20"}};//

                                                System.out.println("Estos son los asientos disponibles: ");
                                                for (filas = 0; filas < Sillas.length; filas++) {
                                                    System.out.print("|");

                                                    for (columnas = 0; columnas < Sillas[filas].length; columnas++) {

                                                        System.out.print(Sillas[filas][columnas]);
                                                        if (columnas != Sillas[filas].length - 1) {
                                                            System.out.print("\t");
                                                        }
                                                    }
                                                    System.out.println("|");

                                                }

                                                System.out.println("");
                                                System.out.println("Con letra mayuscula escriba la fila en la que desea su asiento numero " + (numAsientos + 1));

                                                b_reser = filaReser.nextLine();

                                                int j;

                                                for (i = 0; i < 11; i++) {
                                                    if (b_reser.compareTo(Filas[i]) == 0) {
                                                        numArrfila = i;

                                                    }
                                                }

                                                if (numArrfila > 10) {
                                                    System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::>Esta fila no existe <:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                                                    System.out.println("Desea intentar de nuevo?");
                                                    Scanner intento = new Scanner(System.in);
                                                    String intentar = intento.next();
                                                    for (int q = 0; q < 2; q++) {
                                                        if (intentar.compareTo("si") == 0) {
                                                            sillaNoDisp = 0;
                                                            numAsientos = numAsientos - 1;
                                                            q = 1;
                                                        } else if (intentar.compareTo("no") == 0) {
                                                            sillaNoDisp = 10;
                                                            numAsientos = reser + 1;
                                                            z = 12;
                                                            q = 1;
                                                        } else {
                                                            System.out.println("Escriba si o no");
                                                            q = 0;
                                                            intentar = intento.next();
                                                        }

                                                        z = 0;
                                                    }
                                                } else {

                                                    for (j = 0; j < 20; j++) {

                                                        System.out.println("Que numero de silla desea en la fila " + Filas[numArrfila] + "?");
                                                        Scanner numeroasiento = new Scanner(System.in);
                                                        String c = numeroasiento.nextLine();

                                                        for (k = 0; k < 20; k++) {
                                                            if (c.compareTo(Columnas[k]) == 0) {
                                                                j = 20;
                                                                numArrCol = k;
                                                            }
                                                        }
                                                        if (j != 20) {
                                                            System.out.println("Seleccione un numero del 1 hasta el 20");
                                                            j = 0;
                                                        }
                                                    }

                                                    if (Sillas[numArrfila][numArrCol].compareTo("X") == 0) {
                                                        System.out.println("Esta silla no esta disponible");
                                                        sillaNoDisp = 10;
                                                        System.out.println("Desea intentar de nuevo?");
                                                        Scanner intento = new Scanner(System.in);
                                                        String intentar = intento.next();
                                                        for (int q = 0; q < 2; q++) {
                                                            if (intentar.compareTo("si") == 0) {
                                                                sillaNoDisp = 0;
                                                                numAsientos = numAsientos - 1;
                                                                q = 1;
                                                            } else if (intentar.compareTo("no") == 0) {
                                                                sillaNoDisp = 10;
                                                                numAsientos = reser + 1;
                                                                z = 12;
                                                                q = 1;
                                                            } else {
                                                                System.out.println("Escriba si o no");
                                                                q = 0;
                                                            }

                                                        }

                                                    } else {
                                                        System.out.println("----------------------------------------------------");
                                                        System.out.println("La silla que seleccionó es: " + Sillas[numArrfila][numArrCol]);
                                                        SillasOcupadas[numAsientos] = Sillas[numArrfila][numArrCol];//
                                                        Sillas[numArrfila][numArrCol] = "X";
                                                        if (numArrfila < 9) {

                                                            precio = 8000;
                                                            if (TARCINE == true) {
                                                                precio = precio - (precio * 0.1);

                                                            }
                                                        } else {
                                                            precio = 11000;
                                                            if (TARCINE == true) {
                                                                precio = precio - (precio * 0.1);
                                                            }
                                                        }
                                                        precioReserTotal[numAsientos] = precio;

                                                        System.out.println("Este asiento cuesta: " + precio);

                                                        System.out.println("----------------------------------------------------");
                                                        sillaNoDisp = 10;

                                                    }
                                                }
                                            }

                                        }
                                        System.out.println("Los asientos seleccionados son: ");
                                        for (int arregloasientosComprados = 0; arregloasientosComprados < reser; arregloasientosComprados++) {
                                            System.out.println("  " + "#" + SillasOcupadas[arregloasientosComprados]);
                                        }
                                        for (int i = 0; i < reser; i++) {
                                            sillasDeReservas[i] = SillasOcupadas[i];
                                        }

                                        for (int arregloPrecioTotal = 0; arregloPrecioTotal < reser; arregloPrecioTotal++) {
                                            totalVenta = totalVenta + precioReserTotal[arregloPrecioTotal];
                                        }
                                        System.out.println("----------------------------------------------------");
                                        System.out.println("El precio a pagar por la reserva es: $" + totalVenta);
                                        System.out.println("----------------------------------------------------");

                                        deuda[numCliente] = totalVenta;

                                    }
                                    z = 11;

                                }

                                iniciar = 10;
                                break;
                            case 2: //PAGO RESERVA//
                                System.out.println(deuda[numCliente]);
                                System.out.println(saldosClientes[numCliente]);

                                saldosClientes[numCliente] = saldosClientes[numCliente] - deuda[numCliente];

                                System.out.println("----------------------------------------------------");
                                System.out.println("Usuario: " + clientesConTarjeta[numCliente] + " Nuevo Saldo: " + saldosClientes[numCliente]);
                                System.out.println("----------------------------------------------------");
                                iniciar = 10;
                                break;
                            case 3: // CANCELAR RESERVA //
                                System.out.println("Los asientos de su reserva son: ");
                                for (int arregloasientosComprados = 0; arregloasientosComprados < sillasDeReservas.length; arregloasientosComprados++) {
                                    System.out.println("  " + "#" + sillasDeReservas[arregloasientosComprados]);
                                }

                                System.out.println("Si desea cancelar su reserva oprima 1.");
                                Scanner canc = new Scanner(System.in);
                                int cancelar = canc.nextInt();
                                switch (cancelar) {
                                    case 1:
                                        for (int arregloasientosComprados = 0; arregloasientosComprados < sillasDeReservas.length; arregloasientosComprados++) {
                                            if (sillasDeReservas[arregloasientosComprados] != null) {
                                                sillasDeReservas[arregloasientosComprados] = null;
                                                deuda[numCliente] = 0;
                                                for (filas = 0; filas < Sillas.length; filas++) {
                                                    for (columnas = 0; columnas < Sillas[filas].length; columnas++) {
                                                        Sillas[filas][columnas] = Filas[filas] + Columnas[columnas];
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    case 0:
                                        iniciar = 10;
                                        break;

                                }
                                iniciar = 10;
                                break;
                            case 0 :
                                iniciar = 10;
                                break;
                        }
                    }

                    iniciar = 0;
                    break;

                /*  for (int q = 0; q < 2; q++) {
                        System.out.println("");
                        System.out.println("Si desea pagar con tarjeta oprima 1");
                        System.out.println("Si desea pagar en efectivo oprima 2");
                        Scanner pago = new Scanner(System.in);
                        int pagar = pago.nextInt();
                        switch (pagar) {
                            case 1:
                                System.out.println(clientesConTarjeta[numCliente]);
                                System.out.println(saldosClientes[numCliente]);
                                saldosClientes[numCliente] -= totalVenta;
                                System.out.println("----------------------------------------------------");
                                System.out.println("Usuario: " + clientesConTarjeta[numCliente] + " Nuevo Saldo: " + saldosClientes[numCliente]);
                                System.out.println("----------------------------------------------------");
                                q = 2;
                                break;
                            case 2:
                                System.out.println("----------------------------------------------------");
                                System.out.println("El precio a pagar en efectivo es: $" + totalVenta);
                                System.out.println("----------------------------------------------------");
                                q = 2;
                                break;
                            default:
                                System.out.println("----------------------------------------------------");
                                System.out.println("Digite 1 o 0");
                                System.out.println("----------------------------------------------------");
                                q = 0;
                                break;
                        }
                    }
                    iniciar = 0;
                    break;
                case 6: //CANCELAR RESERVA//
                    iniciar = 0;
                    break;*/
                case 3: //ADQUIRIR TARJETA//
                    int i;
                    int j;
                    for (i = 0; i < 6; i++) {
                        System.out.println("Ingrese su documento de identidad");
                        Scanner identificacionTar = new Scanner(System.in);
                        int numIdentificacionTar = identificacionTar.nextInt();
                        System.out.println("");
                        for (j = 0; j < clientesConTarjeta.length; j++) {
                            if (numIdentificacionTar == clientesConTarjeta[j]) {
                                System.out.println("->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->");
                                System.out.println("Este numero de tarjeta ya existe");
                                System.out.println("Por favor, intente de nuevo.");
                                System.out.println("->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->");
                                j = 7;
                                i = 0;
                            }
                        }
                        if (j > 6) {

                        } else {
                            for (j = 0; j < clientesConTarjeta.length; j++) {
                                if (clientesConTarjeta[j] != 0) {

                                } else {
                                    clientesConTarjeta[j] = numIdentificacionTar;
                                    saldosClientes[j] = 70000;
                                    System.out.println("");
                                    System.out.println("Recuerde que el saldo inicial de la tarjeta debe ser de 70000.");
                                    System.out.println("----------------------------------------------------");
                                    System.out.println("Nuevo Usuario = " + clientesConTarjeta[j] + " Saldo = " + saldosClientes[j]);
                                    System.out.println("----------------------------------------------------");
                                    System.out.println("Su tarjeta ha sido creada con exito");
                                    j = 7;
                                    i = 7;
                                }
                            }

                        }

                    }
                    iniciar = 0;
                    break;
                case 4: //RECARGAR TARJETA//

                    for (int q = 0; q < 6; q++) {
                        System.out.println("Ingrese su documento de identidad");
                        Scanner idrecarga = new Scanner(System.in);
                        int idExistente = idrecarga.nextInt();
                        int k;
                        for (k = 0; k < clientesConTarjeta.length; k++) {
                            if (idExistente == clientesConTarjeta[k]) {
                                saldosClientes[k] += 50000;
                                System.out.println("");
                                System.out.println("Recuerde que puede recargar la tarjeta con un valor de 50000 cuantas veces desee.");
                                System.out.println("----------------------------------------------------");
                                System.out.println("Nuevo saldo = " + saldosClientes[k]);
                                System.out.println("----------------------------------------------------");
                                System.out.println("Su tarjeta ha sido recargada con exito");
                                k = 6;
                                q = 6;
                            }
                        }
                        if (k > 6) {

                        } else {
                            System.out.println("->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->");
                            System.out.println("Este numero de tarjeta no existe");
                            System.out.println("Por favor, intente de nuevo.");
                            System.out.println("->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->");
                            q = 0;
                        }

                    }

                    iniciar = 0;
                    break;

                case 0:
                    iniciar = 10;
                    break;
                default:
                    System.out.println("Este valor no es valido. Intente de nuevo.");
                    iniciar = 0;
                    break;
            }
        }

    }
}

// Falta: recarga de tarjeta, pago con tarjeta, identificacion de la tarjeta//

