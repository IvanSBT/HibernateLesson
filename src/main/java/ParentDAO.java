import org.hibernate.Session;
import org.hibernate.Transaction;

public class ParentDAO {

    public void save(Parent parent) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(parent);
        tx1.commit();
        session.close();
    }

    public Parent findById(int id) {
        return HibernateUtils.getSessionFactory().openSession().get(Parent.class, id);
    }
}
