package com.vostrik.service.impl;

import com.vostrik.db.bean.MemberNote;
import com.vostrik.db.dao.BaseDao;
import com.vostrik.service.MemberNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * User: User
 * Date: 29.08.15
 * Time: 23:39
 */
@Service
public class MemberNoteServiceImpl implements MemberNoteService {

    @Autowired
    private BaseDao baseDao;

    @Transactional
    @Override
    public List<Map<String, Object>> getNotesList() {
        return baseDao.getNotesList();
    }

    @Transactional
    @Override
    public List<MemberNote> getNotesListAsObject() {
        return baseDao.getNotesListAsObject();
    }
}
