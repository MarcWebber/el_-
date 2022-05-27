package Jsoup;

import java.util.List;
import java.util.Optional;

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
public class Info {
    private String primaryKey;
    private List<Optional<Object>> information;
}

