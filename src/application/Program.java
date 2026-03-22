package application;

import entities.*;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Cofrinho cofrinho = new Cofrinho();

        int opcao;

        System.out.println("--- MENU COFRINHO ---");
        do {
            System.out.println("\n1 - Adicionar Moeda");
            System.out.println("2 - Remover Moeda");
            System.out.println("3 - Listar Moedas");
            System.out.println("4 - Calcular Total Convertido");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Escolha a moeda: (1 - Real 2 - Dolar 3 - Euro)");
                    int tipoMoeda = sc.nextInt();
                    System.out.print("Digite o valor: ");
                    double valorAdd = sc.nextDouble();

                    //Escolhe a opção e já adiciona a moeda e cria o objeto
                    if (tipoMoeda == 1) cofrinho.adicionar(new Real(valorAdd));
                    else if (tipoMoeda == 2) cofrinho.adicionar(new Dolar(valorAdd));
                    else if (tipoMoeda == 3) cofrinho.adicionar(new Euro(valorAdd));
                    break;

                case 2:
                    System.out.println("Qual moeda deseja remover? (1 - Real 2 - Dolar 3 -Euro) ");
                    int tipoRem = sc.nextInt();
                    System.out.print("Digite o valor exato para remover: ");
                    double valorRem = sc.nextDouble();

                    Moeda m = null;
                    if (tipoRem == 1) m = new Real(valorRem);
                    else if (tipoRem == 2) m = new Dolar(valorRem);
                    else if (tipoRem == 3) m = new Euro(valorRem);

                    if (m != null) cofrinho.remover(m);
                    break;

                case 3:
                    cofrinho.listagemMoedas();
                    break;

                case 4:
                    double total = cofrinho.totalConvertido();
                    System.out.printf("Total no cofrinho (convertido para Real): R$ %.2f%n", total);
                    break;

                case 0:
                    System.out.println("Encerrado");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);


        sc.close();


    }
}