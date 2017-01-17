/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsfbootsfaces.view;

/**
 *
 * @author sharon
 */
public class Subject {
    
    Integer id;
    String subjectGroup;
    String subject;

    public Subject(int id, String subjectGroup, String subject) {
        this.id = id;
        this.subjectGroup = subjectGroup;
        this.subject = subject;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubjectGroup() {
        return subjectGroup;
    }

    public void setSubjectGroup(String subjectGroup) {
        this.subjectGroup = subjectGroup;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
