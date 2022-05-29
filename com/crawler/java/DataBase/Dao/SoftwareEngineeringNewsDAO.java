package DataBase.Dao;

import DataBase.SqlResult;
import DataBase.Utils.DBCPUtil;
import Jsoup.Departments.SoftwareEngineering;
import Jsoup.Info;
import Jsoup.InformationTranslator;
import Jsoup.Utils.DepartmentExecutor;
import Jsoup.Utils.Exceptions.InfoFetchFailureException;
import Jsoup.Utils.Exceptions.UrlsGetFailureException;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

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
public class SoftwareEngineeringNewsDAO implements DAO {
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
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Date date=Date.valueOf(String.valueOf("2022-02-11"));
        //test! failure!
        //test!
        String sql = "INSERT INTO softwareengineering(news_title, news_abstract, news_date,news_dept) values ('t0','a0','2022-02-11' ,null)";

        try {
            connection = DBCPUtil.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            Info[] newsInfos = SoftwareEngineering.news;
            for (Info info : newsInfos) {
                /*
                 * @BUG!!!!
                 *
                 */
//                preparedStatement.setString(1, String.valueOf(info.getInformation().get(0)));
//                preparedStatement.setString(2, String.valueOf(info.getInformation().get(1)));
//                preparedStatement.setDate(3, Date.valueOf(String.valueOf(info.getInformation().get(2))));
//                preparedStatement.setString(4, "soft");
                int i = preparedStatement.executeUpdate();

                System.err.println("有"+i+"行数据被修改");
                if (i <= 0) {
                    return SqlResult.insert_failure;
                }
            }
            //sql.Date是数据库的Data
            //需要传入本机的Data,获取本机时间戳，通过java.sql.Data转化
            //这边的setCharacterStream怎么用啊？
            // 使用?占位符代替参数
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        finally {
//            DBCPUtil.release(connection, preparedStatement, null);
//        }
        return SqlResult.insert_success;
    }

    /*
     to test the code
     i think it won't work
     */
    public static void main(String[] args) throws InfoFetchFailureException, UrlsGetFailureException {
        Info[] infos = new Info[2];
        List<String> optionals1 = new ArrayList<>();
        optionals1.add("title1");
        optionals1.add("abstract1");
        optionals1.add("2022-02-02");
        infos[0]=new Info();
        infos[1]=new Info();
        infos[0].setPrimaryKey("1");
        infos[0].setInformation(optionals1);

        List<String> optionals2 = new ArrayList<>();
        optionals2.add("title2");
        optionals2.add("abstract2");
        optionals2.add("2022-02-06");
        infos[1].setPrimaryKey("2");
        infos[1].setInformation(optionals2);

        SoftwareEngineering.setNews(infos);
        SoftwareEngineeringNewsDAO softwareEngineering = new SoftwareEngineeringNewsDAO();
        System.err.println(softwareEngineering.insert(null));
//        System.err.println(DepartmentExecutor.getLastError());
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
