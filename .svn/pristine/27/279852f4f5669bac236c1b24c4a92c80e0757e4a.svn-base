/**
 * 
 */
package BOL;

import DAL.IToken;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author stuart
 *
 */
public class ServiceAuthoriser implements IServiceAuthoriser
{
        private static IToken tokenDAO;
        
        @Autowired
        public void setTokenDAO(IToken tokenDAO )
        {
            this.tokenDAO = tokenDAO;
        }
	/***
	 * Verify that the token is correct
	 * @param token from the client
	 * @return true if the token exist in the db.
	 */
	public void authorise(String token) throws Exception
	{
            try
            {	
                    // Try and get token from the database				
                    BOLO.Token bolo_token = tokenDAO.getToken(token);			
                    if( BOL.Token.isValid(bolo_token) == false){				
                            throw new Exception("Token is outdated. Re-authenticate.");
                    }
            }
            catch( Exception error)
            {
                    throw new Exception( String.format("Unable to Authenticate due to %s", error.getMessage()));				
            }
		
	}
}
