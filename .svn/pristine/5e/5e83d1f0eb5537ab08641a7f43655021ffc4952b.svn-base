/**
 * Represents the User service administration layer
 */
package BSL;

import BOL.IServiceAuthoriser;
import DAL.IUser;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author stuart
 * This manages access to the Admin Service
 */
public class UserAdmin implements IUserAdmin
{
        @Autowired
        private IServiceAuthoriser serviceAuthoriser;  
        @Autowired
        private IUser userDAO;
	/***
	 * Creates a new user
	 * @param token the token that represents your authenticated status
	 * @param username the intended name of the new user to be created.
	 */
	public BOLO.User createUser( String token, String username, String password) throws Exception
	{		
		
		serviceAuthoriser.authorise(token);//authorise provided token
		
		return userDAO.createUser(username, password);
		
	}

   
		
}
