package BOL;

import DAL.IUser;
import org.springframework.beans.factory.annotation.Autowired;


public class User 
{
        private static IUser userDAO;
        @Autowired
        public void setUserDAO( IUser userDAO)
        {
            this.userDAO = userDAO;
        }
	/***
	 * Creates a user and returns it, represented as a BOLO object
	 * @param username
	 * @return BOLO object that represents the created user
	 * @exception If error occured accessing the database.
	 */
	public static BOLO.User createUser(String username, String password) throws Exception
	{		
		if(!userDAO.exists(username, password))
			return userDAO.createUser(username, password);	
		else
			return userDAO.getUser(username, password);
	}
	

}
