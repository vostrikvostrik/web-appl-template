package com.vostrik.db.bean;

import javax.persistence.*;

/**
 * Created by EVostrikova on 13.08.15.
 */

@Entity
@Table(name="VOSTRIK_SHORT_LINKS")
public class ShortLinkBean {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Long linkId;

    @Column(name = "SHORT_LINK")
    private String shortLink;

    @Column(name = "LONG_LINK")
    private String longLink;

    public Long getLinkId() {
        return linkId;
    }

    public void setLinkId(Long linkId) {
        this.linkId = linkId;
    }

    public String getShortLink() {
        return shortLink;
    }

    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }

    public String getLongLink() {
        return longLink;
    }

    public void setLongLink(String longLink) {
        this.longLink = longLink;
    }
}
