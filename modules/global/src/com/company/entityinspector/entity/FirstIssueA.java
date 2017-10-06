package com.company.entityinspector.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import java.util.List;
import javax.persistence.OneToMany;

@Table(name = "ENTITYINSPECTOR_FIRST_ISSUE_A")
@Entity(name = "entityinspector$FirstIssueA")
public class FirstIssueA extends StandardEntity {
    private static final long serialVersionUID = 6715802917988965287L;

    @OneToMany(mappedBy = "firstIssueA")
    protected List<FirstIssueB> firstIssueBList;

    public void setFirstIssueBList(List<FirstIssueB> firstIssueBList) {
        this.firstIssueBList = firstIssueBList;
    }

    public List<FirstIssueB> getFirstIssueBList() {
        return firstIssueBList;
    }

}