package br.inatel.C207.Class;
import br.inatel.C207.DB.AtendenteDB;
import br.inatel.C207.DB.PacienteDB;

public class Principal {
    public static void main(String[] args){
AtendenteDB at1 = new AtendenteDB();
PacienteDB p1 = new PacienteDB();
Atendente atendente1 = new Atendente("Nathan",20,1,"Atendimento");
Paciente paciente1 = new Paciente("Renan","Dor",20,1, atendente1.getId());
at1.insertAtendente(atendente1);
at1.insertPaciente(paciente1);
at1.researchPacientes();
        at1.updatePaciente(100,1,1);




    }
}
