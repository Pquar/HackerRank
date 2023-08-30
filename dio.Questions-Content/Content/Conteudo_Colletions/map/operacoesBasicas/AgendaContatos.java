package Colletions.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome=null;
        if(!agendaContatoMap.isEmpty()){
               numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("cleiton",12345);
        agendaContatos.adicionarContato("cleiton m",12346);
        agendaContatos.adicionarContato("cleiton a",12347);
        agendaContatos.adicionarContato("cleiton f",12348);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("cleiton");

        agendaContatos.exibirContatos();

        agendaContatos.pesquisarPorNome("cleiton m");

    }
}
