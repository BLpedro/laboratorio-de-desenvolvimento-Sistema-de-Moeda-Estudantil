package grupox.moedaestudantil.entity;

import java.util.List;

import jakarta.persistence.*;


@Entity
public class Instituicao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
    private String cnpj;
    private String nome;


     @OneToMany(mappedBy = "instituicao")
    private List<Aluno> alunos;

     public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

}
