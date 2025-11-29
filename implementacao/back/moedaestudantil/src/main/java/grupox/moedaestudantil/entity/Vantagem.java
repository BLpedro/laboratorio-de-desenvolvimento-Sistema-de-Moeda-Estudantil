package grupox.moedaestudantil.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Vantagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String foto;
    private int valor;
    private int quant;
    private String descricao;
    private String empresaId;

    @ManyToOne
    @JoinColumn(name = "aluno_id") // cria coluna no banco
    private Aluno aluno;

    public int getQuant(){
        return quant;
    }
    public void setQuant(int quant){
        this.quant = quant;
    }

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

    // Getter e Setter DO ALUNO
    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
