package br.inatel.C207.DB;

import java.sql.SQLException;

public class PacienteDB extends Database {
    private String nomePaciente;
    private String sintomas;
    private int idade;
    private int idPaciente;
    private int AtendenteDB_idAtendenteDB;

    public PacienteDB(int idPaciente){
        this.idPaciente = idPaciente;
    }
    public PacienteDB(){
    }
    public PacienteDB(String nomePaciente, String sintomas,int idade,int idPaciente) {
        this.sintomas = sintomas;
        this.nomePaciente = nomePaciente;
        this.idade = idade;
        this.idPaciente = idPaciente;
    }
    public String getNomePaciente() {
        return nomePaciente;
    }
    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }
    public String getSintomas() {
        return sintomas;
    }
    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdPacienteDB() {return idPaciente;}
    public void setIdPacienteDB(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public boolean updatePaciente(String nomePaciente,int idPaciente,int AtendenteDB_idAtendenteDB){ //atualizar dados do atendente
        connect();
        String sql = "UPDATE pacienteDB SET nomePaciente =? WHERE idPaciente =? AND AtendenteDB_idAtendenteDB=?"; //Comando utilizado no Sql transcrevido em TEXTO
        try{
            pst = connection.prepareStatement(sql); //preparando conexao
            pst.setString(1,nomePaciente);   // preparando Query para nomePaciente
            pst.setInt (2,idPaciente);   //preparando Query para idPacienteDB
            pst.setInt(3,AtendenteDB_idAtendenteDB);
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




}
