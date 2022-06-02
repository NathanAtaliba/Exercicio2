package br.inatel.C207.Class;

public class Cadastro {
private int IdCadastro=0;
    public Cadastro(int IdCadastro){
        this.IdCadastro = IdCadastro;
    }
    public int getIdCadastro() {
        return IdCadastro;
    }
public Cadastro(){
      IdCadastro++;
}

    public void setIdCadastro(int idCadastro) {
        IdCadastro = idCadastro;
    }
}
