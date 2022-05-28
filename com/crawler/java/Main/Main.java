package Main;

import Jsoup.Departments.*;
import Jsoup.Utils.DepartmentExecutor;
import Jsoup.Utils.Exceptions.InfoFetchFailureException;
import Jsoup.Utils.Exceptions.UrlsGetFailureException;

/**
 * Created with Intellij IDEA
 *
 * @ Author: MarcWebber
 * @ Date: 2022/5/25
 * @ Description:
 * Life is short, I use Java
 */
public class Main {
    /*
     load the selected department and get the information according to
     the department names(to get the information, a certain Department
     class should be loaded and getInfo method should be called

     to get the selected department, read from the resources
     */
    public static void main(String[] args) throws InfoFetchFailureException, UrlsGetFailureException {
        SoftwareEngineering softwareEngineering=new SoftwareEngineering();
        ComputerScience computerScience=new ComputerScience();
        DepartmentExecutor departmentExecutor=new DepartmentExecutor();
        departmentExecutor.exec(computerScience);
    }
}
