package com.vostrik.db.dao.impl;

import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.vostrik.db.bean.ShortLinkBean;
import com.vostrik.db.dao.BaseDao;

import org.hibernate.Query;

import java.util.List;
import java.util.Map;

/**
 * Created by EVostrikova on 09.07.15.
 */
@Repository
public class BaseDaoImpl implements BaseDao {

    final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public String generateShortLink(String longUrl) {
        ShortLinkBean linkBean = new ShortLinkBean();
        linkBean.setLongLink(longUrl);
        sessionFactory.openSession().save(linkBean);
        sessionFactory.getCurrentSession().refresh(linkBean);
        return linkBean.getShortLink();
    }

    @Override
    public String getLongUrl(String shortUrl) {
        Query query = sessionFactory.getCurrentSession().createQuery("select longLink from ShortLinkBean where shortLink = :shortUrl");
        query.setParameter("shortUrl", shortUrl);
        return (String) query.uniqueResult();
    }

    @Override
         public List<Map<String, Object>> getLinksList () {
        Query query = sessionFactory.getCurrentSession().createQuery("" +
                "select shortLink as shortUrl, longLink as longUrl from ShortLinkBean")
                .setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
        List<Map<String, Object>> resultList = query.list();
        return resultList;
    }

    @Override
    public List<Map<String, Object>> getNotesList () {
        Query query = sessionFactory.getCurrentSession().createQuery("" +
                "select noteId, noteText, noteDate, noteMemberId from MemberNote")
                .setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
        List<Map<String, Object>> resultList = query.list();
        return resultList;
    }
}
