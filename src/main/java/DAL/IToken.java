/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.ArrayList;

/**
 *
 * @author Stuart
 */
public interface IToken {
    public void storeToken(BOLO.Token token, String username, String password ) throws Exception;
    public BOLO.Token getToken(String token) throws Exception;
    public void cleanOldUserTokens(String token) throws Exception;
    public ArrayList<DAL.DEL.Token> GetAllTokens() throws Exception;
    
}
