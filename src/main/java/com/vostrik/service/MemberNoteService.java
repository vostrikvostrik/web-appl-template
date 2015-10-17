package com.vostrik.service;

import com.vostrik.db.bean.MemberNote;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * User: User
 * Date: 29.08.15
 * Time: 23:39
 */
public interface MemberNoteService {
    List<Map<String, Object>> getNotesList();

    @Transactional
    List<MemberNote> getNotesListAsObject();
}
