package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List<Contribuinte> listaContribuintes = new ArrayList<>();

        System.out.print("Entre com o número de contribuintes: ");
        int numeroContribuintes = sc.nextInt();

        for (int i = 0; i < numeroContribuintes; i++) {
            System.out.println("Digite os dados do contribuinte #" + (i+1));
            System.out.print("Pessoa física ou jurídica? [f/j] ");
            char tipoContribuinte = sc.next().charAt(0);
    
            System.out.print("Nome: ");
            String nome = sc.next();
    
            System.out.print("Renda anual: ");
            Double rendaAnual = sc.nextDouble();
    
            switch(Character.toLowerCase(tipoContribuinte)){
                case 'f':
                    System.out.print("Gastos com saúde: ");
                    Double gastosSaude = sc.nextDouble();

                    Contribuinte cont = new PessoaFisica(nome, rendaAnual, gastosSaude);
                    listaContribuintes.add(cont);
                    break;
                case 'j':
                    System.out.print("Número de empregados: ");
                    int quantidadeFuncionarios = sc.nextInt();
                    cont = new PessoaJuridica(nome, rendaAnual, quantidadeFuncionarios);
                    listaContribuintes.add(cont);
                    break;
            }
        }
        sc.close();

        System.out.println("\nIMPOSTOS PAGOS:");
        for (Contribuinte cont : listaContribuintes) {
            System.out.println(cont.getNome() + " $" + String.format("%.2f", cont.Imposto()));
        }

        Double totalImpostos = 0d;
        for (Contribuinte cont : listaContribuintes) {
            totalImpostos += cont.Imposto();
        }

        System.out.println("\nTOTAL EM IMPOSTOS: " + String.format("%.2f",totalImpostos));
    }
}