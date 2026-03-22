package entities;

public class Real extends Moeda {

    public Real(double valor) {
        this.valor = valor;
    }

    @Override
    public void info() {
        System.out.printf("Real - Valor: R$ %.2f%n", valor);
    }

    @Override
    public double converter() {
        // Como o total do cofrinho já é em Real vai retornar o próprio valor.
        return this.valor;
    }

    @Override
    public String toString() {
        return "Real: R$ " + String.format("%.2f", valor);
    }

    @Override
    public boolean equals(Object obj) {
        // Se for o mesmo endereço de memória, é igual
        if (this == obj) return true;
        // Se o objeto comparado for nulo ou de classe diferente, é diferente
        if (obj == null || getClass() != obj.getClass()) return false;
        // Aqui vai converte o objeto e compara o valor numérico
        Real outraMoeda = (Real) obj;
        return Double.compare(outraMoeda.valor, this.valor) == 0;
    }


}
