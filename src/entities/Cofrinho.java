package entities;

import java.util.ArrayList;

public class Cofrinho {

    // Vai listar e guardar a Classe Moeda
    private ArrayList<Moeda> listaMoedas = new ArrayList<>();

    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
        System.out.println("Moeda de " + moeda + " adicionada!");
    }

    public void remover(Moeda moeda) {
        if (listaMoedas.remove(moeda)) {
            System.out.println("Moeda removida com sucesso!");
        } else {
            System.out.println("Moeda não encontrada no cofrinho!");
        }
    }

    public void listagemMoedas(){
        if (listaMoedas.isEmpty()) {
            System.out.println("O cofrinho está vazio!");
            return;
        }
        //Vai mostrar as informacoes das moedas
        System.out.println("--- Moedas no Cofrinho ---");
        for (Moeda m : listaMoedas){
            m.info();
        }
    }

    public double totalConvertido() {
        double total = 0;
        for ( Moeda m : listaMoedas) {
             total += m.converter();
        }
        return total;
    }

}
