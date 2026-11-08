// Importa as ferramentas para manipulação de listas dinâmicas
import java.util.ArrayList;
import java.util.List;

// ==========================================
// CLASSE PRINCIPAL (Executável)
// ==========================================
public class SistemaHeranca {
    public static void main(String[] args) {
        
        // Cria uma lista para armazenar objetos do tipo Aluno
        List<Aluno> listaAlunos = new ArrayList<>();

        // Instancia um novo Aluno passando os dados que preenchem tanto os atributos de Pessoa quanto de Aluno
        Aluno aluno1 = new Aluno("Ana Beatriz", 20, "2026105", "Engenharia de Software");

        // Adiciona o aluno criado à lista
        listaAlunos.add(aluno1);

        // Percorre a lista e exibe os dados usando o método herdado e próprio
        for (Aluno a : listaAlunos) {
            System.out.println("=== DADOS DO ALUNO ===");
            System.out.println("Nome (veio de Pessoa): " + a.nome);
            System.out.println("Idade (veio de Pessoa): " + a.idade);
            System.out.println("Matrícula (específico de Aluno): " + a.matricula);
            System.out.println("Curso (específico de Aluno): " + a.curso);
        }
    }
}

// ==========================================
// CLASSE PAI (Superclasse)
// ==========================================
class Pessoa {
    // Atributos comuns a qualquer pessoa
    String nome;
    int idade;

    // Construtor da classe pai: inicializa os dados gerais
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

// ==========================================
// CLASSE FILHA (Subclasse)
// ==========================================
// A palavra-chave "extends" indica que Aluno herda tudo o que Pessoa tem (nome e idade)
class Aluno extends Pessoa {
    // Atributos específicos e exclusivos de um aluno
    String matricula;
    String curso;

    // Construtor da classe filha
    public Aluno(String nome, int idade, String matricula, String curso) {
        
        // A palavra "super" chama obrigatoriamente o construtor da classe pai (Pessoa) para reutilizar a inicialização de nome e idade
        super(nome, idade); 
        
        // Inicializa os atributos específicos da classe filha
        this.matricula = matricula;
        this.curso = curso;
    }
}