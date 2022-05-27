package Jsoup.Departments;

import Jsoup.Info;
import Jsoup.MyJsoup;
import Main.MyException.MethodToBeCompletedException;

import java.util.Arrays;

/**
 * Created with Intellij IDEA
 *
 * @ Author: MarcWebber
 * @ Date: 2022/5/25
 * @ Description:
 * Life is short, I use Java
 */
public class SoftwareEngineering implements MyJsoup {
    private Info[] news;                // the news information
    private Info[] lectures;            // the lecture information
    private String[] urls;              // to store the urls that the class need to search
    static final String departmentName="SoftwareEngineeringUrl";

    public void set(){
        this.urls=setUrls(this.departmentName);
    }

    public Info getInfo(){
        this.set();
        Arrays.stream(this.urls).
                forEach(s ->
                {getByDocument(s,null);});
        return null;
    }

    @Override
    public Info getBySelect() throws MethodToBeCompletedException {
        throw new MethodToBeCompletedException();
    }

    @Override
    public Info getByFilter() throws MethodToBeCompletedException {
        throw new MethodToBeCompletedException();
    }

    //i wonder if this class should be finalized
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}