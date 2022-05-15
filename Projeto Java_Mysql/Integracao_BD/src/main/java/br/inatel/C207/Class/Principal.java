package br.inatel.C207.Class;
import br.inatel.C207.DB.AtendenteDB;
import br.inatel.C207.DB.PacienteDB;
import br.inatel.C207.DB.MedicoDB;
public class Principal {
    public static void main(String[] args){
AtendenteDB at1 = new AtendenteDB();
PacienteDB p1 = new PacienteDB();
MedicoDB m1 = new MedicoDB();
Atendente atendente1 = new Atendente("Nathan",20,1,"Atendimento");
Paciente paciente1 = new Paciente("Renan","Dor",20,1, atendente1.getId());
Medico medico1 = new Medico("Nathan",20,2,"Medico");

at1.insertAtendente(atendente1);
at1.insertPaciente(paciente1);
at1.insertMedico(medico1);
        System.out.println("");
        at1.researchPacientes();
        at1.researchMedicos();
        System.out.println("");
at1.researchAtendentes();

    }
}
