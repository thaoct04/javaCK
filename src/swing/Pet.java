/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;

/**
 *
 * @author Thuan Thao
 */
public class Pet  implements Serializable
            {
     private static final long serialVersionUID = 1L;
    String name;
    int age;
    String sex;
    int id;
    String Date;
    int cost;

    public Pet(String name, int age, String sex, int id, String Date, int cost) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.id = id;
        this.Date = Date;
        this.cost = cost;
    }

    public Pet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Pet{" + "name=" + name + ", age=" + age + ", sex=" + sex + ", id=" + id + ", Date=" + Date + ", cost=" + cost + '}';
    }
    
}
