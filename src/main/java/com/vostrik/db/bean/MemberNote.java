package com.vostrik.db.bean;

import javax.persistence.*;

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
    private Long noteText;

    @Column(name = "NOTE_DATE")
    private Long noteDate;

    @Column(name = "NOTE_MEMBER_ID")
    private Long noteMemberId;
}
