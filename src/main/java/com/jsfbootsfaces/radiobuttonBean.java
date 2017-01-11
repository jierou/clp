/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsfbootsfaces;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import net.bootsfaces.utils.FacesMessages;

/**
 *
 * @author jessie
 */
@RequestScoped
@ManagedBean
public class radiobuttonBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private Map<String, String> bands = new HashMap<String, String>();
    private Map<String, String> question = new HashMap<String, String>();

    public Map<String, String> getQuestion() {
        return question;
    }

    public void setQuestion(Map<String, String> question) {
        this.question = question;
    }
    
    
 
    public radiobuttonBean() {
        getBands().put("Arch Enemy", "melodic death metal");
        getBands().put("Blind Guardian", "speed metal");
        getBands().put("Fields of the Nephilim", "gothic metal");
        getBands().put("Led Zeppelin", "rock");
    }
//    public void submitBand() {
//        if (favoriteBand == null || favoriteBand.equals("")) {
//            FacesMessages.warning("@property(radiobuttonBean.favoriteBand)", "", "You seem to be a bit indecisive.");
//        } else {
//            FacesMessages.info("@property(radiobuttonBean.favoriteBand)", "", "So you like " + favoriteBand + ".");
//        }
//    }
    public Map<String, String> getBands() {
        return bands;
    }
 
    public void setBands(Map<String, String> bands) {
        this.bands = bands;
    }
 
//    public String getFavoriteBand() {
//        return favoriteBand;
//    }
// 
//    public void setFavoriteBand(String favoriteBand) {
//        this.favoriteBand = favoriteBand;
//    }
}
