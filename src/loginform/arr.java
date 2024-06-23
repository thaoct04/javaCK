/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginform;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;

/**
 *
 * @author Thuan Thao
 */
public class arr {
    ArrayList<pass>list;

    public arr() {
        list = new ArrayList<>();
    }
    public void add(pass e){
        list.add(e);
    }
     public static String toSHAI(String str){
        String salt = "addjfikflflf;ohyii";
        String result = null;
        str = salt+str;
        try {
            byte[] databyes = str.getBytes("UTF-8");
            
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            result = Base64.getEncoder().encodeToString(md.digest(databyes));
             System.out.println(result);
            
       
        } catch (Exception e) {
        }
        return result;
 
        
    }
}
