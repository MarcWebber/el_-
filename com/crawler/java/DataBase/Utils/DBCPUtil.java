package DataBase.Utils;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

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
public class DBCPUtil {
    private static Properties properties;
    private static DataSource dataSource;
    //create dataSource
    static {
        try {
            System.err.println("the class is initialized!");
            InputStream in = DBCPUtil.class.getClassLoader().getResourceAsStream("dbcpconfig.properties");
            properties = new Properties();
            properties.load(in);
            try {
            dataSource = BasicDataSourceFactory.createDataSource(properties);
            } catch (Exception e) {
                System.err.println("DataSource creation failure");
                e.printStackTrace();
            }
        } catch (IOException e) {
            System.err.println("load property failure");
            e.printStackTrace();
        }
    }

    //get a connection from the dataSource
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // to start a transmission
        try {
            assert connection != null;
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public static void release(Connection conn, Statement st, ResultSet rs){
        assert rs!=null;
        try {
            rs.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

        assert st!=null;
        try {
            st.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

        assert conn!=null;
        try {
            conn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}