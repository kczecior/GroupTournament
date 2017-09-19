import entity.Player;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.awt.print.Book;

public class SessionFactoryManager {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if(sessionFactory == null) {
            StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
                    .applySetting("hibernate.connection.url", "jdbc:mysql://localhost:3306/persondb")
                    .applySetting("hibernate.connection.username", "root")
                    .applySetting("hibernate.connection.password", "")
                    .applySetting("hibernate.connection.driver", "com.mysql.jdbc.Driver")
                    .applySetting("hibernate.connection.dialect", "org.hibernate.dialect.MySQLDialect")
                    .applySetting("hibernate.hbm2ddl.auto", "create")
                    .applySetting("hibernate.show_sql", true)
                    .applySetting("hibernat.format_sql",true)
                    .build();
            MetadataSources metadataSources = new MetadataSources(standardServiceRegistry)
                    .addAnnotatedClass(Player.class);
            Metadata metadata = metadataSources.buildMetadata();
            sessionFactory = metadata.buildSessionFactory();
        }
        return sessionFactory;
    }
}
