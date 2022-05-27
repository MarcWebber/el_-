package Jsoup.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created with Intellij IDEA
 *
 * @ Author: MarcWebber
 * @ Date: 2022/5/25
 * @ Description:
 * Life is short, I use Java
 */

/*
 to parse and get the resources that is needed for a certain website
 */
public class Parser {
    public static Properties webProperties=null;

    public static String[] getUrls(String departmentName){
        String[] urls;
//        FileInputStream in=null;
        InputStream in=Parser.class.getClassLoader().getResourceAsStream("CrawlerConfig.properties");
//        try {
//            in=new FileInputStream("/resources/CrawlerConfig.properties");
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }

        try {
            webProperties.load(in);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        urls=webProperties.getProperty(departmentName).split(";");
        return urls;
    }

}
