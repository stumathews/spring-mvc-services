/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.ArrayList;
import org.hibernate.HibernateException;

/**
 *
 * @author Stuart
 */
public interface IUser 
{
    public BOLO.User createUser(String username, String password) throws Exception;
    public DAL.DEL.User retrieve(String username, String password) throws Exception;
    public boolean exists(String username, String password) throws Exception;
    public BOLO.User getUser(String username, String password) throws HibernateException, Exception;
    public ArrayList<DAL.DEL.User> getAllUsers() throws Exception;
    public void deleteUser(String username) throws Exception;
    
}
