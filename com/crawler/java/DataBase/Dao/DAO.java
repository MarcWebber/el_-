package DataBase.Dao;

import DataBase.SqlResult;
import Jsoup.InformationTranslator;

/**
 * Created with Intellij IDEA
 *
 * @ Author: MarcWebber
 * @ Date: 2022/5/26
 * @ Description:
 * Life is short, I use Java
 */
public interface DAO {
    SqlResult query();
    /*
     to insert information into the dataBase
     */
    SqlResult insert(InformationTranslator informationTranslator);
    SqlResult update();
    SqlResult delete();
}
