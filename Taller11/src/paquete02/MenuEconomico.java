
package paquete02;

public class MenuEconomico extends Menu{
    private double descuento;

    public MenuEconomico(String nP, double vI, double des) {
        super(nP, vI);
        descuento = des;
    }

    public void establecerDescuento(double m) {
        descuento = m;
    }

    public double obtenerDescuento() {
        return descuento;
    }
    
    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicial - (valorInicial* (descuento / 100));
    }

    @Override
    public String toString() {
        return String.format("Menú Económico:\n%s"
                + "\tPorcentaje Descuento: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                super.toString(),
                obtenerDescuento(),
                obtenerValorMenu());
    }    
}
/*Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00*/

/*nombre del plato
valor del menú
valor inicial del menú
porcentaje de descuento, en referencia al valor inicial del menú*/