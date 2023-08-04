package br.com.fiap.domain.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "TB_ALUNO")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ALUNO")
    @SequenceGenerator( name = "SQ_ALUNO", sequenceName = "SQ_ALUNO", allocationSize = 1, initialValue = 1)
    private Long id;

    private String rm;

    private String nome;


    public Aluno() {
    }

    public Aluno(Long id, String rm, String nome) {
        this.id = id;
        this.rm = rm;
        this.nome = nome;
    }


    public Long getId() {
        return id;
    }

    public Aluno setId(Long id) {
        this.id = id;
        return this;
    }

    public String getRm() {
        return rm;
    }

    public Aluno setRm(String rm) {
        this.rm = rm;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Aluno setNome(String nome) {
        this.nome = nome;
        return this;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", rm='" + rm + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
