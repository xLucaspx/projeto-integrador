package factory;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String DATABASE = "projeto_integrador";

    public static Connection getConnection() {
        try {
            return createDataSource().getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static HikariDataSource createDataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/" + DATABASE);
        config.setUsername(USERNAME);
        config.setPassword(PASSWORD);
        config.setMaximumPoolSize(5);
        
        return new HikariDataSource(config);
    }
}
