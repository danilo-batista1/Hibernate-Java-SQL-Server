package ENTIDADES;

/**
 *
 * @author Dupla Danilo Batista e Kalil Isac
 */

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


    //------------------<Tabela Livros>------------------//
    @Entity
    @Table(name="Livros")
    public class Livro implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_ISBN", nullable = true)
    Integer Id;
    
    @Column(name="Edição", length=50, nullable = false)
    private int edicao;
    
    @Column(name="Custo", length=10000000, nullable = false)
    private double custo;
    
    @Column(name="Título", length=100, nullable = false)
    private String titulo;
    
  
    //---------------Foreign Key <Livro> to <Autor>---------------//  
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="Idfk_Autores_Livros")
    public Autor Autores;
    
   
    //---------------Foreign Key <Livros> to <Editora>---------------//  
    @OneToMany(
    cascade = CascadeType.ALL,
    orphanRemoval = true
    )
 
    public List<Editoras> editora;
    
    
    //----------------------<Getters and Setters>----------------------//
    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutores() {
        return Autores;
    }

    public void setAutores(Autor Autores) {
        this.Autores = Autores;
    }

    public List<Editoras> getEditora() {
        return editora;
    }

    public void setEditora(List<Editoras> editora) {
        this.editora = editora;
    }  
}