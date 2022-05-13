package br.inatel.C207.Class;
import br.inatel.C207.DB.AtendenteDB;
import br.inatel.C207.DB.PacienteDB;

public class Principal {
    public static void main(String[] args){
AtendenteDB at1 = new AtendenteDB();
        Atendente atendente = new Atendente("Nathan",20,1,"Atendimento");
        Paciente paciente = new Paciente("Fernanda","dor na coluna",53,1);
        at1.insertAtendente(atendente);
        at1.insertPaciente(paciente);
at1.researchAtendentes();
at1.researchPacientes();


    }
}
