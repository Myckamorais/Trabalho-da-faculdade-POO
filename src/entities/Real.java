package entities;

public class Real extends Moeda {

    double valor;

    public Real(double valor) {
        this.valor = valor;
    }

    @Override
    public void info() {
        System.out.printf("Real - Valor: R$ " + String.format("%.2f", valor));
    }

    @Override
    public double converter() {
        // Como o total do cofrinho já é em Real vai retornar o próprio valor.
        return this.valor;
    }
}
