package design_pattern.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {
    private static SingletonConnection singletonConnection;
    private Connection connection;

    private SingletonConnection() {
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String user="scott";
        String password="tiger";
        try{
            connection= DriverManager.getConnection(url,user,password);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public SingletonConnection getInstance(){
        if(singletonConnection==null){
            return new SingletonConnection();
        }
        return singletonConnection;
    }

    public Connection getConnection(){
        return connection;
    }
}
