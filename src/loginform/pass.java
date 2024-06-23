/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginform;

import java.security.MessageDigest;
import java.util.Base64;

/**
 *
 * @author Thuan Thao
 */
public class pass {
    String nameUser;
    String pass;

    public pass(String nameUser, String pass) {
        this.nameUser = nameUser;
        this.pass = pass;
    }

    public pass() {
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "pass{" + "nameUser=" + nameUser + ", pass=" + pass + '}';
    }
    
   
}
