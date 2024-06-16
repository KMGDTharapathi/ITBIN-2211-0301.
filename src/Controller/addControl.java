/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Tharapathi
 */
public class addControl {
    
    public void studentdetails(String id, String name,String address,String birthday,String gender){
        new Model.addModel().addDetails(id,name,address,birthday,gender);
    }
    
}
