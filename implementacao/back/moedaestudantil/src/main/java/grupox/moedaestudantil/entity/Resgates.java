package grupox.moedaestudantil.entity;

import jakarta.persistence.*;

@Entity
public class Resgates {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long alunoId;

    // Para SAÍDA (vantagem)
    private Long vantagemId;

    // Para ENTRADA e SAÍDA
    private String tipo;     // "ENTRADA" ou "SAIDA"
    private String descricao;
    private Double valor;

    private String data;


    // GETTERS E SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Long alunoId) {
        this.alunoId = alunoId;
    }

    public Long getVantagemId() {
        return vantagemId;
    }

    public void setVantagemId(Long vantagemId) {
        this.vantagemId = vantagemId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
