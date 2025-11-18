package grupox.moedaestudantil.entity;

import jakarta.persistence.Entity;


@Entity
public class Professor extends Usuario {
    private int saldo;
    private String instituicao_cnpj;
    private String departamento;
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public String getInstituicao_cnpj() {
        return instituicao_cnpj;
    }
    public void setInstituicao_cnpj(String instituicao_cnpj) {
        this.instituicao_cnpj = instituicao_cnpj;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
