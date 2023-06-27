
package paquete01;

import java.util.ArrayList;
import paquete02.*;

public class Ejecutor02 {
    public static void main(String[] args) {
        
        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
            {"Niños 02", "3.00", "1", "1.5"},
            {"Niños 03", "2.00", "2", "0.5"},
        };
        
        String[][] datos002 = {{"Econo 001", "4", "25"}, 
            {"Econo 002", "4", "15"},
            {"Econo 003", "4", "35"}
        };
        
        String[][] datos003 = { {"Dia 001", "5", "1", "1"}, 
            {"Dia 002", "6", "2", "2"},
            {"Dia 003", "5.5", "3", "1"},
        };
        
        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"}, 
            {"Carta 002", "7", "1.7", "2.1", "5"}, 
            {"Carta 003", "8", "1.9", "2.2", "5"}, 
            {"Carta 004", "9", "2.5", "2.9", "5"}, 
        };
                
        
        // Lista de Menus
        ArrayList<Menu> lista = new ArrayList<>();
        
        /* Agregar un proceso para generar objetos de tipo Menu Carta, Día, 
        Economico y Niño*. Cada arreglo datos, se corresponde a un tipo de Menú.
        Iterar y crear los objetos según corresponda. Cada objeto generado, 
        agregar al ArrayList lista*/
        // Inicio de solución
        
        // Fin de solución
        
        
        
        /* Double.parseDouble:
        Se utiliza para convertir una cadena de caracteres. En este caso se 
        utiliza para convertir los valores de las cadenas datos001[i][1], 
        datos001[i][2] y datos001[i][3] en números de tipo double. */
        for (int i = 0; i < datos001.length; i++) {
            String nombrePlato = datos001[i][0];
            double valorInicial = Double.parseDouble(datos001[i][1]);
            double porcionH = Double.parseDouble(datos001[i][2]);
            double porcionP = Double.parseDouble(datos001[i][3]);
            
            Menu menuN = new MenuNinos(nombrePlato, valorInicial, porcionH, 
                    porcionP);
            lista.add(menuN);
        }

        for (int i = 0; i < datos002.length; i++) {
            String nombrePlato = datos002[i][0];
            double valorInicial = Double.parseDouble(datos002[i][1]);
            double descuento = Double.parseDouble(datos002[i][2]);
            
            Menu menuE = new MenuEconomico(nombrePlato, valorInicial, 
                    descuento);
            lista.add(menuE);
        }

        for (int i = 0; i < datos003.length; i++) {
            String nombrePlato = datos003[i][0];
            double valorInicial = Double.parseDouble(datos003[i][1]);
            double valorP = Double.parseDouble(datos003[i][2]);
            double valorB = Double.parseDouble(datos003[i][3]);
            
            Menu menuD = new MenuDia(nombrePlato, valorInicial, valorP, valorB);
            lista.add(menuD);
        }

        for (int i = 0; i < datos004.length; i++) {
            String nombrePlato = datos004[i][0];
            double valorInicial = Double.parseDouble(datos004[i][1]);
            double valorG = Double.parseDouble(datos004[i][2]);
            double valorB = Double.parseDouble(datos004[i][3]);
            double adicional = Double.parseDouble(datos004[i][4]);
            
            Menu menuC = new MenuCarta(nombrePlato, valorInicial, valorG, 
                    valorB, adicional);
            lista.add(menuC);
        }
        
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).establecerValorMenu();
        }
        
        // Un objeto de tipo Cuenta
        Cuenta miCuenta = new Cuenta("Luis Andrade", lista, 10);
        miCuenta.establecerSubtotal();
        miCuenta.establecerValorCancelar();
        System.out.printf("%s\n", miCuenta);
    }
}
