package DAL;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * This is a object which manages the interaction with the db adn the product
 * This is capable of being injected as a dependency as it interfaces with IProduct
 * @author Stuart
 */
public class Product implements IProduct
{    
        private SessionFactory sessionFactory;
    
        @Autowired 
        public void setSessionFactory(SessionFactory sessionFactory) {
            this.sessionFactory = sessionFactory;
        }
    
        /***
         * Gets all products
         * @return
         * @throws Exception 
         */
        @Transactional
	@SuppressWarnings("unchecked")
	public ArrayList<DAL.DEL.Product> getAllProducts() throws Exception
	{
		ArrayList<DAL.DEL.Product> products = new ArrayList<DAL.DEL.Product>();
		Session session = sessionFactory.getCurrentSession();		
                products = (ArrayList<DAL.DEL.Product>) session.createQuery("from Product").list();                	
		return products;
	}
        @Transactional
	public void addProduct(DAL.DEL.Product product) throws Exception 
        {		
            Session session = sessionFactory.getCurrentSession();		
            session.save(product);
	
	}
        @Transactional
	public void deleteProductByID(String productID) throws Exception 
        {
		Session session = sessionFactory.getCurrentSession();
		session.createQuery(String.format("delete from Product where id = %s",productID)).executeUpdate();				
	}
}