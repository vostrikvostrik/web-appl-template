package com.vostrik.db.dao;


import java.util.List;
import java.util.Map;

/**
 * Created by EVostrikova on 09.07.15.
 */
public interface BaseDao {


    String generateShortLink(String LongUrl);

    String getLongUrl(String shortUrl);

    List<Map<String, Object>> getLinksList ();

    List<Map<String, Object>> getNotesList ();

}
