
package paquete02;

public class MenuDia extends Menu{
    private double valorPostre;
    private double valorBebida;

    public MenuDia(String nP, double vI, double vP, double vB) {
        super(nP, vI);
        valorPostre = vP;
        valorBebida = vB;
    }

    public void establecerValorPostre(double m) {
        valorPostre = m;
    }

    public void establecerValorBebida(double m) {
        valorBebida = m;
    }
    
    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicial + valorBebida + valorPostre;
    }

    public double obtenerValorPostre() {
        return valorPostre;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }
    
    @Override
    public String toString() {
        return String.format("Menú del Día:\n%s"
                + "\tValor bebida: %.2f\n"
                + "\tValor postre: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                super.toString(),
                valorBebida,
                valorPostre,
                valorMenu);
    }
}
/*Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00*/

/*nombre del plato
valor del menú
valor inicial del menú
valor de postre
valor de bebida*/