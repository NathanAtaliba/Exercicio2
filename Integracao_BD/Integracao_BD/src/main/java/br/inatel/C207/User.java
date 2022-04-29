package br.inatel.C207;
//EXEMPLO DE TABELA CRIADA NO MYSQL INTEGRADA COM INTELIJEI
public class User {

    private String nome;
    private String cpf;
    public int id;

    public User(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
