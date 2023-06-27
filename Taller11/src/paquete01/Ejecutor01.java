
package paquete01;

import java.util.ArrayList;
import paquete02.*;

public class Ejecutor01 {

    public static void main(String[] args) {
        
        ArrayList<Menu> lista = new ArrayList<>();

        Menu menuN1 = new MenuNinos("Niños 01", 2, 1, 1.5);
        menuN1.establecerValorMenu();
        lista.add(menuN1);
        
        Menu menuN2 = new MenuNinos("Niños 02", 3, 1, 1.5);
        menuN2.establecerValorMenu();
        lista.add(menuN2);

        Menu menuE = new MenuEconomico("Econo 001", 4, 25);
        menuE.establecerValorMenu();
        lista.add(menuE);

        Menu menuD = new MenuDia("Dia 001", 5, 1, 1);
        menuD.establecerValorMenu();
        lista.add(menuD);

        Menu menuC = new MenuCarta("Carta 001", 6, 1.5, 2, 10);
        menuC.establecerValorMenu();
        lista.add(menuC);
        
        
        Cuenta cuenta = new Cuenta("René Elizalde", lista, 10);
        cuenta.establecerSubtotal();
        cuenta.establecerValorCancelar();

        System.out.print(cuenta);
    }
}

// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu del Día:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu del Día:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

*/