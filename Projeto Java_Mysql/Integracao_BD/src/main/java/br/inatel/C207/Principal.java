package br.inatel.C207;
import java.util.ArrayList;
public class Principal {
    public static void main(String[] args){
        AtendenteDB at1 = new AtendenteDB();
AtendenteDB atendente1 = new AtendenteDB(0,"nathan",21);
        AtendenteDB atendente2 = new AtendenteDB(0,"renan",21);
atendente1.insertAtendente(atendente1);
atendente1.insertAtendente(atendente2);
at1.updateAtendenteDB("nathan",1663,150);
at1.researchAtendentes();

    }
}
