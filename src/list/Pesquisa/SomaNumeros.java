package list.Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class SomaNumeros {
    // Desafio resolvido por conta própria
    private final List<Integer> inteirosList;

    public SomaNumeros() {
        this.inteirosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        inteirosList.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (int num : inteirosList) {
            soma += num;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNum = inteirosList.get(0);
        if (!inteirosList.isEmpty()) {
            for (int num : inteirosList) {
                if (num > maiorNum) {
                    maiorNum = num;
                }
            }
        }
        return maiorNum;
    }

    public int encontrarMenorNumero() {
        int menorNum = inteirosList.get(0);
        if (!inteirosList.isEmpty()) {
            for (int num : inteirosList) {
                if (num < menorNum) {
                    menorNum = num;
                }
            }
        }
        return menorNum;
    }

    public List<Integer> exibirNumeros() {
        return inteirosList;
    }

    public static void main(String[] args) {
        SomaNumeros inteirosList = new SomaNumeros();

        inteirosList.adicionarNumero(2);
        inteirosList.adicionarNumero(4);
        inteirosList.adicionarNumero(17);
        inteirosList.adicionarNumero(1);

        System.out.println("Soma:" + inteirosList.calcularSoma());
        System.out.println("Maior número:" + inteirosList.encontrarMaiorNumero());
        System.out.println("Menor número:" + inteirosList.encontrarMenorNumero());
        System.out.println(inteirosList.exibirNumeros());
    }
}
