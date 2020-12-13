package br.com.unipar.pokemons.model;


public class Pokemons {

    private String nome;
    private String descricao;
    public Pokemons(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }



    @Override
    public String toString() {
        return "Curso: " + Nome + " Descrição: " +
                descricao ;
    }
}
