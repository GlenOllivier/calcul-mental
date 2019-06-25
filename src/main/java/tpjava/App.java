package tpjava;

import tpjava.dao.domain.Score;
import tpjava.dao.domain.User;
import tpjava.model.Operation.Calculation;
import tpjava.model.Operation.CalculationGenerator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
/*        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-unit-1");

        EntityManager em = emf.createEntityManager();

        User user = new User();
        user.setNickname("bopdu22");
        Score score = new Score();
        score.setScore(8);
        user.setScores(new ArrayList<>());
        user.getScores().add(score);
        score.setUser(user);

        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();


        System.out.println( "Hello World!" );
        em.close();
        emf.close();*/

        Calculation c = CalculationGenerator.generateComplexCalculation(15);
        System.out.println(c.show());
        System.out.println(c.getValue());
    }
}
