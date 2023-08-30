package Colletions.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo,autor,anoPublicacao));
    }
        public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.add(l);
            }
        }
        }
            return livrosPorAutor;
    }
        public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
                List<Livro> livrosPorAnos = new ArrayList<>();
                if(!livroList.isEmpty()) {
                    for (Livro l : livroList) {
                        if (l.getAno() >= anoInicial && l.getAno() <= anoFinal) {
                            livrosPorAnos.add(l);
                        }
                    }
                }
                    return livrosPorAnos;
            }
        public Livro pesquisarPorTitulo(String titulo){
        Livro livroTitulo = null;
        if(!livroList.isEmpty()){
            for (Livro l: livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroTitulo = l;
                    break;
                }
            }
        }
            return livroTitulo;
        }

    public static void main(String[] args) {
        //psvm
       CatalogoLivros catalogoLivros = new CatalogoLivros();
       catalogoLivros.adicionarLivro("lv 1", "eu 1", 2001);
       catalogoLivros.adicionarLivro("lv 2", "eu 2", 2002);
       catalogoLivros.adicionarLivro("lv 2", "eu 2", 2003);
       catalogoLivros.adicionarLivro("lv 3", "eu 3", 2003);
       catalogoLivros.adicionarLivro("lv 4", "eu 4", 2004);

        System.out.println(catalogoLivros.pesquisarPorAutor("eu 2"));

        System.out.println(catalogoLivros.pesquisarPorAutor("eu 1"));

        System.out.println("Livro por inteveralo de anos: "+catalogoLivros.pesquisarPorIntervaloAnos(2001,2002));

        System.out.println("Titulo: "+ catalogoLivros.pesquisarPorTitulo("lv 2"));


    }


    }

