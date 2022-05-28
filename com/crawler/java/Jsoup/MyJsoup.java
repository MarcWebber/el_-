package Jsoup;

import Jsoup.Utils.Parser;
import Main.MyException.MethodToBeCompletedException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created with Intellij IDEA
 *
 * @ Author: MarcWebber
 * @ Date: 2022/5/25
 * @ Description:
 * Life is short, I use Java
 */
public interface MyJsoup {
    /*
     to get needed HTML elements
     the tags are used as modifiers
     */
    default String[] setUrls(String departmentName){
        return Parser.getUrls(departmentName);
    }

    default Document getByDocument(String url,String[] tags){

            Document document=null;//the target url
            Connection conn= Jsoup.connect(url);            //connect
            try {
                document=conn.get();
                System.out.println("connection success!");
            }catch (IOException ioe){
                System.out.println("connection failure!");
                ioe.printStackTrace();
            }
            // unused
            // Elements elementAll=document.getAllElements();
            // this should be simplified, and maybe need to be deleted
            Elements elementNews=document.getElementsByTag("li");
            System.err.println("this code is executed!");
            for (Element element:elementNews){
                System.out.println(element.text());
            }
            return null;
    }
    Info getBySelect() throws MethodToBeCompletedException;
    Info getByFilter() throws MethodToBeCompletedException;

}
