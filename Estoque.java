
import java.util.ArrayList;   
public class Estoque {
    // Atributos
    ArrayList<String> listaProdutos = new ArrayList<>();
    // Método Listar
    void listar() {
        System.out.println("Produtos cadastrados:");
        for (String produto : listaProdutos) {
            System.out.println(produto);
        }
    }
    // Método Cadastrar
    void cadastrar(String nomeProduto) {

        listaProdutos.add(nomeProduto);

        System.out.println("Produto cadastrado com sucesso!");

    }

    // Método Atualizar
    void atualizar(String nomeProduto, String novoNome) {
    
        int indice = listaProdutos.indexOf(nomeProduto);

        if (indice != -1) {

            listaProdutos.set(indice, novoNome);

            System.out.println("Produto atualizado com sucesso!");

        } else {

            System.out.println("Produto não encontrado!");

        }

    }

    // Método Deletar
    void deletar(String nomeProduto) {

        if (listaProdutos.remove(nomeProduto)) {

            System.out.println("Produto excluído com sucesso!");

        } else {

            System.out.println("Produto não encontrado!");

        }

    }

}
