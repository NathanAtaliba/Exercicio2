package br.inatel.C207.Class;
import br.inatel.C207.DB.AtendenteDB;
import br.inatel.C207.DB.PacienteDB;

public class Principal {
    public static void main(String[] args){
AtendenteDB at1 = new AtendenteDB();
Atendente atendente1 = new Atendente("Nathan",20,1,"Atendimento");
Atendente atendente2 = new Atendente("Renan",30,2,"Atendimento");
Paciente paciente1 = new Paciente("Renan","Dor",20,1, atendente1.getId());
Paciente paciente2 = new Paciente("Ca","nenhum",20,2,atendente2.getId());
Paciente paciente3= new Paciente("carin","louco",30,3,atendente2.getId());
at1.insertAtendente(atendente1);
at1.insertAtendente(atendente2);
at1.insertPaciente(paciente1);
at1.insertPaciente(paciente2);
at1.insertPaciente(paciente3);



    }
}
