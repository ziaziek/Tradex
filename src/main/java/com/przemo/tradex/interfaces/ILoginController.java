/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.przemo.tradex.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Przemo
 */
public interface ILoginController extends Remote {
    
    final String loginController_ID = "LoginController";
    
    String loginRequest(String username, String password, String ipaddress) throws RemoteException;
    
    boolean logoutRequest(String sessionId) throws RemoteException;
}
