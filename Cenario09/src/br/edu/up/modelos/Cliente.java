package br.edu.up.modelos;

public class Cliente {
private String nome;
private String telefone;
private String email;
private String endereço;
private Double vlrMAximoCredito;
private Double vlrEmprestado;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVlrMAximoCredito() {
        return this.vlrMAximoCredito;
    }

    public void setVlrMAximoCredito(Double vlrMAximoCredito) {
        this.vlrMAximoCredito = vlrMAximoCredito;
    }

    public Double getVlrEmprestado() {
        return this.vlrEmprestado;
    }

    public void setVlrEmprestado(Double vlrEmprestado) {
        this.vlrEmprestado = vlrEmprestado;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereço() {
        return this.endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public void emprestar(){
    }
    public Double devolver(Double valor){
        return 0.0;
    }
}
