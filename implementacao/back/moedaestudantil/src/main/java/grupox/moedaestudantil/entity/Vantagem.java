package grupox.moedaestudantil.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vantagem {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
    private String foto;
    private int valor;
    private String descricao;
    private String empresaId;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getEmpresaId() {
        return empresaId;
    }
    public void setEmpresaId(String empresaId) {
        this.empresaId = empresaId;
    }


}
