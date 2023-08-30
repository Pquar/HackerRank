package Colletions.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> listaNumeros;

    //construtor
    public  SomaNumeros(){
        this.listaNumeros= new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }
    public int calcularSoma(){
        int soma=0;
        for(Integer numero: listaNumeros){
            soma+=numero;
        }
         return soma;
    }
    public int encontrarMaiorNumero(){
        int maiorNumero=Integer.MIN_VALUE;
        if(!listaNumeros.isEmpty()){
        for(Integer numero: listaNumeros){
            if(numero>=maiorNumero){
                maiorNumero=numero;
            }
        }
        return maiorNumero;
        }else{
            throw new RuntimeException("A lista esta vazia");
        }
    }
    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!listaNumeros.isEmpty()) {
            for (Integer numero : listaNumeros) {
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista esta vazia");
        }
    }
    public void exibirNumeros(){
        if(!listaNumeros.isEmpty()){
            System.out.println(this.listaNumeros);
        }else {
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);
        somaNumeros.exibirNumeros();

        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}
