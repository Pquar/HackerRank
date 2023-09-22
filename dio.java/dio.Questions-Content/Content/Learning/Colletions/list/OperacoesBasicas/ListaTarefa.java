package Colletions.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;
public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for( Tarefa t : tarefaList){
            if(t.getDescription().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionarTarefa("tarefa1");
        listaTarefa.adicionarTarefa("tarefa1");
        listaTarefa.adicionarTarefa("tarefa3");
        System.out.println("numero total de elemento da lista: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("tarefa1");

        System.out.println("numero total de elemento da lista: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
