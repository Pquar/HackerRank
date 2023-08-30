package Colletions.list.OperacoesBasicas;

public class Tarefa {
    //atributos
    private String description;

    public Tarefa(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
