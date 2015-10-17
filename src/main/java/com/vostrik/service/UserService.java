package com.vostrik.service;

import com.vostrik.db.bean.User;

import java.util.List;
import java.util.Map;

/**
 * Created by alex on 09.07.15.
 */
public interface UserService {

    String generateShortUrl(String longUrl);

    String getLongUrl(String shortUrl);

    List<Map<String, Object>> getLinksList();

    User getUserByUserName(String userName);
}
