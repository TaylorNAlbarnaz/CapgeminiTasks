/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import java.sql.Connection;
import util.ConnectionFactory;

public class Main {
    public static void main(String[] args) {
        Connection connection = ConnectionFactory.getConnection();
        
        ConnectionFactory.closeConnection(connection);
    }
}