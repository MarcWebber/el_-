package DataBase.Utils;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import static org.apache.commons.dbcp.BasicDataSource.*;

/**
 * Created with Intellij IDEA
 *
 * @ Author: MarcWebber
 * @ Date: 2022/5/25
 * @ Description:
 * Life is short, I use Java
 */
/*
 the class is used to establish connection to the commons pool
 the resources are restored in the config/
 */
public class DBCP {
    private static Properties properties;
    private static DataSource dataSource;
    static{
        try{
            InputStream is=DBCP.class.getClassLoader().getResourceAsStream("config/dbcp.properties");
            properties=new Properties();
            properties.load(is);
         }catch(IOException e){
             System.err.println("load property failure");
             e.printStackTrace();
         }

         try{
//             dataSource = BasicDataSource.createDataSource(properties);
         }catch(Exception e){
             System.err.println("DataSource creation failure");
             e.printStackTrace();
         }
 }

         //从连接池中获取一个连接
         public static Connection getConnection(){
             Connection connection = null;
             try{
                     connection = dataSource.getConnection();
                 }catch(SQLException e){
                     e.printStackTrace();
                 }
             try {
                 assert connection != null;
                 connection.setAutoCommit(false);
                 } catch (SQLException e) {
                     e.printStackTrace();
                 }
             return connection;
         }

}
