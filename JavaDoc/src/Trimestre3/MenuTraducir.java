package Trimestre3;

import utilidades.Entrada;
/**
 * Este codigo implementa un programa de traduccion de palabras entre varios idiomas
 * (ingles, espaniol y aleman).
 * 
 * @author Sergio Gutierrez
 * @version 20
 * @since 03/04/2024
 */
public class MenuTraducir {

    /**
     * @param args Los argumentos de la linea de comandos (no se utilizan en este
     *             programa).
     *             
     * Metodo principal que inicia el programa de traduccion.
     *             
     */
    public static void main(String args[]) {
        String[] diccEsp = {"cabra", "petirrojo", "árbol", "perro", "loro"};
        String[] diccIng = {"goat", "robin", "tree", "dog", "parrot"};
        String[] diccAle = {"ziege", "robin", "ana", "manuel", "papagei"};
        int op;

        do {
            mostrarMenu();
            op = Entrada.entero();
            switch (op) {
                case 1:
                    opcionTraducirIngEsp(diccIng, diccEsp);
                    break;
                case 2:
                    opcionTraducirEspIng(diccEsp, diccIng);
                    break;
                case 3:
                    opcionTraducirEspAle(diccEsp, diccAle);
                    break;
                case 4:
                    opcionTraducirAleEsp(diccAle, diccEsp);
                    break;
                case 0:
                    System.out.println("¡ Adiós !");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (op != 0);
    }

    /**
     * Traduce una palabra del ingles al espaniol.
     *
     * @param diccIng El diccionario de palabras en ingles.
     * @param diccEsp El diccionario de palabras en espaniol.
     */
    
    public static void opcionTraducirIngEsp(String[] diccIng, String[] diccEsp) {
        System.out.print("Palabra en inglés: ");
        String pal = Entrada.cadena();
        int pos = indexOf(diccIng, pal);
        if (pos == -1)
            System.out.println("Palabra no encontrada en el diccionario de inglés.");
        else
            System.out.println(pal + " en español es " + diccEsp[pos]);
    }

    /**
     * Traduce una palabra del espaniol al ingles.
     *
     * @param diccEsp El diccionario de palabras en espaniol.
     * @param diccIng El diccionario de palabras en ingles.
     */
    
    public static void opcionTraducirEspIng(String[] diccEsp, String[] diccIng) {
        System.out.print("Palabra en español: ");
        String pal = Entrada.cadena();
        int pos = indexOf(diccEsp, pal);
        if (pos == -1)
            System.out.println("Palabra no encontrada en el diccionario de español.");
        else
            System.out.println(pal + " en inglés es " + diccIng[pos]);
    }

    /**
     * Traduce una palabra del espaniol al aleman.
     *
     * @param diccEsp El diccionario de palabras en espaniol.
     * @param diccAle El diccionario de palabras en aleman.
     */
    
    public static void opcionTraducirEspAle(String[] diccEsp, String[] diccAle) {
        System.out.print("Palabra en español: ");
        String pal = Entrada.cadena();
        int pos = indexOf(diccEsp, pal);
        if (pos == -1)
            System.out.println("Palabra no encontrada en el diccionario de español.");
        else
            System.out.println(pal + " en alemán es " + diccAle[pos]);
    }

    /**
     * Traduce una palabra del aleman al espaniol.
     *
     * @param diccAle El diccionario de palabras en aleman.
     * @param diccEsp El diccionario de palabras en espaniol.
     */
    
    public static void opcionTraducirAleEsp(String[] diccAle, String[] diccEsp) {
        System.out.print("Palabra en Alemán: ");
        String pal = Entrada.cadena();
        int pos = indexOf(diccAle, pal);
        if (pos == -1)
            System.out.println("Palabra no encontrada en el diccionario de alemán.");
        else
            System.out.println(pal + " en español es " + diccEsp[pos]);
    }
    
    /**
     * Muestra el menu de opciones disponibles.
     */
    
    public static void mostrarMenu() {
        
        System.out.println("");
        System.out.println("1-Traducir de inglés a español");
        System.out.println("2-Traducir de español a inglés");
        System.out.println("3-Traducir de español a alemán");
        System.out.println("4-Traducir de alemán a español");
        System.out.println("0-Salir");
        System.out.println("Elija una opción");
    }

    /**
     * Busca la posicion de una palabra en un diccionario.
     *
     * @param dicc El diccionario de palabras.
     * @param pal  La palabra a buscar.
     * @return La posicion de la palabra en el diccionario si se encuentra, de lo
     *         contrario, -1.
     */
    
    public static int indexOf(String[] dicc, String pal) {
        int encontrado = -1; // Indica que no existe

        for (int i = 0; i < dicc.length && encontrado == -1; i++) {
            if (dicc[i].equalsIgnoreCase(pal))
                encontrado = i;
        }
        return encontrado;
    }
}
