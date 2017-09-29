/**
 * 
 */
package DAL;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;



/**
 * This represents the data access layer User class.
 * Its primary objective is to interface with the data entity later and construct BOLO objects for the BOL layer.
 * This is capable of being injected as a dependency as it interfaces with IUser
 */
public class User implements IUser
{
        private SessionFactory sessionFactory;
        @Autowired
        public void setSessionFactory( SessionFactory sessionFactory)
        {
            this.sessionFactory = sessionFactory;
        }
	/**
	 * Creates a user
	 * @param username
	 * @param password
	 * @return BOLO.User
	 * @throws Exception if cannot persist user to the database
	 */
        @Transactional 
	public  BOLO.User createUser(String username, String password) throws Exception
	{
		DAL.DEL.User del_user = new DAL.DEL.User();
		del_user.setUsername(username);
		del_user.setPassword(password);
		
		Session session = sessionFactory.getCurrentSession();		
		session.persist(del_user);
				
		String query = String.format("from User where username = '%s' and password = '%s'", username, password);
		List results = session.createQuery(query).list();
		
		
		for( DAL.DEL.User result_user : (List<DAL.DEL.User>)results)
		{
			BOLO.User bol_user = new BOLO.User();
				bol_user.setName(result_user.getUsername());
				bol_user.setPassword(result_user.getPassword());
				return bol_user;
		}
		throw new Exception("Could not persist user.");
		
	}
        
	@Transactional 
	public  DAL.DEL.User retrieve(String username, String password) throws Exception
	{
		Session session = sessionFactory.getCurrentSession();
		
		String query = String.format("from User where username = '%s' and password = '%s'",username,password);
		List<?> results = session.createQuery(query).list();
		
		for( DAL.DEL.User user : (List<DAL.DEL.User>)results){			
			return user;
		}
		return null;
		
	}
        
        @Transactional 
	public  boolean exists(String username, String password) throws Exception
	{
		Session session = sessionFactory.getCurrentSession();
                
		String query = String.format("from User where username = '%s' and password = '%s'",username,password);
		List results = session.createQuery(query).list();
				
		if( !results.isEmpty() ) 
			return true;
		else
			return false;
	}
        
        @Transactional 
	public  BOLO.User getUser(String username, String password) throws HibernateException, Exception 
        {		
            Session session = sessionFactory.getCurrentSession();

            String query = String.format("from User where username = '%s' and password = '%s'",username,password);
            List<?> results = session.createQuery(query).list();

            for( DAL.DEL.User user : (List<DAL.DEL.User>)results){
                    BOLO.User bol_user = new BOLO.User();
                    bol_user.setPassword(user.getPassword());
                    bol_user.setName(user.getUsername());
                    return bol_user;
            }		
            return null;
		
	}
        @Transactional 
	public  ArrayList<DAL.DEL.User> getAllUsers() throws Exception
	{
            ArrayList<DAL.DEL.User> users = new ArrayList<DAL.DEL.User>();
            Session session = sessionFactory.getCurrentSession();
            users =(ArrayList<DAL.DEL.User>) session.createQuery("from User").list();

            return users;
		
	}
        @Transactional 
	public void deleteUser(String username) throws Exception 
        {
		Session session = sessionFactory.getCurrentSession();				
                session.createQuery(String.format("delete from User where username = '%s'", username)).executeUpdate();                
	}
}
