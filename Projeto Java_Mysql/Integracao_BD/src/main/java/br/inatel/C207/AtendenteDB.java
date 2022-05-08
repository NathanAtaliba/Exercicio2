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
public AtendenteDB(){

}
public boolean insertAtendente(AtendenteDB atendenteDB){
connect();
String sql = "INSERT INTO atendenteDB(idAtendenteDB,nome,idade) VALUES(? ,? ,?)";
try{
    pst = connection.prepareStatement(sql);
    pst.setInt(1,atendenteDB.getIdAtendenteDB());
    pst.setString(2, atendenteDB.getNome());
    pst.setInt(3,atendenteDB.getIdade());
    pst.execute();
    check = true;
}catch(SQLException e){
    System.out.println("Erro de operação: " +e.getMessage());
    check = false;
}
finally{
try{
connection.close();
pst.close();
}catch(SQLException e){
    System.out.println("Erro ao fechar a conexao: "+e.getMessage());
}
}
return check;
}


public ArrayList<AtendenteDB> researchAtendentes(){
connect();
ArrayList<AtendenteDB> atendentes = new ArrayList<>();
String sql = "SELECT * FROM AtendenteDB";
try {
    statement = connection.createStatement();
    result = statement.executeQuery(sql);

    while(result.next()){
            AtendenteDB atendente = new AtendenteDB ((result.getInt("idAtendenteDB")),(result.getString("nome")),(result.getInt("idade")));

            atendente.idAtendenteDB = result.getInt("idAtendenteDB");
        atendente.nome = result.getString("nome");
         atendente.idade = result.getInt("idade");
        System.out.println("Nome = "+ atendente.nome);
        System.out.println("Idade = "+atendente.idade);
        System.out.println("ID = "+ atendente.idAtendenteDB);
        System.out.println("----------");
        atendentes.add(atendente);
    }
}catch(SQLException e){
    System.out.println("Erro de operaçao: " + e.getMessage());
}finally{
    try{
     connection.close();
     statement.close();
     result.close();

    }catch(SQLException e){
        System.out.println("Erro ao fechar a conexão"+ e.getMessage());
    }
}
return atendentes;
}


public boolean updateAtendenteDB(String nome,int idAtendenteDB,int idade){
connect();
String sql = "UPDATE atendenteDB SET idade =? WHERE nome=? AND idAtendenteDB =?";
try{
    pst = connection.prepareStatement(sql);
    pst.setInt(1,idade);
    pst.setString(2,nome);
    pst.setInt (3,idAtendenteDB);


    pst.execute();
    check = true;
}catch(SQLException e){
    System.out.println("Erro de operação: "+ e.getMessage());
    check= false;
}finally{
    try{
        connection.close();
        pst.close();
    }catch(SQLException e){
        System.out.println("Erro ao fechar a conexão: "+e.getMessage());
    }
}
return check;
}


public boolean deleteAtendenteDB(String nome,int idAtendenteDB,int idade){
connect();
String sql = "DELETE FROM atendenteDB WHERE idAtendenteDB = ? AND nome=? AND idade=?";
try{
    pst = connection.prepareStatement(sql);
    pst.setInt(1,idAtendenteDB);
    pst.setString(2,nome);
    pst.setInt(3,idade);
    pst.execute();
    check = true;

}catch(SQLException e){
    System.out.println("Erro de operação: "+ e.getMessage());
    check = false;
}finally{
    try {
        connection.close();
        pst.close();
    }catch (SQLException e){
        System.out.println("Erro ao fechar a conexão "+e.getMessage());
    }
}
return check;
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
}

