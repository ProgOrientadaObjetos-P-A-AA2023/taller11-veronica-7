
package paquete02;
import java.util.ArrayList;

public class Cuenta {
    private String nombreC;
    private ArrayList<Menu> listado;
    private double valorTotal;
    private double subtotal;
    private double iva;

    public Cuenta(String nomC, ArrayList<Menu> lista, double iv) {
        nombreC = nomC;
        listado = lista;
        iva = iv;
    }
/*Un cuenta por pagar está compuesta por características como: nombre del 
    cliente, listado de todos las cartas(menú) solicitados por el cliente, 
    valor a cancelar total, subtotal, Iva.*/
    
    public void establecerNombreC(String m) {
        nombreC = m;
    }

    public void establecerListado(ArrayList<Menu> m) {
        listado = m;
    }
    
    public void establecerValorCancelar() {
        valorTotal = subtotal + (subtotal * iva) / 100;
    }
    
    public void establecerSubtotal() {
        double suma = 0;
        for (int i = 0; i < listado.size(); i++) {
            suma += listado.get(i).obtenerValorMenu();
        }       
        subtotal = suma;
    }


    public void establecerIva(double m) {
        iva = m;
    }
    
    public String obtenerNombreC() {
        return nombreC;
    }
    
    public ArrayList<Menu> obtenerListado() {
        return listado;
    }
    
    public double obtenerValorTotal() {
        return valorTotal;
    }
    
    public double obtenerSubtotal() {
        return subtotal;
    }
    
    public double obtenerIva() {
        return iva;
    }
    
    
    @Override
    public String toString() {
        String cadena = String.format("Factura\nCliente: %s\n", 
                obtenerNombreC());

        for (int i = 0; i < listado.size(); i++) {
            cadena = String.format("%s%s\n", cadena, listado.get(i));
        }

        cadena = String.format("%s\n"
                + "Subtotal: $%.1f\n"
                + "IVA: %.1f\n"
                + "Total: $%.3f\n",
                cadena,
                obtenerSubtotal(),
                obtenerIva(),
                obtenerValorTotal());

        return cadena;
    }
}
