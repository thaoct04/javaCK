/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.util.ArrayList;

/**
 *
 * @author Thuan Thao
 */
public class ArrayPet {
    ArrayList<Pet> list;
    public ArrayPet(){
        list = new ArrayList<>();
    }
    
    
    public void add(Pet e){
      this.list.add(e);
    }
    
  public  ArrayList name(){
      return this.list;
  }

    @Override
    public String toString() {
        return "ArrayPet{" + "list=" + list + '}';
    }
    
    
            public void delete1Element(int id){
                
                for(Pet pet : list){
                    int id2 = pet.getId();
                    if(id2==id){
                        list.remove(pet);
                   
                    } else {
                        
                    }
                }
            }
    public void update(Pet pet3){
        for(Pet pet : list){
            if(pet.getId() == pet3.getId()){
                pet.setName(pet3.getName());
                pet.setAge(pet3.getAge());
                pet.setCost(pet3.getCost());
                pet.setDate(pet3.getDate());
                pet.setSex(pet3.getSex());
            }
        }
    }
    
}
