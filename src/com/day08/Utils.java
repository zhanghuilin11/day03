package com.day08;

public class Utils {
    public static boolean isEmpty(String s){
        boolean flag = false;
        if(s != null && !s.equals("")){
            flag = true;
        }
        return flag;
    }
}
