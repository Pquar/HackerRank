package Colletions.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdades= new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdades);
        return  pessoasPorIdades;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura= new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Clon",26,170);
        ordenacaoPessoa.adicionarPessoa("Clony",24,195);
        ordenacaoPessoa.adicionarPessoa("Clonz",25,180);
        ordenacaoPessoa.adicionarPessoa("Clom",23,185);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());

        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
