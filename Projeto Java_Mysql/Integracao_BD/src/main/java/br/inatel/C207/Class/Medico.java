package br.inatel.C207.Class;

public class Medico extends Funcionarios{
    public Medico(String nome,int idade,int id,String setor){
        super(nome, idade, id, setor);
    }

    @Override
    public void fazerCirurgia() {
        System.out.println("Fazendo cirurgia!");
    }

    @Override
    public void fazerCafe() {
        System.out.println("Fazer café");
    }
}
