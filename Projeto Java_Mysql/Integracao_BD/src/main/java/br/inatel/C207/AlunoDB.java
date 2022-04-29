package br.inatel.C207;

public class AlunoDB {
    private String nome;
    private int idade;
    public int id;

    public AlunoDB(String nome,int idade,int id ) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
