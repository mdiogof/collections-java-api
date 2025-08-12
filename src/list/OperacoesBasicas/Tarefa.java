package list.OperacoesBasicas;

public class Tarefa {
    // Classe usada pela ListaTarefas
    private final String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
    @Override
    public String toString() {
        return descricao;
    }
}
