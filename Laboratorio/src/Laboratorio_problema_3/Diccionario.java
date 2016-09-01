package Laboratorio_problema_3;

import java.util.Scanner;

public class Diccionario {
    private String[] espanol;
    private String[] ingles;
    private String[] frances;
    private String[] italiano;
    private int tamanoActualDiccionario = 0;
    private final int TAMANO_POR_DEFECTO = 100;
    
    // Construye un diccionario con tamaÃ±o por defecto.     
     
    public Diccionario() {
        espanol = new String[TAMANO_POR_DEFECTO];
        ingles = new String[TAMANO_POR_DEFECTO];
        frances = new String[TAMANO_POR_DEFECTO];
        italiano = new String[TAMANO_POR_DEFECTO];
    }
    
    /** Construye un diccionario con el tamaÃ±o que se digita como parametro.
     * 
     * @param tamano Indica el tamaÃ±o mÃ¡ximo del diccionario.
     */
    public Diccionario(int tamano) {
        espanol = new String[tamano];
        ingles = new String[tamano];  
        frances = new String[tamano]; 
        italiano = new String[tamano];
    }
    
    /** AÃ±ade una palabra espaÃ±ola y su traducciÃ³n al diccionario.
     *  En caso de que la palabra espaÃ±ola ya estÃ© en el diccionario o que estÃ©
     *  tenga tantas palabras como su capacidad, devuelve false; en otro caso, devuelve
     *  true.     * 
     * 
     * @param e String conteniendo la palabra espaÃ±ola.
     * @param i String conteniendo la palabra inglesa.
     * * @param f String conteniendo la palabra francesa.
     * * @param it String conteniendo la palabra italiana.
     * @return Boolean indicando si se aÃ±adio correctamente la palabra.
     */
    public boolean nuevaEntrada(String e, String i, String f, String it) {
        boolean insertadaCorrectamente = false;
        boolean seEncontroCoincidencia = false;
        
        int j = 0;
        while (!insertadaCorrectamente && j < espanol.length && !seEncontroCoincidencia) {
            if (espanol[j] == null) {
                espanol[j] = e;
                ingles[j] = i;
                frances[j] = f;
                italiano[j] = it;
                tamanoActualDiccionario++;
                insertadaCorrectamente = true;
            } 
            else if (espanol[j].equals(e)){
                seEncontroCoincidencia = true;
            }                              
            j++;
        }
        
        return insertadaCorrectamente;
            
    }
    
    
    /** Devuelve el contenido de todo el diccionario formateado en una cadena.
     * 
     * @return Un String con el nÃºmero de palabras, la capacidad mÃ¡xima del diccionario 
     * y con cada palabra espaÃ±ola y su traducciÃ³n.
     */
    public String getContenidoCompleto() {
        String diccionario = "El dicccionario tiene actualmente " + tamanoActualDiccionario + " entradas (puede contener hasta " + espanol.length + " entradas)\n";
        
        for (int i = 0; i < tamanoActualDiccionario; i++) {
                diccionario += espanol[i] + " > " + ingles[i] + " > " + frances[i] + " > " + italiano[i] + "\n";                       
        }
        
        return diccionario;        
    }
    
    
    /** Traduce palabraATraducir al idioma de destino
     * 
     * @param palabraATraducir Contiene la palabra a traducir.
     * @param palabrasIdiomaOrigen arreglo de palabras en el idioma origen.
     * @param palabrasIdiomaDestino arreglo de palabras en el idioma destino.
     * @return Un String conteniendo la palabra traducida o null si no se encontrÃ³
     * traducciÃ³n.
     */
    private String traduce(String palabraATraducir, String[] palabrasIdiomaOrigen, String[] palabrasIdiomaDestino) {
        String traduccion = null;
        
        palabraATraducir = palabraATraducir.trim();
        
        for (int i = 0; i < tamanoActualDiccionario; i++) {
            if (palabrasIdiomaOrigen[i].equals(palabraATraducir)) {
                traduccion = palabrasIdiomaDestino[i];
            }
        }
        
        return traduccion;
        
    }
    
    
    /** Traduce una Ãºnica palabra espaÃ±ola al ingles, francÃ©s e italiano.
     * 
     * @param e Contiene la palabra a traducir.
     * @return Un String conteniendo la palabra traducida o null si no se encontrÃ³
     * traducciÃ³n.
     */
    public String traduce2Ingles(String e) {
        return traduce(e, espanol, ingles);
    }
    
