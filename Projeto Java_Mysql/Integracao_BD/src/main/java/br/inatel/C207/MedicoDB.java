package br.inatel.C207;

public class MedicoDB extends FuncionariosDB implements  Cirurgia{

MedicoDB(String nome, int idade,int id){
    super(nome, idade, id);
}
public void fazerCirurgia(){
    System.out.println("Fazendo cirurgia");
}



}
