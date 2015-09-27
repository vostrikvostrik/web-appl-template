package com.vostrik.db.bean;


import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;


/**
 * Created by EVostrikova on 09.07.15.
 */

@Entity
@Table(name="VOSTRIK_USER")
public class User {

    @Id
    @Column(name = "USER_ID")
    @GeneratedValue
    private Long userId;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "USER_GROUP_ID")
    private Integer userGroupId;

    @Column(name = "USER_PASSWORD")
    private String userPassword;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
