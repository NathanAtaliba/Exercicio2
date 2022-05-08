package br.inatel.C207;
import java.util.ArrayList;
public class Principal {
    public static void main(String[] args){
        AtendenteDB at1 = new AtendenteDB();
AtendenteDB atendente1 = new AtendenteDB(1663,"Nathan",16);
AtendenteDB atendente2 = new AtendenteDB(19,"Julia",20);
at1.insertAtendente(atendente1);
at1.insertAtendente(atendente2);
at1.researchAtendentes();
at1.updateAtendenteDB("Nathan",1663,21);
at1.updateAtendenteDB("Nathan",16,21);
at1.deleteAtendenteDB("Nathan",16,21);
        //atendente1.deleteAtendenteDB(atendente1.getIdAtendenteDB());
        at1.researchAtendentes();
    }
}
