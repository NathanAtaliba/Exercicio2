package br.inatel.C207.DB;

import br.inatel.C207.Class.Funcionarios;

public class MedicoDB extends Funcionarios {

MedicoDB(String nome, int idade,int id,String setor){
    super(nome, idade, id, setor);
}

    public void fazerCirurgia() {System.out.println("Fazendo cirurgia");}



}
