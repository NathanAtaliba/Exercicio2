package br.inatel.C207.Class;
import  br.inatel.C207.Class.Paciente;
    public class Atendente extends Funcionarios {
        public Atendente(String nome,int idade,int id,String setor){
            super(nome, idade, id++, setor);

        }

     //   @Override
   //     public void addPaciente() {
//Paciente paciente = new Paciente();
//paciente.setAtendenteDB_idAtendenteDB(getId());
  //      }
    }

