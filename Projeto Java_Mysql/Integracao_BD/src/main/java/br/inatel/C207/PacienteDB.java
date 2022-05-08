package br.inatel.C207;

public class PacienteDB {
    private String nomePaciente;
    private String sintomas;
    private int idade;
    private int id;

public PacienteDB(int id){
    this.id = id;
}
    public PacienteDB(String nomePaciente, String sintomas,int idade,int id) {
       this.sintomas = sintomas;
       this.nomePaciente = nomePaciente;
       this.idade = idade;
       this.id = id;
    }
public void pedirConsulta(){
    System.out.println("Pedir consulta");

}
public void removerUsuario(String nomePaciente){
        this.nomePaciente = nomePaciente;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
