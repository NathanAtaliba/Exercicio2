package br.inatel.C207;
import java.sql.SQLException;
import java.util.ArrayList;
public class AtendenteDB extends Database {
    private String nome;
    private int idAtendenteDB;
    private int idade;
    public AtendenteDB(int idAtendenteDB,String nome,int idade){
      this.nome = nome;
      this.idade = idade;
      this.idAtendenteDB = idAtendenteDB;
    }
public AtendenteDB(){}
public boolean insertAtendente(AtendenteDB atendenteDB){ // Inserindo Atendente no banco de dados
connect();    //Conectando no banco
String sql = "INSERT INTO atendenteDB(idAtendenteDB,nome,idade) VALUES(? ,? ,?)";  //Comando utilizado no Sql transcrevido em TEXTO
try{                    //Comandos utlizados sem o erro
    pst = connection.prepareStatement(sql);   //preparando conexao
    pst.setInt(1,atendenteDB.getIdAtendenteDB());   // //preparando Query para idAtendenteDB
    pst.setString(2, atendenteDB.getNome());       // //preparando Query para nome
    pst.setInt(3,atendenteDB.getIdade());        // //preparando Query para idade
    pst.execute();    // Executar
    check = true;     // passando valor true para check (controle de erro)
}catch(SQLException e){  // SQLException (Ocorreu erro)
    System.out.println("Erro de operação: " +e.getMessage());   //Mensagem de erro
    check = false;   //Passando valor pra false para check (Controle de erro)
}
finally{    // Ao final da execuçao
try{
connection.close();   //fechar conexao
pst.close();
}catch(SQLException e){  //Se nao conseguir fechar conexao
    System.out.println("Erro ao fechar a conexao: "+e.getMessage());  // Erro de encerramento de conexao
}
}
return check;  //retornando check
}


public ArrayList<AtendenteDB> researchAtendentes(){   //selecionar Atendente
connect();  //conectando
ArrayList<AtendenteDB> atendentes = new ArrayList<>();  // Criando Array para guardar atendentes
String sql = "SELECT * FROM AtendenteDB";  //Comando utilizado no Sql transcrevido em TEXTO
try {
    statement = connection.createStatement();  //Criando variavel para conexao
    result = statement.executeQuery(sql);  // Criando variavel para comparar os resultados

    while(result.next()){
            AtendenteDB atendente = new AtendenteDB ((result.getInt("idAtendenteDB")),(result.getString("nome")),(result.getInt("idade"))); //Criando atendente com resultados para comparar

            atendente.idAtendenteDB = result.getInt("idAtendenteDB");  //igualando o resultado do atendente com o atendente criado
        atendente.nome = result.getString("nome");       //igualando o resultado do atendente com o atendente criado
         atendente.idade = result.getInt("idade");       //igualando o resultado do atendente com o atendente criado
        System.out.println("Nome = "+ atendente.nome);    //mostrando os atributos do atendente
        System.out.println("Idade = "+atendente.idade);   //mostrando os atributos do atendente
        System.out.println("ID = "+ atendente.idAtendenteDB);    //mostrando os atributos do atendente
        System.out.println("----------");
        atendentes.add(atendente); // Adicionando atendente no array
    }
}catch(SQLException e){    //Se der erro
    System.out.println("Erro de operaçao: " + e.getMessage()); //mostrar mensagem de erro
}finally{  //no final faça ...
    try{
     connection.close();   //fechar execuçoes usadas pro banco
     statement.close();    //fechar execuçoes usadas pro banco
     result.close();      //fechar execuçoes usadas pro banco

    }catch(SQLException e){ //se der erro o fechamento de conexão
        System.out.println("Erro ao fechar a conexão"+ e.getMessage()); //mostrar mensagem de erro
    }
}
return atendentes;  //retornar atendente
}


public boolean updateAtendenteDB(String nome,int idAtendenteDB,int idade){ //atualizar dados do atendente
connect();
String sql = "UPDATE atendenteDB SET idade =? WHERE nome=? AND idAtendenteDB =?"; //Comando utilizado no Sql transcrevido em TEXTO
try{
    pst = connection.prepareStatement(sql); //preparando conexao
    pst.setInt(1,idade);     //preparando Query para idade
    pst.setString(2,nome);   // preparando Query para nome
    pst.setInt (3,idAtendenteDB);   //preparando Query para idAtendenteDB
    pst.execute();  //executar
    check = true;  // variavel de controle foi para true
}catch(SQLException e){  //Se der erro
    System.out.println("Erro de operação: "+ e.getMessage());  //mostrar mensagem
    check= false;  // variavel de controle foi para false
}finally{  //ao final fechar execuçoes
    try{
        connection.close();  //fechar variavel de conexao
        pst.close();   //fechar variavel de manipulacao
    }catch(SQLException e){  // se der erro
        System.out.println("Erro ao fechar a conexão: "+e.getMessage()); // mostrar mensagem de erro
    }
}
return check; //retornar variavel de controle
}


public boolean deleteAtendenteDB(String nome,int idAtendenteDB,int idade){  //deletar atendentes
connect(); //conexao
String sql = "DELETE FROM atendenteDB WHERE idAtendenteDB = ? AND nome=? AND idade=?";  //Comando utilizado no Sql transcrevido em TEXTO
try{
    pst = connection.prepareStatement(sql);  //preparando conexao com texto sql
    pst.setInt(1,idAtendenteDB);  //preparando Query para idAtendenteDB
    pst.setString(2,nome); // preparando Query para nome
    pst.setInt(3,idade);   // preparando Query para idade
    pst.execute();   // executar
    check = true;  //variavel de controle check

}catch(SQLException e){  // se deu erro na execuçao
    System.out.println("Erro de operação: "+ e.getMessage());  //mostrar mensagem de erro
    check = false; //colocar variavel de controle para false
}finally{  // ao final..
    try {
        connection.close();  // fechar conexao
        pst.close();  //fechar variavel de manipulacao
    }catch (SQLException e){  //se der erro
        System.out.println("Erro ao fechar a conexão "+e.getMessage());  //mostrar mensagem de erro
    }
}
return check;  //retornar variaveld e controle
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdAtendenteDB() {
        return idAtendenteDB;
    }

    public void setIdAtendenteDB(int idAtendenteDB) {
        this.idAtendenteDB = idAtendenteDB;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    //////////////////////////////////////////////////////////
    public boolean insertPaciente(PacienteDB pacienteDB){ // Inserindo Paciente no banco de dados
        connect();    //Conectando no banco
        String sql = "INSERT INTO pacienteDB(nomePaciente,Sintomas,idade,idPaciente) VALUES(? ,? ,? ,?)";  //Comando utilizado no Sql transcrevido em TEXTO
        try{                    //Comandos utlizados sem o erro
            pst = connection.prepareStatement(sql);   //preparando conexao
            pst.setString(1,pacienteDB.getNomePaciente());    //preparando Query para nomePaciente
            pst.setString(2, pacienteDB.getSintomas());        //preparando Query para Sintomas
            pst.setInt(3,pacienteDB.getIdade());        //preparando Query para idade
            pst.setInt(4,pacienteDB.getIdPaciente());  //preparando Query para IdPaciente
            pst.execute();    // Executar
            check = true;     // passando valor true para check (controle de erro)
        }catch(SQLException e){  // SQLException (Ocorreu erro)
            System.out.println("Erro de operação: " +e.getMessage());   //Mensagem de erro
            check = false;   //Passando valor pra false para check (Controle de erro)
        }
        finally{    // Ao final da execuçao
            try{
                connection.close();   //fechar conexao
                pst.close();
            }catch(SQLException e){  //Se nao conseguir fechar conexao
                System.out.println("Erro ao fechar a conexao: "+e.getMessage());  // Erro de encerramento de conexao
            }
        }
        return check;  //retornando check
    }

    public ArrayList<PacienteDB> researchPacientes(){   //selecionar Atendente
        connect();  //conectando
        ArrayList<PacienteDB> pacientes = new ArrayList<>();  // Criando Array para guardar atendentes
        String sql = "SELECT * FROM PacienteDB";  //Comando utilizado no Sql transcrevido em TEXTO
        try {
            statement = connection.createStatement();  //Criando variavel para conexao
            result = statement.executeQuery(sql);  // Criando variavel para comparar os resultados

            while(result.next()){
                PacienteDB paciente = new PacienteDB ((result.getString("nomePaciente")),(result.getString("Sintomas")),(result.getInt("idade")),result.getInt("idPaciente")); //Criando atendente com resultados para comparar

                paciente.setNomePaciente(result.getString("nomePaciente"));  //igualando o resultado do atendente com o atendente criado
                paciente.setSintomas(result.getString("sintomas"));       //igualando o resultado do atendente com o atendente criado
                paciente.setIdade(result.getInt("idade"));       //igualando o resultado do atendente com o atendente criado
                paciente.setIdPaciente(result.getInt("idPaciente")) ;
                System.out.println("Nome = "+ paciente.getNomePaciente());    //mostrando os atributos do paciente
                System.out.println("Idade = "+paciente.getIdade());   //mostrando os atributos do paciente
                System.out.println("ID = "+ paciente.getIdPaciente());    //mostrando os atributos do paciente
                System.out.println("Sintomas = "+ paciente.getSintomas());
                System.out.println("----------");
                pacientes.add(paciente); // Adicionando paciente no array
            }
        }catch(SQLException e){    //Se der erro
            System.out.println("Erro de operaçao: " + e.getMessage()); //mostrar mensagem de erro
        }finally{  //no final faça ...
            try{
                connection.close();   //fechar execuçoes usadas pro banco
                statement.close();    //fechar execuçoes usadas pro banco
                result.close();      //fechar execuçoes usadas pro banco

            }catch(SQLException e){ //se der erro o fechamento de conexão
                System.out.println("Erro ao fechar a conexão"+ e.getMessage()); //mostrar mensagem de erro
            }
        }
        return pacientes;  //retornar atendente
    }

    public boolean updatePacienteDB(String nomePaciente,String sintomas,int idade,int idPaciente){ //atualizar dados do atendente
        connect();
        String sql = "UPDATE pacienteDB SET idade =? WHERE nomePaciente=? AND idAtendenteDB =? AND sintomas=?"; //Comando utilizado no Sql transcrevido em TEXTO
        try{
            pst = connection.prepareStatement(sql); //preparando conexao
            pst.setInt(1,idade);     //preparando Query para idade
            pst.setString(2,nomePaciente);   // preparando Query para nomePaciente
            pst.setInt (3,idPaciente);   //preparando Query para idPacienteDB
            pst.setString(4,sintomas); //preparando Query para sintomas
            pst.execute();  //executar
            check = true;  // variavel de controle foi para true
        }catch(SQLException e){  //Se der erro
            System.out.println("Erro de operação: "+ e.getMessage());  //mostrar mensagem
            check= false;  // variavel de controle foi para false
        }finally{  //ao final fechar execuçoes
            try{
                connection.close();  //fechar variavel de conexao
                pst.close();   //fechar variavel de manipulacao
            }catch(SQLException e){  // se der erro
                System.out.println("Erro ao fechar a conexão: "+e.getMessage()); // mostrar mensagem de erro
            }
        }
        return check; //retornar variavel de controle
    }

    public boolean deletePacienteDB(String nomePaciente,int sintomas,int idade,int idPaciente){  //deletar atendentes
        connect(); //conexao
        String sql = "DELETE FROM pacienteDB WHERE idPaciente = ? AND nomePaciente=? AND idade=? AND sintomas=?";  //Comando utilizado no Sql transcrevido em TEXTO
        try{
            pst = connection.prepareStatement(sql);  //preparando conexao com texto sql
            pst.setInt(1,idPaciente);  //preparando Query para idAtendenteDB
            pst.setString(2,nomePaciente); // preparando Query para nome
            pst.setInt(3,idade);   // preparando Query para idade
            pst.setInt(4,sintomas);
            pst.execute();   // executar
            check = true;  //variavel de controle check

        }catch(SQLException e){  // se deu erro na execuçao
            System.out.println("Erro de operação: "+ e.getMessage());  //mostrar mensagem de erro
            check = false; //colocar variavel de controle para false
        }finally{  // ao final..
            try {
                connection.close();  // fechar conexao
                pst.close();  //fechar variavel de manipulacao
            }catch (SQLException e){  //se der erro
                System.out.println("Erro ao fechar a conexão "+e.getMessage());  //mostrar mensagem de erro
            }
        }
        return check;  //retornar variaveld e controle
    }

}

