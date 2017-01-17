/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsfbootsfaces.view;

import java.io.Serializable;
import java.util.ArrayList;
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
        
    }
    public List<Course> getDataList() {
        dataList = new ArrayList();
        dataList.add(new Course(1, "防盜", "防盜Description"));
        dataList.add(new Course(2, "火災", "火災Description"));
        System.out.println("CourseView dataList.size = " + dataList.size());
        return dataList;
    }
    
}
