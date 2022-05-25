package one.digitalinnovation.basecamp;

/** 
*Classe principal 
*/

public class Main {
    public static void main(String[] args) {
        
        // Calculadora*
        System.out.println("Exercicio calculadora");
        Calculadora.soma( 3, 6);
        Calculadora.subtracao(9, 1,8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2,5);

        // Mensagem
        System.out.println("Exercicio mensagem");
        Mensagem.obterMensagem( hora 9);
        Mensagem.obterMensagem( hora 14);
        Mensagem.obterMensagem( hora 1);

        // Emprestimo
        System.out.println("Exercicio emprestimo");
        Emprestimo.calculadora( valor 1000, Emprestimo.getDuasParcelas());
        Emprestimo.calculadora( valor 1000, Emprestimo.getTresParcelas());
        Emprestimo.calculadora( valor 1000, parcela 5);
    }
}