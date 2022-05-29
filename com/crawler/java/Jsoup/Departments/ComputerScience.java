package Jsoup.Departments;

import Jsoup.Info;
import Jsoup.InformationTranslator;
import Jsoup.MyJsoup;
import Jsoup.Utils.DepartmentExecutor;
import Jsoup.Utils.Exceptions.InfoFetchFailureException;
import Jsoup.Utils.Exceptions.UrlsGetFailureException;
import Main.MyException.MethodToBeCompletedException;
import org.jsoup.nodes.Document;

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
    static Info[] news;                // the news information
    static Info[] lectures;            // the lecture information
    static String[] urls;              // to store the urls that the class need to search
    static final String departmentName = "SoftwareEngineeringUrl";
    static final String[] tags=null;   // to define the tags that is needed to modify the information and grasp the information
    public String[] setUrls() {
        urls = setUrls(departmentName);
        return urls;
    }
    public Info[] getNews() {
        return news;
    }

    @Override
    public void setLectures() {

    }

    public static void setNews(Info[] news) {
        SoftwareEngineering.news = news;
    }

    public Info[] getLectures() {
        return lectures;
    }

    public static void setLectures(Info[] lectures) {
        SoftwareEngineering.lectures = lectures;
    }


    public Info[] getInfo() {
        this.setUrls();
        Document[] doc = new Document[1];
        Arrays.stream(urls).
                forEach(s ->
                {
                    doc[0] =getByDocument(s, null);
                });
        return null;
    }

    @Override
    public void setNews() {

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
    public ComputerScience() throws InfoFetchFailureException, UrlsGetFailureException {
        //to exec the basic command needed to construct a department
        //but i don't think this kind of code is clean and reliable
//        DepartmentExecutor.exec(this);
//        //to set the news got from the websites
//        setNews(getInfo());
//        setNews(InformationTranslator.translateInformation(this));
//        setLectures(getInfo());
//        setLectures(InformationTranslator.translateInformation(this));
    }
}
