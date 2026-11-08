import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {

        // Cria uma lista dinâmica para armazenar nomes de alunos
        ArrayList<String> alunos = new ArrayList<>();

        // Adiciona elementos na lista
        alunos.add("Carlos");
        alunos.add("Maria");
        alunos.add("João");

        // Exibe todos os alunos da lista
        for (String aluno : alunos) {
            System.out.println(aluno);
        }

    }
}