/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Przemo
 */
public class SessionBrokeException extends Exception {
    
    protected String message = "Session is broken. Check connection or try to log in";
    
    public SessionBrokeException(){
        
    }
    
    @Override
    public String getMessage(){
        return message;
    }
}
