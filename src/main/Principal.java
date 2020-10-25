package main;

/**
 *
 * @author Dupla Danilo Batista e Kalil Isac
 */

import ENTIDADES.Autor;
import ENTIDADES.Editoras;
import ENTIDADES.Email;
import ENTIDADES.Livro;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {

    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernatePU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        
        //------------------<Inserir Dados Autores>------------------//
        Autor A1 = new Autor();
        A1.setNome("Kalil Isac");
        A1.email = new ArrayList<Email>();
        A1.email.add(new Email("kalilisac2221@gmail.com"));
        
        Autor A2 = new Autor();
        A2.setNome("Danilo Batista");
        A2.email = new ArrayList<Email>();
        A2.email.add(new Email("danilo2221@hotmail.com"));
        
        Autor A3 = new Autor();
        A3.setNome("Leonardo Henrique");
        A3.email = new ArrayList<Email>();
        A3.email.add(new Email("caiofernandes@ig.com.br")); 
        
        Autor A4 = new Autor();
        A4.setNome("Paulinho Rocha");
        A4.email = new ArrayList<Email>();
        A4.email.add(new Email("paulinhosilveirapedestre@outlook.com"));
        
        Autor A5 = new Autor();
        A5.setNome("Rodrigo Faria");
        A5.email = new ArrayList<Email>();
        A5.email.add(new Email("luizrocha@hotmail.com.br"));
        
        Autor A6 = new Autor();
        A6.setNome("Fernanda Moraes");
        A6.email = new ArrayList<Email>();
        A6.email.add(new Email("fernandamoraes1@gmail.com"));
        
        Autor A7 = new Autor();
        A7.setNome("Alvaro Gomes");
        A7.email = new ArrayList<Email>();
        A7.email.add(new Email("alvaroz33@hotmail.com"));
        
        Autor A8 = new Autor();
        A8.setNome("Marcos Oliveira");
        A8.email = new ArrayList<Email>();
        A8.email.add(new Email("olivermarcos@ig.com.br")); 
        
        Autor A9 = new Autor();
        A9.setNome("Armando Goes");
        A9.email = new ArrayList<Email>();
        A9.email.add(new Email("armangoes5@outlook.com"));
        
        Autor A10 = new Autor();
        A10.setNome("Kaua Sousa");
        A10.email = new ArrayList<Email>();
        A10.email.add(new Email("kauazz1@hotmail.com.br"));
        
        Autor A11 = new Autor();
        A11.setNome("Vinicius Dias");
        A11.email = new ArrayList<Email>();
        A11.email.add(new Email("vinicin123@gmail.com"));
        
        Autor A12 = new Autor();
        A12.setNome("Giovanna Lima");
        A12.email = new ArrayList<Email>();
        A12.email.add(new Email("gilima5@hotmail.com"));
        
        Autor A13 = new Autor();
        A13.setNome("Bruna Cavalcanti");
        A13.email = new ArrayList<Email>();
        A13.email.add(new Email("brucal999@ig.com.br")); 
        
        Autor A14 = new Autor();
        A14.setNome("Ryan Souza");
        A14.email = new ArrayList<Email>();
        A14.email.add(new Email("ryanlegal8@outlook.com"));
        
        Autor A15 = new Autor();
        A15.setNome("Maria Gomes");
        A15.email = new ArrayList<Email>();
        A15.email.add(new Email("gomesmah@hotmail.com.br"));
        
        Autor A16 = new Autor();
        A16.setNome("Vitoria Souza");
        A16.email = new ArrayList<Email>();
        A16.email.add(new Email("viihsouza1@gmail.com"));
        
        Autor A17 = new Autor();
        A17.setNome("Thais Souza");
        A17.email = new ArrayList<Email>();
        A17.email.add(new Email("thaisinha3@hotmail.com"));
        
        Autor A18 = new Autor();
        A18.setNome("Matheus Barbosa");
        A18.email = new ArrayList<Email>();
        A18.email.add(new Email("barbosinhamath@ig.com.br")); 
        
        Autor A19 = new Autor();
        A19.setNome("Julieta Oliveira");
        A19.email = new ArrayList<Email>();
        A19.email.add(new Email("juuholiver@outlook.com"));
        
        Autor A20 = new Autor();
        A20.setNome("Mariana Dias");
        A20.email = new ArrayList<Email>();
        A20.email.add(new Email("marianadiahs@hotmail.com.br"));
        
        Autor A21 = new Autor();
        A21.setNome("Luana Carvalho");
        A21.email = new ArrayList<Email>();
        A21.email.add(new Email("luuhcar222@gmail.com"));
        
        Autor A22 = new Autor();
        A22.setNome("Lara Lima");
        A22.email = new ArrayList<Email>();
        A22.email.add(new Email("laahlima1@hotmail.com"));
        
        Autor A23 = new Autor();
        A23.setNome("Rebeca Chagas");
        A23.email = new ArrayList<Email>();
        A23.email.add(new Email("becacha2244@ig.com.br")); 
        
        Autor A24 = new Autor();
        A24.setNome("Paulo Correia");
        A24.email = new ArrayList<Email>();
        A24.email.add(new Email("paulocorreira695@outlook.com"));
        
        Autor A25 = new Autor();
        A25.setNome("Fernando Rocheiro Silveira");
        A25.email = new ArrayList<Email>();
        A25.email.add(new Email("fernando123@hotmail.com.br"));
        
        
        //------------------<Inserir Dados Livros>------------------//  
        Livro L1 = new Livro();
        L1.setAutores(A1);
        L1.setEdicao(19);
        L1.setCusto(132.30);
        L1.setTitulo("O Pequeno Danilo");
        
        Livro L2 = new Livro();
        L2.setAutores(A2);
        L2.setEdicao(82);
        L2.setCusto(99.99);
        L2.setTitulo("O Principe da Percia");
        
        Livro L3 = new Livro();
        L3.setAutores(A3);
        L3.setEdicao(36);
        L3.setCusto(15.00);
        L3.setTitulo("Fernando Sorocaba e a Música");
    
        Livro L4 = new Livro();
        L4.setAutores(A4);
        L4.setEdicao(40);
        L4.setCusto(44.00);
        L4.setTitulo("Joao Frango");
        
        Livro L5 = new Livro();
        L5.setAutores(A5);
        L5.setEdicao(11);
        L5.setCusto(23.30);
        L5.setTitulo("O Celular Esperto da Senhora");
        
        Livro L6 = new Livro();
        L6.setAutores(A6);
        L6.setEdicao(1);
        L6.setCusto(100.29);
        L6.setTitulo("Viagem ao Mundo");
        
        Livro L7 = new Livro();
        L7.setAutores(A7);
        L7.setEdicao(85);
        L7.setCusto(55.92);
        L7.setTitulo("Parada Social");
        
        Livro L8 = new Livro();
        L8.setAutores(A8);
        L8.setEdicao(126);
        L8.setCusto(17.00);
        L8.setTitulo("No Comando");
    
        Livro L9 = new Livro();
        L9.setAutores(A9);
        L9.setEdicao(15);
        L9.setCusto(92.00);
        L9.setTitulo("Te amo pra sempre");
        
        Livro L10 = new Livro();
        L10.setAutores(A10);
        L10.setEdicao(2);
        L10.setCusto(23.30);
        L10.setTitulo("O Livro do amanhã");
        
        Livro L11 = new Livro();
        L11.setAutores(A11);
        L11.setEdicao(9);
        L11.setCusto(120.72);
        L11.setTitulo("O gigante Marcos");
        
        Livro L12 = new Livro();
        L12.setAutores(A12);
        L12.setEdicao(15);
        L12.setCusto(13.52);
        L12.setTitulo("Problemas da vida");
        
        Livro L13 = new Livro();
        L13.setAutores(A13);
        L13.setEdicao(6);
        L13.setCusto(47.00);
        L13.setTitulo("Arnaldo, o sabichão");
    
        Livro L14 = new Livro();
        L14.setAutores(A14);
        L14.setEdicao(55);
        L14.setCusto(260.00);
        L14.setTitulo("Josué, o Coelho");
        
        Livro L15 = new Livro();
        L15.setAutores(A15);
        L15.setEdicao(159);
        L15.setCusto(46.12);
        L15.setTitulo("Tempo Perdido");
        
        Livro L16 = new Livro();
        L16.setAutores(A16);
        L16.setEdicao(55);
        L16.setCusto(325.37);
        L16.setTitulo("O Absurdo");
        
        Livro L17 = new Livro();
        L17.setAutores(A17);
        L17.setEdicao(13);
        L17.setCusto(102.71);
        L17.setTitulo("Uma Frase Legal");
        
        Livro L18 = new Livro();
        L18.setAutores(A18);
        L18.setEdicao(9);
        L18.setCusto(23.18);
        L18.setTitulo("Oi, tudo bem?");
    
        Livro L19 = new Livro();
        L19.setAutores(A19);
        L19.setEdicao(25);
        L19.setCusto(25.25);
        L19.setTitulo("Motta, o motoboy");
        
        Livro L20 = new Livro();
        L20.setAutores(A20);
        L20.setEdicao(57);
        L20.setCusto(15.32);
        L20.setTitulo("Bauducco, a história da bolacha");
        
        Livro L21 = new Livro();
        L21.setAutores(A21);
        L21.setEdicao(33);
        L21.setCusto(88.55);
        L21.setTitulo("Leonardo, o sagaz");
        
        Livro L22 = new Livro();
        L22.setAutores(A22);
        L22.setEdicao(1);
        L22.setCusto(92.29);
        L22.setTitulo("Danilo, o pequenino");
        
        Livro L23 = new Livro();
        L23.setAutores(A23);
        L23.setEdicao(2);
        L23.setCusto(2.90);
        L23.setTitulo("Máquinas do asfalto");
    
        Livro L24 = new Livro();
        L24.setAutores(A24);
        L24.setEdicao(55);
        L24.setCusto(752.31);
        L24.setTitulo("A história da história");
        
        Livro L25 = new Livro();
        L25.setAutores(A25);
        L25.setEdicao(3);
        L25.setCusto(88.37);
        L25.setTitulo("Tecnologias do futuro");
        
        
        //------------------<Inserir Dados Editoras>------------------// 
        Editoras E1 = new Editoras();
        E1.setLivros(L1);
        E1.setNome("Kalil Isac Fernandes");
        
        Editoras E2 = new Editoras();
        E2.setLivros(L2);
        E2.setNome("Danilo Batista da Silva");
        
        Editoras E3 = new Editoras();
        E3.setLivros(L3);
        E3.setNome("Diego Rochelle Silveira");
        
        Editoras E4 = new Editoras();
        E4.setLivros(L4);
        E4.setNome("Leonardo Henrique Rodrigues");
        
        Editoras E5 = new Editoras();
        E5.setLivros(L5);
        E5.setNome("Douglas Simano Forget");
        
        Editoras E6 = new Editoras();
        E6.setLivros(L6);
        E6.setNome("AP Cultural");
        
        Editoras E7 = new Editoras();
        E7.setLivros(L7);
        E7.setNome("Editora Ariel");
        
        Editoras E8 = new Editoras();
        E8.setLivros(L8);
        E8.setNome("Artenova");
        
        Editoras E9 = new Editoras();
        E9.setLivros(L9);
        E9.setNome("Editora Nemo");
        
        Editoras E10 = new Editoras();
        E10.setLivros(L10);
        E10.setNome("Editora Abril");
        
        Editoras E11 = new Editoras();
        E11.setLivros(L11);
        E11.setNome("Axcel Books");
        
        Editoras E12 = new Editoras();
        E12.setLivros(L12);
        E12.setNome("Cejup");
        
        Editoras E13 = new Editoras();
        E13.setLivros(L13);
        E13.setNome("Cedibra");
        
        Editoras E14 = new Editoras();
        E14.setLivros(L14);
        E14.setNome("Grupo A");
        
        Editoras E15 = new Editoras();
        E15.setLivros(L15);
        E15.setNome("Circo Editorial");
        
        Editoras E16 = new Editoras();
        E16.setLivros(L16);
        E16.setNome("Casa Editora");
        
        Editoras E17 = new Editoras();
        E17.setLivros(L17);
        E17.setNome("Hucitec");
        
        Editoras E18 = new Editoras();
        E18.setLivros(L18);
        E18.setNome("Hama Editora");
        
        Editoras E19 = new Editoras();
        E19.setLivros(L19);
        E19.setNome("Editora Hemus");
        
        Editoras E20 = new Editoras();
        E20.setLivros(L20);
        E20.setNome("Editora Pensante");
        
        Editoras E21 = new Editoras();
        E21.setLivros(L21);
        E21.setNome("Graça Editorial");
        
        Editoras E22 = new Editoras();
        E22.setLivros(L22);
        E22.setNome("Geração Editorial");
        
        Editoras E23 = new Editoras();
        E23.setLivros(L23);
        E23.setNome("Ateliê Editorial");
        
        Editoras E24 = new Editoras();
        E24.setLivros(L24);
        E24.setNome("Editora Trindade");
        
        Editoras E25 = new Editoras();
        E25.setLivros(L25);
        E25.setNome("PME");
    
        try{
            
            em.persist(A1);
            em.persist(A2);
            em.persist(A3);
            em.persist(A4);
            em.persist(A5);
            em.persist(A6);
            em.persist(A7);
            em.persist(A8);
            em.persist(A9);
            em.persist(A10);
            em.persist(A11);
            em.persist(A12);
            em.persist(A13);
            em.persist(A14);
            em.persist(A15);
            em.persist(A16);
            em.persist(A17);
            em.persist(A18);
            em.persist(A19);
            em.persist(A20);
            em.persist(A21);
            em.persist(A22);
            em.persist(A23);
            em.persist(A24);
            em.persist(A25);
            
            em.persist(L1);
            em.persist(L2);
            em.persist(L3);
            em.persist(L4);
            em.persist(L5);
            em.persist(L6);
            em.persist(L7);
            em.persist(L8);
            em.persist(L9);
            em.persist(L10);
            em.persist(L11);
            em.persist(L12);
            em.persist(L13);
            em.persist(L14);
            em.persist(L15);
            em.persist(L16);
            em.persist(L17);
            em.persist(L18);
            em.persist(L19);
            em.persist(L20);
            em.persist(L21);
            em.persist(L22);
            em.persist(L23);
            em.persist(L24);
            em.persist(L25);
            
            em.persist(E1);
            em.persist(E2);
            em.persist(E3);
            em.persist(E4);
            em.persist(E5);
            em.persist(E6);
            em.persist(E7);
            em.persist(E8);
            em.persist(E9);
            em.persist(E10);
            em.persist(E11);
            em.persist(E12);
            em.persist(E13);
            em.persist(E14);
            em.persist(E15);
            em.persist(E16);
            em.persist(E17);
            em.persist(E18);
            em.persist(E19);
            em.persist(E20);
            em.persist(E21);
            em.persist(E22);
            em.persist(E23);
            em.persist(E24);
            em.persist(E25);
            
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
        }
            em.close();
            emf.close();  
        }   
          
         /* O único método que conseguir para rodar o ID 25 do Editores, foi
            criando os 25 registros para cada tabela. */

         /* Professor, tentei tudo que achei possível, 
            mas nada resolveu... Segue abaixo o script. */
    
            // ------------------<HQL Consulta>------------------ //
    
          /*String consulta = "FROM Autores";
            Query q = em.createQuery(consulta);
            List<Autor> resultado = q.getResultList();
            
            for (int i = 0; i <= resultado.size()-1; i++)
            {
                Autor a = (Autor)resultado.get(i);
                System.out.println("SQL: " +a.nome);
            }
            
            // Busca por Objeto
            Autor a = em.find(Autor.class, 1);
            System.out.println("Find: " + a.nome);
            
            // SQL
            consulta = "SELECT nome FROM Autores";
            q = em.createQuery(consulta);
            resultado = q.getResultList();
            
            for (int i = 0; i <= resultado.size()-1; i++)
            {
                a = (Autor)resultado.get(i);
                System.out.println("SQL: " + a.nome); 
        } 
    }*/
}