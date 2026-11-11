
import java.util.Scanner;

public class App_Estoque {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Dados de acesso
        String login = "admin";
        String senha = "@admin";
        String contraSenha = "1234";

        // Instanciando a classe Estoque
        Estoque estoque = new Estoque();

        // Login
        System.out.println("===== LOGIN DO SISTEMA =====");

        System.out.println("Digite o Login:");
        String loginDigitado = input.nextLine();

        System.out.println("Digite a Senha:");
        String senhaDigitada = input.nextLine();

        // Validando acesso
        if (login.equals(loginDigitado) &&
            senha.equals(senhaDigitada)) {

            System.out.println("\nAcesso Liberado!");

            String opcao = "";

            // Menu principal
            while (!opcao.equals("0")) {

                System.out.println("\n===== SISTEMA DE GESTÃO DE ESTOQUE =====");
                System.out.println("1 - Listar Produto");
                System.out.println("2 - Cadastrar Produto");
                System.out.println("3 - Atualizar Produto");
                System.out.println("4 - Excluir Produto");
                System.out.println("0 - Sair");

                System.out.println("Digite a opção desejada:");
                opcao = input.nextLine();

                // Listar
                if (opcao.equals("1")) {

                    estoque.listar();

                }

                // Cadastrar
                else if (opcao.equals("2")) {
                    System.out.println("Digite a contrassenha:");
                    String contraSenhaDigitada = input.nextLine();

                    if (contraSenha.equals(contraSenhaDigitada)) {

                        System.out.println("Digite o nome do produto:");
                        String nomeProduto = input.nextLine();

                        estoque.cadastrar(nomeProduto);

                    } else {

                        System.out.println("Contrassenha incorreta!");

                    }

                }

                // Atualizar
                else if (opcao.equals("3")) {
                    estoque.listar();
                    System.out.println("Digite o produto que deseja atualizar:");
                    String nomeProduto = input.nextLine();

                    System.out.println("Digite o novo nome do produto:");
                    String novoNome = input.nextLine();

                    estoque.atualizar(nomeProduto, novoNome);

                }

                // Excluir
                else if (opcao.equals("4")) {

                    System.out.println("Digite a contrassenha:");
                    String contraSenhaDigitada = input.nextLine();

                    if (contraSenha.equals(contraSenhaDigitada)) {

                        System.out.println("Digite o produto que deseja excluir:");
                        String nomeProduto = input.nextLine();

                        estoque.deletar(nomeProduto);

                    } else {

                        System.out.println("Contrassenha incorreta!");

                    }

                }

                // Sair
                else if (opcao.equals("0")) {

                    System.out.println("Saindo do sistema...");

                }

                // Opção inválida
                else {

                    System.out.println("Opção inválida!");

                }

            }

        } else {

            System.out.println("Acesso Negado!");

        }

        input.close();

    }

}
