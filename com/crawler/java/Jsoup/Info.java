package Jsoup;

import org.jsoup.nodes.Document;

import java.util.*;
import java.util.stream.Collector;

/**
 * Created with Intellij IDEA
 *
 * @ Author: MarcWebber
 * @ Date: 2022/5/25
 * @ Description:
 * Life is short, I use Java
 */

/*
 It's a class that define the structure of the return value
 primary key map to the primary key in the database
 information map to the other columns in the database
 need to be transformed
 */
public final class Info {
        private String primaryKey;
        private List<?> information;

        public void setPrimaryKey(String primaryKey) {
                this.primaryKey = primaryKey;
        }

        public void setInformation(List<?> information) {
                this.information = information;
        }

        public String getPrimaryKey() {
                return primaryKey;
        }

        public List<?> getInformation() {
                return information;
        }

//        pubString toString(Optional<Object> obj){
//                return String.valueOf(obj);
//        }
        //    Map<Integer, List<String>> infoList;
//
//    public void set(Document document) {
//        String[] text = document.text().split(" ");
//        List<String> stringList = null;
//        for (int i=1;i<text.length;i++){
//            stringList.add(text[i]);
//        }
//        this.infoList.put(Integer.getInteger(text[0]),
//                stringList);
//    }
//
//    public Info get(){
//        return this.infoList;
//    }
}

