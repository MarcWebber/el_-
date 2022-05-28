package Jsoup.Departments;

import Jsoup.Info;
import Jsoup.MyJsoup;
import Main.MyException.MethodToBeCompletedException;

import java.util.Arrays;

/**
 * Created with Intellij IDEA
 *
 * @ Author: MarcWebber
 * @ Date: 2022/5/28
 * @ Description:
 * Life is short, I use Java
 */
public final class ComputerScience implements MyJsoup,Department{
    private Info[] news;                // the news information
    private Info[] lectures;            // the lecture information
    private String[] urls;              // to store the urls that the class need to search
    static final String departmentName="ComputerScienceUrl";

    public String[] setUrls(){
        this.urls=setUrls(this.departmentName);
        return this.urls;
    }

    public Info getInfo(){
        this.setUrls();
        Arrays.stream(this.urls).
                forEach(s ->
                {getByDocument(s,null );});
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
    public void finalize() throws Throwable {
        super.finalize();
    }

}
