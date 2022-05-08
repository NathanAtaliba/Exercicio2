package br.inatel.C207;

public abstract class FuncionariosDB extends Database {
    private String nome;
    private int idade;
    public int id;
    private String setor;

    public FuncionariosDB(String nome, int idade, int id ,String setor ) {
        this.nome = nome;
        this.idade = idade;
        this.setor = setor;
        this.id = id;
    }

    public void addCadastro(){};
    public void removerCadastro(){};
    public void fazerCirurgia(){};
    public void mostrarpaciente(){};

    public String getSetor() {return setor;}

    public void setSetor(String setor) {this.setor = setor;}

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
