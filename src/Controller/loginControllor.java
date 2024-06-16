/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.loginDetails;

/**
 *
 * @author Lenovo
 */
public class loginControllor {
    
    public boolean validateLogin(String userName, String password) {
        loginDetails details = new loginDetails();
        return details.check(userName, password);
    }
}
