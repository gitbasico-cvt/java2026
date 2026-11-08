# ☕ Guia Prático de Java: Conceitos Fundamentais

Bem-vindo ao repositório de introdução ao **Java**! Este material foi estruturado para servir como um guia de referência rápida sobre os pilares da programação orientada a objetos e lógica de programação utilizando Java.

---

## 📑 Índice
1. [Variáveis e Tipos de Dados](#1-variáveis-e-tipos-de-dados)
2. [Estruturas de Controle (if / else / while)](#2-estruturas-de-controle-if--else--while)
3. [Métodos](#3-métodos)
4. [Instanciação de Objetos](#4-instanciação-de-objetos)
5. [Herança](#5-herança)

---

## 1. Variáveis e Tipos de Dados

Em Java, **toda variável possui um tipo estático**, o que significa que precisamos declarar o tipo do dado antes de armazená-lo.

```java
public class VariaveisExemplo {
    public static void main(String[] args) {
        // Tipos Primitivos
        int idade = 25;                  // Números inteiros
        double altura = 1.75;            // Números com ponto flutuante
        boolean alunoAtivo = true;       // Verdadeiro ou Falso (booleano)
        char letra = 'J';                // Um único caractere

        // Tipo de Referência (Classe)
        String nome = "Maria Silva";     // Sequência de caracteres

        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}
2. Estruturas de Controle (if/else/while)
As estruturas de controle permitem tomar decisões e repetir blocos de código com base em condições lógicas.

Condicionais (if / else)
Java
int nota = 7;

if (nota >= 7) {
    System.out.println("Aprovado!");
} else if (nota >= 5) {
    System.out.println("Recuperação.");
} else {
    System.out.println("Reprovado.");
}
Laço de Repetição (while)
O while repete um bloco de código enquanto a condição especificada for verdadeira.

Java
int contador = 1;

while (contador <= 3) {
    System.out.println("Contagem atual: " + contador);
    contador++; // Incrementa para evitar loop infinito
}
3. Métodos
Métodos representam comportamentos ou funções dentro de uma classe. Eles encapsulam blocos de código reutilizáveis.

Java
public class Calculadora {

    // Método que recebe parâmetros e retorna um valor inteiro
    public int somar(int a, int b) {
        return a + b;
    }

    // Método sem retorno (void) que apenas exibe uma mensagem
    public void exibirMensagem(String nome) {
        System.out.println("Olá, " + nome + "! Bem-vindo ao Java.");
    }
}
4. Instanciação
Instanciar significa criar um objeto a partir de uma classe utilizando a palavra-chave new. A classe serve como um "molde" e o objeto é a materialização desse molde na memória.

Classe do Objeto:

Java
public class Carro {
    String modelo;
    int ano;

    // Método para exibir informações
    public void ligar() {
        System.out.println("O carro " + modelo + " está ligado.");
    }
}
Classe Principal (Executável com main):

Java
public class Principal {
    public static void main(String[] args) {
        // Instanciação do objeto meuCarro
        Carro meuCarro = new Carro();
        
        // Atribuindo valores aos atributos
        meuCarro.modelo = "Fusca";
        meuCarro.ano = 1980;

        // Chamando o método do objeto
        meuCarro.ligar(); 
    }
}
5. Herança
A herança é um dos pilares da Orientação a Objetos. Ela permite que uma classe (subclasse/filha) herde atributos e métodos de outra classe (superclasse/pai), promovendo o reaproveitamento de código através da palavra-chave extends.

Superclasse (Pai):

Java
public class Animal {
    String nome;

    public void respirar() {
        System.out.println(nome + " está respirando.");
    }
}
Subclasse (Filha):

Java
// Cachorro herda de Animal
public class Cachorro extends Animal {
    
    public void latir() {
        System.out.println(nome + " está latindo: Au Au!");
    }
}
Utilizando a Herança:

Java
public class TesteHeranca {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();
        
        meuCachorro.nome = "Bob"; // Atributo herdado da classe Animal
        
        meuCachorro.respirar();   // Método herdado da classe Animal
        meuCachorro.latir();      // Método próprio da classe Cachorro
    }
}
