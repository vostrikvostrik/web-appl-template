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

    @Id
    @Column(name = "NOTE_TEXT")
    @GeneratedValue
    private Long noteText;

    @Id
    @Column(name = "NOTE_DATE")
    @GeneratedValue
    private Long noteDate;

    @Id
    @Column(name = "NOTE_MEMBER_ID")
    @GeneratedValue
    private Long noteMemberId;
}
