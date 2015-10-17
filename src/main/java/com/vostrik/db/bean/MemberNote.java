package com.vostrik.db.bean;

import javax.persistence.*;
import java.util.Date;

/**
 * User: User
 * Date: 29.08.15
 * Time: 23:37
 */
@Entity
@Table(name="VOSTRIK_MEMBER_NOTE")
public class MemberNote {

    @Id
    @Column(name = "NOTE_ID")
    @GeneratedValue
    private Long noteId;

    @Column(name = "NOTE_TEXT")
    private String noteText;

    @Column(name = "NOTE_DATE")
    private Date noteDate;

    @Column(name = "NOTE_MEMBER_ID")
    private Long noteMemberId;

    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    public Date getNoteDate() {
        return noteDate;
    }

    public void setNoteDate(Date noteDate) {
        this.noteDate = noteDate;
    }

    public Long getNoteMemberId() {
        return noteMemberId;
    }

    public void setNoteMemberId(Long noteMemberId) {
        this.noteMemberId = noteMemberId;
    }
}
