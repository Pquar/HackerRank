package Colletions.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
           public void exibirContatos(){
               System.out.println(contatoSet);
           }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato>  contatosPesquisa= new HashSet<>();
        for(Contato c: contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPesquisa.add(c);
            }
        }
        return contatosPesquisa;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtuliza = null;
        for(Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtuliza =c;
                break;
            }
        }
        return contatoAtuliza;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Cleiton",123);
        agendaContatos.adicionarContato("kleiton",143);

        agendaContatos.exibirContatos();

        agendaContatos.atualizarNumeroContato("Kleiton",999);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Cleiton"));
    }
}
