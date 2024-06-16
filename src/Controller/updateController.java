/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Lenovo
 */
public class updateController {
    
    public void updatee(String id, String name, String address, String birthday){
       
        new Model.updateData().update(id, name, address, birthday);
    }
}
