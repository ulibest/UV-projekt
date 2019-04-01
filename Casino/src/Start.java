/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erazem
 */

import login.Login;
public class Start {
    public static void main(String[] args) {
        Login login = new Login();
        login.view();
        System.out.println(System.getProperty("user.dir"));
    }
}
