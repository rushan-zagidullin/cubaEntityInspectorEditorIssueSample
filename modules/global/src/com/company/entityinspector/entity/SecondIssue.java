package com.company.entityinspector.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.security.entity.Group;
import com.haulmont.cuba.security.entity.User;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "ENTITYINSPECTOR_SECOND_ISSUE")
@Entity(name = "entityinspector$SecondIssue")
public class SecondIssue extends StandardEntity {
    private static final long serialVersionUID = -1745629644999800680L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    protected User user;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    @MetaProperty(related = "user")
    public Group getUserGroup() {
        return user != null ? user.getGroup() : null;
    }
}