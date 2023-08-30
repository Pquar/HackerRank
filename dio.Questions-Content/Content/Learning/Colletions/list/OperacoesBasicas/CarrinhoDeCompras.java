package Colletions.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemCompra;

    public CarrinhoDeCompras() {
        this.itemCompra = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        //Item item = new Item(nome, preco, quantidade);
        //    this.itemList.add(item);
        itemCompra.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemsRemover = new ArrayList<>();
        if(!itemCompra.isEmpty()){
        for(Item i: itemCompra){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemsRemover.add(i);
            }
        }
        }else {
            System.out.println("não possui itens");
        }
        itemCompra.removeAll(itemsRemover);
    }
    public double calcularValorTotal(){
        double valorTotal= 0d;
        if(!itemCompra.isEmpty()){
            for(Item item : itemCompra){
                double valorItem= item.getPrice()*item.getAmount();
                valorTotal+= valorItem;
            }
                return valorTotal;
        }
        //poderia ser um else
        throw new RuntimeException("A lista está vazia!");
    }

    public  void exibirItens() {
        if(!itemCompra.isEmpty()){
          System.out.println(itemCompra);
        }else {
            System.out.println("não possui itens");
        }
    }


    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("banana",2.5,2);
        carrinhoDeCompras.adicionarItem("maca",1.1,3);
        System.out.println("O que tem no Carrrinho: " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("maca");

        System.out.println("O que tem no Carrrinho: " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Lápis");
        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());

    }
}