    public String traduce2Frances(String e) {
        return traduce(e, espanol, frances);
    }
    
    public String traduce2Italiano(String e) {
        return traduce(e, espanol, italiano);
    }

     /** Traduce una Ãºnica palabra inglesa, francesa e italiana al espaÃ±ol.
     * 
     * @param e Contiene la palabra a traducir.
     * @return Un String conteniendo la palabra traducida o null si no se encontrÃ³
     * traducciÃ³n.
     */
    public String traduceIngles2Espanol(String i) {
        return traduce(i, ingles, espanol);
    }
       
    public String traduceFrances2Espanol(String i) {
        return traduce(i, frances, espanol);
    }
    
    public String traduceItaliano2Espanol(String i) {
        return traduce(i, italiano, espanol);
    }
    
    /** Traduce un arreglo de palabras al idioma de destino.
     * 
     * @param palabras arreglo con las palabras a traducir en el idioma origen.
     * @param palabrasIdiomaOrigen arreglo con las palabras del diccionario en el idioma
     * de origen.
     * @param palabrasIdiomaDestino arreglo con los palabras del diccionario en el
     * idioma de destino.
     * @return arreglo conteniendo las palabras traducidas con null en aquellas posiciones
     * en las que no se pudo encontrar una traducciÃ³n.
     */
    private String[] traduce(String[] palabras, String[] palabrasIdiomaOrigen, String[] palabrasIdiomaDestino) {
        String[] resultado = new String[palabras.length];
        
        for (int i = 0; i < palabras.length; i++) {
            resultado[i] = traduce(palabras[i], palabrasIdiomaOrigen, palabrasIdiomaDestino);
        }
        
        return resultado;
        
    }
    
    /** Traduce un arreglo de palabras espaÃ±olas al ingles, francÃ©s e italiano.
     * 
     * @param palabras arreglo conteniendo las palabras espaÃ±olas a traducir.
     * @return arreglo conteniendo las palabras traducidas con null en aquellas 
     * posiciones en las que no se pudo encontrar una traducciÃ³n.
     */
    public String[] traduce2Ingles(String[] palabras) {
        return traduce(palabras, espanol, ingles);
    }
    
    public String[] traduce2Frances(String[] palabras) {
        return traduce(palabras, espanol, frances);
    }
    
    public String[] traduce2Italiano(String[] palabras) {
        return traduce(palabras, espanol, italiano);
    }
    
    /** Traduce un arreglo de palabras inglesas, francesas e italianas al espaÃ±ol.
     * 
     * @param palabras arreglo conteniendo las palabras inglesas, francesas e italianas a traducir.
     * @return arreglo conteniendo las palabras traducidas con null en aquellas 
     * posiciones en las que no se pudo encontrar una traducciÃ³n.
     */
    public String[] traduceIngles2Espanol(String[] palabras) {
        return traduce(palabras, ingles, espanol);
    }
    
    public String[] traduceFrances2Espanol(String[] palabras) {
        return traduce(palabras, frances, espanol);
    }
    
