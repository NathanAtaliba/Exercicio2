package br.inatel.C207.Class;
import  br.inatel.C207.Class.Paciente;
    public class Atendente extends Funcionarios {
        public Atendente(String nome,int idade,int id,String setor){
            super(nome, idade, id++, setor);

        }
        public void fazerCafe(){
            System.out.println("Fazer cafe!");

        }
        @Override
        public void atenderPaciente() {
            System.out.println("Atender paciente!");
        }
    }

