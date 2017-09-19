import org.hibernate.Session;

public class HibernateDao<T> {
    private Session session;
    private Class<T> clazz;

    public HibernateDao( Class clazz ) {
        this.clazz = clazz;
    }


}