    public String[] traduceItaliano2Espanol(String[] palabras) {
        return traduce(palabras, italiano, espanol);
    }
    /** Busca una palabra parecida a palabra en el arreglo listadoPalabras.
     * 
     * @param palabra String conteniendo la palabra base de la bÃºsquyeda.
     * @param listadoPalabras arreglo conteniendo las palabras del diccionario entre 
     * las que buscar alguna parecida a palabra.
     * @return Un String conteniendo una palabra parecida a palabra o null en caso
     * de no encontrar ninguna.
     */
    public String sugerirPalabra(String palabra, String[] listadoPalabras) {
        String resultado = null;      
        
        palabra = palabra.trim();
        int longitudDeLaPalabra = palabra.length();
        
        for (int i = 0; i < tamanoActualDiccionario; i++) {
            String palabraAComparar = listadoPalabras[i];
                                               
            if (longitudDeLaPalabra == palabraAComparar.length()) {
                int numeroLetrasDiferentes = 0;               
                
                for (int j = 0; j < longitudDeLaPalabra; j++) {
                    if (palabra.charAt(j) != palabraAComparar.charAt(j))
                        numeroLetrasDiferentes++;                                        
                }
                
                if (numeroLetrasDiferentes == 1)
                    resultado = palabraAComparar;
            }                                                 
        }
        
        return resultado;
    }
        
        
    /** Busca una palabra parecida a palabra en el conjunto de palabras inglesas del
     * diccionario.
     * 
     * @param palabra String conteniendo la palabra base de la bÃºsqueda.
     * @return Un String conteniendo una palabra parecida a palabra o null en caso
     * de no encontrar ninguna.
     */
    public String sugerirPalabraIngles(String palabra) {
        return sugerirPalabra(palabra, ingles);
    }
    
    /** Busca una palabra parecida a palabra en el conjunto de palabras espaÃ±olas del
     * diccionario.
     * 
     * @param palabra String conteniendo la palabra base de la bÃºsqueda.
     * @return Un String conteniendo una palabra parecida a palabra o null en caso
     * de no encontrar ninguna.
     */    
    public String sugerirPalabraEspanol(String palabra) {
        return sugerirPalabra(palabra, espanol);
    }
    
        /** Busca una palabra parecida a palabra en el conjunto de palabras francesas del
     * diccionario.
     * 
     * @param palabra String conteniendo la palabra base de la bÃºsqueda.
     * @return Un String conteniendo una palabra parecida a palabra o null en caso
     * de no encontrar ninguna.
     */    
        public String sugerirPalabraFrances(String palabra) {
        return sugerirPalabra(palabra, frances);
    }
 
     /** Busca una palabra parecida a palabra en el conjunto de palabras italianas del
     * diccionario.
     * 
     * @param palabra String conteniendo la palabra base de la bÃºsqueda.
     * @return Un String conteniendo una palabra parecida a palabra o null en caso
     * de no encontrar ninguna.
     */    
 
    public String sugerirPalabraItaliano(String palabra) {
        return sugerirPalabra(palabra, italiano);
    }
    
    // Realiza la operaciÃ³n de traducciÃ³n
    public static String procesarTraduccion(Diccionario miDiccionario, String[] palabras, String[] palabrasTraducidas, Integer idioma) {
        String resultado = "";

        for (int i = 0; i < palabras.length; i++) {
            if (palabrasTraducidas[i] == null) {
                String sugerencia;
                if (idioma == 0) { //espanol
                    sugerencia = miDiccionario.sugerirPalabraEspanol(palabras[i]);
                } else if (idioma == 1) { //ingles
                    sugerencia = miDiccionario.sugerirPalabraIngles(palabras[i]);
                } else if (idioma == 2) { //frances
                    sugerencia = miDiccionario.sugerirPalabraFrances(palabras[i]);
                } else { //italiano
                    sugerencia = miDiccionario.sugerirPalabraItaliano(palabras[i]);
                }
                if (sugerencia == null) {
                    resultado += "No la conozco, ";
                } else {
                    resultado += "No la conozco (quizas querras decir " + sugerencia + "), ";
                }
                    
            } else {
                resultado += palabrasTraducidas[i] + " ";
            }
        }
        
        resultado = resultado.substring(0, resultado.length()-1);

        return resultado;
    }
             
