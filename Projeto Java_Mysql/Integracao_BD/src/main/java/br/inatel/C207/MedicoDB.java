package br.inatel.C207;

public class MedicoDB extends FuncionariosDB {

MedicoDB(String nome, int idade,int id,String setor){
    super(nome, idade, id, setor);
}

    public void fazerCirurgia() {System.out.println("Fazendo cirurgia");}



}
