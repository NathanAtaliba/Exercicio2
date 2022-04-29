package br.inatel.C207;

public class Principal {

    public static void main(String[] args){

        Database database = new Database();
        database.connect();

        //criando objetos para serem inseridos no banco
        User user1 = new User("Davi","111.111.111-11");
        User user2 = new User("Alexandre","222.222.222-22");
        User user3 = new User("Paula","333.333.333-33");

        //Inserindo usuários no banco
        database.insertUser(user1);
        database.insertUser(user2);
        database.insertUser(user3);

        //mostrando todos os usuários
        database.researchUser();
        System.out.println("-----Atualizando o nome-----");
        database.updateUser(1,"Davizao");

        database.researchUser();

        System.out.println("-----Excluido usuário-----");
        database.deleteUser(2);
        database.researchUser();

    }
}
