/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Lenovo
 */
public class updateControllerT {
    public void updateT(String tid, String name, String address, String birthday){
       
        new Model.updateDataT().updateTT(tid, name, address, birthday);
    }
}
