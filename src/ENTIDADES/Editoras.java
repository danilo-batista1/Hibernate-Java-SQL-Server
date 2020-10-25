package ENTIDADES;

/**
 *
 * @author Dupla Danilo Batista e Kalil Isac
 */

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


    //------------------<Tabela Editora>------------------//
    @Entity
    @Table(name="Editora")
    public class Editoras implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Editora", nullable = true)
    Integer Id;
    
    @Column(name="Nome", length=100, nullable = false)
    private String nome;
    
    
    //---------------Foreign Key <Editora> to <Livros>---------------//
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="Idfk_Editora_Livros")
    public Livro Livros;
    
    
    //----------------------<Getters and Setters>----------------------//
    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livro getLivros() {
        return Livros;
    }

    public void setLivros(Livro Livros) {
        this.Livros = Livros;
    }
}