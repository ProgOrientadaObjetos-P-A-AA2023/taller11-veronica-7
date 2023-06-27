
package paquete02;

public abstract class Menu  {
    protected String nombrePlato;
    protected double valorInicial;
    protected double valorMenu;

    public Menu(String nP, double vI) {
        nombrePlato = nP;
        valorInicial = vI;   
    }
 
    public void establecerNombrePlato(String m) {
        nombrePlato = m;
    }

    public void establecerValorInicialMenu(double m) {
        valorInicial = m;
    }
    
    public abstract void establecerValorMenu(); // metodo abstracto.
    
    public String obtenerNombrePlato() {
        return nombrePlato;
    }
    
    public double obtenerValorInicialMenu() {
        return valorInicial;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }
    
     @Override
    public String toString() {
        return String.format("\tPlato: %s\n"
                + "\tValor Inicial: %.2f\n",
                obtenerNombrePlato(),
                obtenerValorInicialMenu());
    }
}

