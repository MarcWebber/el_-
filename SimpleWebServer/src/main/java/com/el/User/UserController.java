package com.el.User;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.el.utils.JsonResult;
import com.el.utils.News.NewsUtil;
import com.el.utils.User.UserDAOUtil;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

/**
 * Created with Intellij IDEA
 *
 * @ Author: MarcWebber
 * @ Date: 2022/5/31
 * @ Description:
 * Life is short, I use Java
 */
public class UserController {
    private int id;
    private String name;
    private URL profile;
    private String signature;
    private List<String> departments;
    private JSONObject basicInformation;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfile(URL profile) {
        this.profile = profile;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public void addDepartments(String dept){
        this.departments.add(dept);
    }

    public void removeDepartments(String dept){
        this.departments.remove(dept);
    }


    // construct a new user
    public UserController(int id) {
        ResultSet resultSet= UserDAOUtil.select(id);
        try {
            /*
             * There's a problem lying here
             * And I don't know why
             * it may be solved now
             * but for what?
             *
             */
            resultSet.next();
            this.id=resultSet.getInt("id");
//            resultSet.next();
            this.name=resultSet.getString("name");
//            resultSet.next();
            this.profile= new URL(resultSet.getString("profile"));
//            resultSet.next();
            this.signature=resultSet.getString("signature");
//            resultSet.next();
            this.departments= Arrays.asList(resultSet.getString("departments").split(" "));
        }catch (SQLException | MalformedURLException e){
            e.printStackTrace();
        } finally {
            try {
                NewsUtil.release(resultSet.getStatement().getConnection(), resultSet.getStatement(),resultSet);
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

    }
    /*
     * @BUG!!!!
     * A BUG MAY BE PRODUCED HERE
     * IF THE BASIC INFO IS CHANGED
     * BUT THE JSON WON'T CHANGE!
     */

    public JsonResult setUserInformationAsJson(){
        if (basicInformation!=null){
            return JsonResult.AlreadySet;
        }else {
            this.basicInformation=new JSONObject();
            this.basicInformation.put("id",this.id);
            this.basicInformation.put("name",this.name);
            this.basicInformation.put("profile",this.profile);
            this.basicInformation.put("signature",this.signature);
            this.basicInformation.put("departments",this.departments);
        }
        return JsonResult.SetSuccess;
    }

    public JSON getUserInformationAsJson(){
        if (this.basicInformation!=null){
            return this.basicInformation;
        }else {
            if (setUserInformationAsJson()==JsonResult.SetSuccess){
                return this.basicInformation;
            }
        }
        return null;
    }
    //test
    public void showInfo(){
        System.out.println("id"+this.id);
        System.out.println("name"+this.name);
        System.out.println("profile"+this.profile);
        System.out.println("signature"+this.signature);
    }
}
