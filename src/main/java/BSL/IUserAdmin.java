/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BSL;

/**
 *
 * @author Stuart
 */
public interface IUserAdmin 
{
    public BOLO.User createUser( String token, String username, String password) throws Exception;
}
