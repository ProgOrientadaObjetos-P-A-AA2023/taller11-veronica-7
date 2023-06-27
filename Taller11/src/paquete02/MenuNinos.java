
package paquete02;

public class MenuNinos extends Menu {
    private double porcionH;
    private double porcionP;

    public MenuNinos(String nP, double vI, double pH, double pP) {
        super(nP, vI);
        porcionH = pH;
        porcionP = pP;
    }
    
    public void establecerPorcionH(double m) {
        porcionH = m;
    }

    public void establecerPorcionP(double m) {
        porcionP = m;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicial + porcionH + porcionP;
    }

    public double obtenerPorcionH() {
        return porcionH;
    }

    public double obtenerPorcionP() {
        return porcionP;
    }

    @Override
    public String toString() {
        return String.format("Menú de Niños:\n%s"
                + "\tValor helado: %.2f\n"
                + "\tValor pastel: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                super.toString(),
                obtenerPorcionH(),
                obtenerPorcionP(),
                obtenerValorMenu());
    }
}
/*Menu del Día:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50*/

/*nombre del plato
valor del menú
valor inicial del menú
valor de porción de helado
valor de porción de pastel*/