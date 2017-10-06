package com.company.entityinspector.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.cuba.security.entity.User;

@Table(name = "ENTITYINSPECTOR_FIRST_ISSUE_B")
@Entity(name = "entityinspector$FirstIssueB")
public class FirstIssueB extends StandardEntity {
    private static final long serialVersionUID = -2961603188200706420L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FIRST_ISSUE_A_ID")
    protected FirstIssueA firstIssueA;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    protected User user;


    public void setFirstIssueA(FirstIssueA firstIssueA) {
        this.firstIssueA = firstIssueA;
    }

    public FirstIssueA getFirstIssueA() {
        return firstIssueA;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
    
    @MetaProperty(related = "user")
    public String getUserName() {
        return user != null ? user.getName() : null;
    }

}