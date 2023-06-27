
package paquete02;

public class MenuCarta extends Menu {
    private double valorGuarnicion;
    private double valorBebida;
    private double adicional;
    
    public MenuCarta(String nP, double vI, double vG, double vB, double a) {
        super(nP, vI);
        valorGuarnicion = vG;
        valorBebida = vB;
        adicional = a;
    }

    public void establecerValorGuarnicion(double m) {
        valorGuarnicion = m;
    }

    public void establecerValorBebida(double m) {
        valorBebida = m;
    }

    public void establecerAdicional(double m) {
        adicional = m;
    } 
    
    @Override
    public void establecerValorMenu() {
        valorMenu = (valorInicial * (adicional / 100))
                + (valorInicial + valorGuarnicion + valorBebida);
    }

    public double obtenerValorGuarnicion() {
        return valorGuarnicion;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerAdicional() {
        return adicional;
    } 
    
     @Override
    public String toString() {
        return String.format("Menú a la Carta:\n%s"
                + "\tValor guarnición: %.2f\n"
                + "\tValor bebida: %.2f\n"
                + "\tPorcentaje Adicional: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                super.toString(),
                obtenerValorGuarnicion(),
                obtenerValorBebida(),
                obtenerAdicional(),
                obtenerValorMenu());
    }
}
/*Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0

	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10*/

/*nombre del plato
valor del menú
valor inicial del menú
valor de porción de guarnición
valor de bebida
porcentaje adicional por servicio en relación del valor inicial del menú*/