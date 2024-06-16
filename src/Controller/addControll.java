/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Tharapathi
 */
public class addControll {
    public void studentdetails2(String tid, String name,String address,String birthday,String gender){
        new Model.addModell().addDetails(tid,name,address,birthday,gender);
    }
    
}
