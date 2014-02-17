/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.przemo.tradex.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Calendar;

/**
 *
 * @author Przemo
 */
public interface IOrdersController extends Remote {
    
    static final String ordersController_ID="OrdersController";
    
    //TODO: change the int to Symbol (Equity), and int to OrderType
    int placeOrder(int equityId, double amount, Calendar dateValid, int orderType, String sessionId) throws RemoteException;
    
    int removeOrder(int orderId, String sessionId) throws RemoteException;
    
}
