package br.inatel.C207.Class;

import br.inatel.C207.DB.Database;

    public class Paciente {
        private String nomePaciente;
        private String sintomas;
        private int idade;
        private int idPaciente;
        public int AtendenteDB_idAtendenteDB;

        public Paciente(int idPaciente){
            this.idPaciente = idPaciente;
        }
        public Paciente(){
        }
        public Paciente(String nomePaciente, String sintomas,int idade,int idPaciente) {
            this.sintomas = sintomas;
            this.nomePaciente = nomePaciente;
            this.idade = idade;
            this.idPaciente = idPaciente;
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

        public int getIdPaciente() {
            return idPaciente;
        }

        public void setIdPaciente(int idPaciente) {
            this.idPaciente = idPaciente;
        }
    }

