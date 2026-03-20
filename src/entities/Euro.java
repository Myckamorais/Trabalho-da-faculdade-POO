package entities;

public class Euro extends Moeda {

    double valor;

    public Euro(double valor) {
        this.valor = valor;
    }

    @Override
    public void info() {
        System.out.println("Euro - Valor: " + valor);
    }

    @Override
    public double converter(){
        return this.valor * 6.14;
    }
}
