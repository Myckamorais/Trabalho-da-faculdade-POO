package entities;

public class Euro extends Moeda {

    public Euro(double valor) {
        this.valor = valor;
    }

    @Override
    public void info() {
        System.out.printf("Euro - Valor: € %.2f%n", valor);
    }

    @Override
    public double converter(){
        return this.valor * 6.14;
    }

    @Override
    public String toString() {
        return "Euro: " + valor;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Euro outraMoeda = (Euro) obj;
        return Double.compare(outraMoeda.valor, this.valor) == 0;
    }

}
