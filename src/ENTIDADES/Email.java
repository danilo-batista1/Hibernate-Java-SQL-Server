package ENTIDADES;

/**
 *
 * @author Dupla Danilo Batista e Kalil Isac
 */

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


    //------------------<Tabela Email>------------------//
    @Entity
    @Table(name="Email")
    public class Email implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Email", nullable = true)
    Integer Id;
    
    private String Email;
    

    //----------------------<Getters and Setters>----------------------//
    public Integer getId() {
        return Id;
    }
    
    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Email(String Email) {
        this.Email = Email;
    }
    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
}