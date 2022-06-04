import com.el.utils.User.UserUtil;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created with Intellij IDEA
 *
 * @ Author: MarcWebber
 * @ Date: 2022/6/4
 * @ Description:
 * Life is short, I use Java
 */
public class Insert {
        public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql="insert into user_basic_info (id, name, profile, signature, departments) VALUES (?,?,?,?,?)";
        try {
            connection= UserUtil.getConnection();
            preparedStatement=connection.prepareStatement(sql);
            for(int i=211250002;i<211250246;i++){
                preparedStatement.setInt(1,i);
                preparedStatement.setString(2,"软院学生"+i);
                preparedStatement.setURL(3,new URL("https://tse3-mm.cn.bing.net/th/id/OIP-C.MapFpfylBhu2XXf4X6yTtwAAAA?w=151&h=155&c=7&r=0&o=5&dpr=1.25&pid=1.7"));
                /*
                 * @BUG!!!!
                 *
                 */
//                System.out.println("the code is executed!");
                preparedStatement.setString(5,"softwareengineering");
            }
            connection.commit();
            //test
//            return preparedStatement.executeQuery();
//            return statement.executeQuery(sql);
        }catch (SQLException e){
            e.printStackTrace();
            //            return null;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }finally {
            UserUtil.release(connection,preparedStatement,null);
        }
    }
}
