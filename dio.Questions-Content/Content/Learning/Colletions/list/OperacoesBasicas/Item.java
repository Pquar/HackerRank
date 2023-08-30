package Colletions.list.OperacoesBasicas;

public class Item {
    private String nome;
    private double price;
    private int amount;

    public Item(String nome, double price, int amount) {
        this.nome = nome;
        this.price = price;
        this.amount = amount;
    }

    public String getNome() {
        return nome;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Items:{ " +
                "nome='" + nome + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