    public static void main(String[] args) {
        // TODO code application logic here
        
        Diccionario miDiccionario;
        Scanner teclado = new Scanner(System.in);
        String[] palabras;
        String[] traduccion;
       
        int opcion = 0;

        System.out.println("¿Quieres ajustar el tamaño del Diccionario? (si/no)");
        String respuesta = teclado.nextLine();

        if (respuesta.equals("si")) {
            System.out.println("Ingresa el tamaño:");
            int tamano = Integer.parseInt(teclado.nextLine());
            miDiccionario = new Diccionario(tamano);   
            
        } else {
            miDiccionario = new Diccionario();  
        }

        while (opcion != 9) {
            System.out.println("DICCIONARIO ** Menuº Principal **");
            System.out.println("1. Agregar palabra al Diccionario");
            System.out.println("2. Español - English");
            System.out.println("3. English  - Español");
            System.out.println("4. Español - Frances");
            System.out.println("5. Frances  - Español");
            System.out.println("6. Español - Italiano");
            System.out.println("7. Italiano  - Español");
            System.out.println("8. Listado completo");
            System.out.println("9. Salir");
            try {
                opcion = Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException e) {
                opcion = 0;
            }
            

            switch (opcion) {
                case 1:
                    System.out.println("Introduce la palabra en Español:");
                    String e = teclado.nextLine();
                    System.out.println("Introduce la palabra en English:");
                    String i = teclado.nextLine();
                    System.out.println("Introduce la palabra en Frances:");
                    String f = teclado.nextLine();
                    System.out.println("Introduce la palabra en Italiano:");
                    String it = teclado.nextLine();
                    boolean insertadaCorrectamente = miDiccionario.nuevaEntrada(e, i, it, f);
                    if (!insertadaCorrectamente) {
                        System.out.println("ERROR: Por algun motivo la palabra no se pudo añadir.");
                    } else {
                        System.out.println("Palabra aÃ±adida correctamente al diccionario.");
                    }
                    break;

                case 2:
                    System.out.println("Palabra o palabras a traducir de Español a English:");
                    palabras = teclado.nextLine().split(" ");
                    traduccion = miDiccionario.traduce2Ingles(palabras);
                    System.out.println(procesarTraduccion(miDiccionario, palabras, traduccion, 0) + "\n");
                    break;

                case 3:
                    System.out.println("Palabra o palabras a traducir de English a Español:");
                    palabras = teclado.nextLine().split(" ");
                    traduccion = miDiccionario.traduceIngles2Espanol(palabras);
                    System.out.println(procesarTraduccion(miDiccionario, palabras, traduccion, 1) + "\n");
                    break;

                case 4:
                    System.out.println("Palabra o palabras a traducir de Español a Frances:");
                    palabras = teclado.nextLine().split(" ");
                    traduccion = miDiccionario.traduce2Frances(palabras);
                    System.out.println(procesarTraduccion(miDiccionario, palabras, traduccion, 0) + "\n");
                    break;

                case 5:
                    System.out.println("Palabra o palabras a traducir de Frances a Español:");
                    palabras = teclado.nextLine().split(" ");
                    traduccion = miDiccionario.traduceFrances2Espanol( palabras);
                    System.out.println(procesarTraduccion(miDiccionario, palabras, traduccion, 2) + "\n");
                    break;
                    
                case 6:
                    System.out.println("Palabra o palabras a traducir de Español a Italiano:");
                    palabras = teclado.nextLine().split(" ");
                    traduccion = miDiccionario.traduce2Italiano(palabras);
                    System.out.println(procesarTraduccion(miDiccionario, palabras, traduccion, 0) + "\n");
                    break;

                case 7:
                    System.out.println("Palabra o palabras a traducir de italiano a español:");
                    palabras = teclado.nextLine().split(" ");
                    traduccion = miDiccionario.traduceItaliano2Espanol(palabras);
                    System.out.println(procesarTraduccion(miDiccionario, palabras, traduccion, 3) + "\n");
                    break;
                
                case 8:
                    System.out.println(miDiccionario.getContenidoCompleto());
                    break;
                case 9:
                    break;
                    
                default:
                    System.out.println("Opción invalida \n");
                    break;
            }


        }

    }
}
