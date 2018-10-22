
import com.model.BooksEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws SQLException {

        BooksEntity book = new BooksEntity();
        book.setId(1);
        book.setBookAutor("Yaroslav");
        book.setBookTitle("Анекдоты");
        book.setBookPrice(2000);

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.save(book);
        session.getTransaction();
        session.close();

    }
}
