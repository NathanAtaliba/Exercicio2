package br.inatel.C207;
import java.util.ArrayList;
public class Principal {
    public static void main(String[] args){
        AtendenteDB at1 = new AtendenteDB();
        AtendenteDB atendente1 = new AtendenteDB(0,"nathan",21);
        AtendenteDB atendente2 = new AtendenteDB(0,"renan",21);
        PacienteDB P1 =new PacienteDB("nathan Santos Ataliba","dor nas costas",20,1000);
        PacienteDB P2 = new PacienteDB("Fernanda","Dor nas pernas",54,1);
atendente1.insertAtendente(atendente1);
atendente1.insertAtendente(atendente2);
atendente1.insertPaciente(P1);
atendente1.insertPaciente(P2);
at1.researchAtendentes();
at1.researchPacientes();
    }
}
