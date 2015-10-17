package com.vostrik.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.vostrik.db.bean.User;
import com.vostrik.db.dao.BaseDao;
import com.vostrik.service.UserService;

import java.util.List;
import java.util.Map;


/**
 * Created by alex on 09.07.15.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private BaseDao baseDao;

    @Transactional
    public String generateShortUrl(String longUrl) {
        return baseDao.generateShortLink(longUrl);
    }

    @Transactional
    public String getLongUrl(String shortUrl) {
        return baseDao.getLongUrl(shortUrl);
    }

    @Transactional
    public List<Map<String, Object>> getLinksList() {
        return baseDao.getLinksList();
    }

    @Override
    public User getUserByUserName(String userName) {
        return baseDao.getUserByLogin(userName);
    }

}
