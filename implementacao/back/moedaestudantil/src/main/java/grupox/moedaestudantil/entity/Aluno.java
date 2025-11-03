package grupox.moedaestudantil.entity;

import jakarta.persistence.Entity;


@Entity
public class Aluno extends Usuario {
    private String cpf;
    private String nome;
    private String email;
    private String rg;
    private String curso;
    private String endereco;
    private double saldo;
    private String instituicaoId;

    
    public String getInstituicaoId() {
        return instituicaoId;
    }
    public void setInstituicaoId(String instituicaoId) {
        this.instituicaoId = instituicaoId;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
