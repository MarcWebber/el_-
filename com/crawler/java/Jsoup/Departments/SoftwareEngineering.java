package Jsoup.Departments;

import Jsoup.Info;
import Jsoup.MyJsoup;
import Main.MyException.MethodToBeCompletedException;
import org.jsoup.nodes.Document;

import java.util.Arrays;

/**
 * Created with Intellij IDEA
 *
 * @ Author: MarcWebber
 * @ Date: 2022/5/25
 * @ Description:
 * Life is short, I use Java
 */
public final class SoftwareEngineering implements MyJsoup, Department {


    static Info[] news;                // the news information
    static Info[] lectures;            // the lecture information
    static String[] urls;              // to store the urls that the class need to search
    static final String departmentName = "SoftwareEngineeringUrl";
    public String[] setUrls() {
        urls = setUrls(departmentName);
        return urls;
    }
    public Info[] getNews() {
        return news;
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


    public Info getInfo() {
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
    public SoftwareEngineering(){
        setNews(getNews());
        setLectures(getLectures());

    }
}