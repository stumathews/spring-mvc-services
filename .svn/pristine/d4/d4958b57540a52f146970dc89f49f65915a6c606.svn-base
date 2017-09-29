/**
 * This service is responsible for authenticating users
 */
package BSL;


import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author stuart
 *
 */
public class LoginAdmin implements ILoginAdmin
{
    
	/***
	 * Authenticate credentials against database
	 * @param username the username
	 * @param password the password
	 * @return a token that can be used in subsequent web service calls
	 * @throws Exception when credentials are invalid
	 */
	public String authenticate( String username, String password) throws Exception
	{		
            // No need to check permissions to access this service. everyone should be able to at least has to try to authenticate.
            {                   
                    return BOL.Authentication.authenticate(username, password);
            }
	}
}
