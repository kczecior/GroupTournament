import org.hibernate.Session;

public class HibernateDao<T> {
    private Session session;
    private Class<T> clazz;

    public HibernateDao( Class clazz ) {
        this.clazz = clazz;
    }

    public void add( T entity ) {
        session.save(entity);
    }

    public void update( T entity ) {
        session.update(entity);
    }

    public T get( int id ) {
        return session.get(clazz, id);
    }

    public void delete( int id ) {
        T entity = session.get(clazz, id);
        session.delete(entity);
    }
}
