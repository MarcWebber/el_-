package Jsoup.Utils;

import Jsoup.Departments.Department;
import Jsoup.Utils.Exceptions.InfoFetchFailureException;
import Jsoup.Utils.Exceptions.UrlsGetFailureException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA
 *
 * @ Author: MarcWebber
 * @ Date: 2022/5/28
 * @ Description:
 * Life is short, I use Java
 */
/*
 to execute a department, setUrls and getInfo
 provide the getLastError function so that you can get the error if you want to debug
 */
public class DepartmentExecutor {
    static List<String> errors;
    public static String exec(Department dept) throws InfoFetchFailureException, UrlsGetFailureException {
        if (errors==null){
            errors=new ArrayList<>();
        }
//        if (dept.setUrls()==null){
//            errors.add("UrlsGetFailureException");
//            throw new UrlsGetFailureException();
//        }
//        if (dept.getInfo()==null){
//            errors.add("InfoFetchFailureException");
//            throw new InfoFetchFailureException();
//        }
        errors.add("Success!");
        return getLastError();
    }

    //get error in execution
    public static String getLastError(){
        if (errors==null){
            return "Not Initialized!";
        }
        int index=errors.size();
        return errors.remove(index);
    }
}
