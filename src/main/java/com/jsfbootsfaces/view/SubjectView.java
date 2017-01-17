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
public class SubjectView implements Serializable {
    
    private static final long serialVersionUID = -430104903141720839L;
    
    private List<Subject> dataList;
    
   public List<Subject> getDataList() {
        dataList = new ArrayList();
        dataList.add(new Subject(1, "防災/防災A/level_1/group_1", "預防火災"));
        dataList.add(new Subject(1, "防災/防災A/level_1/group_1", "火災緊急處理"));
        return dataList;
    }
    
}
