package projetoLoja;

import java.util.Scanner;

public class LojaColchoes {

    public static void main(String[] args){
        ModelosColchoes modelo1 = new ModelosColchoes("Exemplo Colchão Firme");
        ModelosColchoes modelo2 = new ModelosColchoes("Exemplo Colchão Macio");
        ModelosColchoes modelo3 = new ModelosColchoes("Exemplo Colchão Meio Termo");

        Conforto conforto1 = new Conforto("Firme");
        Conforto conforto2 = new Conforto("Macio");
        Conforto conforto3 = new Conforto("Meio Termo");

        modelo1.adicionarConforto(conforto1);
        modelo2.adicionarConforto(conforto2);
        modelo3.adicionarConforto(conforto3);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Olá! Seja Bem vindo! Qual o melhor conforto para o Sr?");
        String escolha = entrada.nextLine();

        if (escolha.equals("Macio")){
            System.out.println("Sugir para o Senhor o colchão: " + modelo2.nomeModelo);
        } else if (escolha.equals("Firme")){
            System.out.println("Sugiro para o Senhor o colchão: " + modelo1.nomeModelo);
        } else if (escolha.equals("Meio Termo")){
            System.out.println("Sugiro para o Senhor o colchão: " + modelo3.nomeModelo);
        } else{
            System.out.println("Temos as opções: Macio, Firme, Meio Termo. Digite um deles.");
            Scanner entrada2 = new Scanner(System.in);
            System.out.println("Agora escolha o correto: ");
            String escolha2 = entrada.nextLine();

            if (escolha2.equals("Macio")){
                System.out.println("Sugiro para o Senhor o colchão: " + modelo2.nomeModelo);
            } else if (escolha2.equals("Firme")){
                System.out.println("Sugiro para o Senhor o colchão: " + modelo1.nomeModelo);
            } else if (escolha2.equals("Meio Termo")){
                System.out.println("Sugiro para o Senhor o colchão: " + modelo3.nomeModelo);
            }
        }

        entrada.close();
    }
}
