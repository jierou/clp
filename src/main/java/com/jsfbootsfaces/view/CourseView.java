/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsfbootsfaces.view;

import java.io.Serializable;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author sharon
 */
@Named
@ViewScoped
public class CourseView implements Serializable {
    private static final long serialVersionUID = -430104903141720839L;
    
    private List<Course> dataList;
     
    public void init() {
        dataList.add(new Course(1, "防盜", "防盜Description"));
        dataList.add(new Course(2, "火災", "火災Description"));
    }
    public List<Course> getDataList() {
        return dataList;
    }
    
    class Course {
        
        Integer id;
        String name;
        String description;
        
        public Course(Integer id, String name, String description) {
            this.id = id;
            this.name = name;
            this.description = description;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
    
}
