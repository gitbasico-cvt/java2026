public class If_Else {
    public static void main(String[] args) {
        int idade = 17;
        String curso = "Desenvolvimento de Software";

        if (idade >= 18) {
            System.out.println("Matrícula permitida para o curso de " + curso + ".");
        } else if (idade == 17) {
            System.out.println("Matrícula permitida mediante autorização dos pais.");
        } else {
            System.out.println("Idade mínima não atingida para este curso.");
        }
    }
}