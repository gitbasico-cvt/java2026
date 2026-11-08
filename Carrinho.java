import java.util.ArrayList;
import java.util.Scanner;

public class Carrinho {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Cria uma lista para armazenar os produtos
        ArrayList<String> carrinho = new ArrayList<>();
        
        int opcao;
        System.out.println("\n--- CARRINHO DE COMPRAS ---");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Listar produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();
            entrada.nextLine();

        // Repete o menu enquanto o usuário não escolher sair
        while (opcao != 0) {
            

            if (opcao == 1) {
               
                System.out.println("Produto adicionado!");

            } else if (opcao == 2) {

                System.out.println("Operação de remoção realizada!");

            } else if (opcao == 3) {

                System.out.println("\nProdutos no carrinho:");

            } else if (opcao == 0) {

                System.out.println("Saindo do carrinho...");

            } else {

                System.out.println("Opção inválida!");

            }
            System.out.println("\n--- CARRINHO DE COMPRAS ---");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Listar produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();
            entrada.nextLine();
        }

        entrada.close();
    }
}