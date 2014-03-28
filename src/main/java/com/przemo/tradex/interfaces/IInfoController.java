/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.przemo.tradex.interfaces;

import java.rmi.Remote;
import java.util.List;
import java.util.Set;
import com.przemo.tradex.data.*;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author Przemo
 */
public interface IInfoController extends Remote{
    
    static final String infoController_ID = "InfoController";
    static final String[] editUserParamsNames = {"password"};
    //The type of the elements in the list need to be changed to some kind of Data objects held by the DB.
    //Until we haven't mapped the DB objects to classes, we will mark this as a generic Object
    //TODO: use ORM class instead of Object
    List<Transactions> requestTransactions(Date dateFrom, Date dateTo, String sessionId) throws RemoteException;
    
    Set<Equities> requestAvailableInstruments(String sessionId) throws RemoteException;
    
    /**
     * Get quotation of the instrument at given date. If no date is given, the most current quotation is returned
     * @param date
     * @param instrument
     * @param sessionId
     * @return 
     */
    Equities requestQuotation(Date date, com.przemo.tradex.data.Equities instrument, String sessionId) throws RemoteException;
    
    /**
     * Requests activity information, like login, logout ipaddress, etc.
     * @param dateFrom date from which the history should be taken
     * @param dateTo date to which the history should be taken
     * @param SessionId session id
     * @return list of records of activity
     */
    List<UserSessions> requestActivity(Date dateFrom, Date Date, String SessionId) throws RemoteException;
    
    /**
     * Get time ranged data on the given equity
     * @param dateFrom date from which the history should be taken
     * @param dateTo date to which the history should be taken, if null given - data will be taken until now
     * @param equityId id of the instrument
     * @param sessionId session id
     * @return information of price changes and ranges
     */
    List<EquitiesPriceHistory> requestTimeRangeData(Date dateFrom, Date Date, Equities equityId, String sessionId) throws RemoteException;
    
    /**
     * Requests information about the account
     * @param sessionId session id
     * @return object representing information about the current state of an account associated with the given session id
     */
    List<Accounts> requestAccountInfo(String sessionId) throws RemoteException;
    
    /**
     * Requests available equitiess types
     * @return 
     */
    List<EquitiesTypes> requestCurrentEquitiesTypes() throws RemoteException;
   
    
    List<OrderTypes> requestAvailableOrderTypes() throws RemoteException;
    
    /**
     * Edit user data. Make sure that the name of the user cannot be changed.
     * @param sessionId
     * @param userData
     * @return 
     */
    boolean requestEditUserData(String sessionId, Map<String, Object> userData) throws RemoteException;
}
