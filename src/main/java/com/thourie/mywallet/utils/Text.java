/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thourie.mywallet.utils;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author thourie
 */
public final class Text {

    private static final Map<String, String> data = new HashMap<>();

    public static String get(String key){
        return data.get(key);
    }    
    
    public static String[] getMoths(){
        String[] months = new String[12];
        months[0] = data.get("JANUARY");
        months[1] = data.get("FEBRUARY"); 
        months[2] = data.get("MARCH"); 
        months[3] = data.get("APRIL"); 
        months[4] = data.get("MAY"); 
        months[5] = data.get("JUNE"); 
        months[6] = data.get("JULE"); 
        months[7] = data.get("AUGUST"); 
        months[8] = data.get("SEPTEMBER"); 
        months[9] = data.get("OCTOBER"); 
        months[10] = data.get("NOVEMBER"); 
        months[11] = data.get("DECEMBER"); 
        return months;
    }
    
    public static void init() {
        data.put("PROGRAM_NAME", "myWallet");
        data.put("MENU_FILE", "File");
        data.put("MENU_EDIT", "Edit");
        data.put("MENU_VIEW", "View");
        data.put("MENU_HELP", "Help");
        
        data.put("JANUARY", "January");
        data.put("FEBRUARY", "February");
        data.put("MARCH", "March");
        data.put("APRIL", "April");
        data.put("MAY", "May");
        data.put("JUNE", "June");
        data.put("JULE", "Jule");
        data.put("AUGUST", "August");
        data.put("SEPTEMBER", "September");
        data.put("OCTOBER", "October");
        data.put("NOVEMBER", "November");
        data.put("DECEMBER", "Desember");

    }
    
    
}
