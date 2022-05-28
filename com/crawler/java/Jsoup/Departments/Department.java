package Jsoup.Departments;

import Jsoup.Info;

/**
 * Created with Intellij IDEA
 *
 * @ Author: MarcWebber
 * @ Date: 2022/5/28
 * @ Description:
 * Life is short, I use Java
 */
/*
 define the behavior of different departments
 */
public interface Department {
    void finalize() throws Throwable;
    //set the urls that needed to be searched in a certain department
    String[] setUrls();
    //get Info is used to get the related information
    Info getInfo();
}
