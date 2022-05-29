package DataBase.Dao;

import DataBase.SqlResult;
import DataBase.Utils.DBCPUtil;
import Jsoup.Departments.SoftwareEngineering;
import Jsoup.InformationTranslator;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created with Intellij IDEA
 *
 * @ Author: MarcWebber
 * @ Date: 2022/5/29
 * @ Description:
 * Life is short, I use Java
 */
/*
 To manipulate the news_table related to software engineering
 */
public class SoftwareEngineeringNewsDAO implements DAO{
    @Override
    public SqlResult query() {
        return null;
    }
    /*
     to insert info into the software engineering table.
     table structure (news_title, news_abstract, news_date,news_dept)
     */
    @Override
    public SqlResult insert(InformationTranslator informationTranslator) {
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        String sql="INSERT INTO softwareengineering(news_title, news_abstract, news_date,news_dept) values (?,?,?,?)";
        try{
            connection= DBCPUtil.getConnection();
            preparedStatement=connection.prepareStatement(sql);
                        preparedStatement.setString(2,SoftwareEngineering);
                        preparedStatement.setDouble(3,2.142);
                        //sql.Date是数据库的Data
                        //需要传入本机的Data,获取本机时间戳，通过java.sql.Data转化
                        //这边的setCharacterStream怎么用啊？
                        // 使用?占位符代替参数
                        int i=preparedStatement.executeUpdate();
            int i=preparedStatement.executeUpdate();
            if (i <=0){
                return SqlResult.insert_failure;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBCPUtil.release(connection,preparedStatement,null);
        }
        return SqlResult.insert_success;
    }

    @Override
    public SqlResult update() {
        return null;
    }

    @Override
    public SqlResult delete() {
        return null;
    }
}
