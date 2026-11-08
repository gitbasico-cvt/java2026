import java.util.Scanner;

public class App_Carro {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Criando o primeiro objeto da classe Carro
        Carro carro1 = new Carro();

        // Atribuindo valores aos atributos
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.cor = "Preto";

        // Exibindo os dados
        System.out.println("=== DADOS DO CARRO ===");
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Cor: " + carro1.cor);

        // Menu de ações
        System.out.println("\n=== MENU DO CARRO ===");
        System.out.println("1 - Ligar");
        System.out.println("2 - Desligar");
        System.out.println("3 - Acelerar");
        System.out.println("4 - Frear");

        System.out.print("\nDigite uma opção: ");
        int opcao = teclado.nextInt();

        // Verificando a opção escolhida
        if (opcao == 1) {

            carro1.ligar();

        } else if (opcao == 2) {

            carro1.desligar();

        } else if (opcao == 3) {

            carro1.acelerar();

        } else if (opcao == 4) {

            carro1.frear();

        } else {

            System.out.println("Opção inválida!");

        }

        teclado.close();
    }
}

