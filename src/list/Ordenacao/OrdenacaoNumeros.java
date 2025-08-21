package list.Ordenacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoNumeros {
    private final List<Integer> inteirosList;

    public OrdenacaoNumeros() {
        this.inteirosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        inteirosList.add(numero);
    }

    public void ordenarAscendente() {
        Collections.sort(inteirosList);
    }

    public void ordenarDescendente() {
        Collections.sort(inteirosList, Collections.reverseOrder());
    }

    public List<Integer> exibirNumeros() {
        return inteirosList;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros inteirosList = new OrdenacaoNumeros();

        inteirosList.adicionarNumero(2);
        inteirosList.adicionarNumero(5);
        inteirosList.adicionarNumero(7);
        inteirosList.adicionarNumero(4);

        System.out.println(inteirosList.exibirNumeros());
        inteirosList.ordenarAscendente();
        System.out.println(inteirosList.exibirNumeros());
        inteirosList.ordenarDescendente();
        System.out.println(inteirosList.exibirNumeros());
    }
}
