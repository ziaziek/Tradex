/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.przemo.tradex.interfaces;

import com.przemo.tradex.data.Equities;
import com.przemo.tradex.data.OrderTypes;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Przemo
 */
public interface IOrdersController extends Remote {
    
    static final String ordersController_ID="OrdersController";
    
    //TODO: change the int to Symbol (Equity), and int to OrderType
    long placeOrder(Equities equityId, double amount, Date dateValid, OrderTypes orderType, String sessionId) throws RemoteException;
    
    int removeOrder(long orderId, String sessionId) throws RemoteException;
    
}
