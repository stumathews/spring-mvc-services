package com.stuartmathews.controllers;
 
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UrlPathHelper;

 
@Controller
@RequestMapping( value="/navigation" )
public class NavigationController 
{		
	/***
         * Creates the source of the links that will appear in the navigation
         * menu on the left. This is made to be dynamic so that as new ones are
         * needed, they can be added from here or pulled from the db.
         * @param model
         * @param request
         * @return the view which is the navigation menu
         * @throws Exception 
         */
        @RequestMapping(value = "NavMenu", method = RequestMethod.GET)
	public String getNavMenu(ModelMap model, HttpServletRequest request  ) throws Exception
	{	
            Map<String,Map<String,String>> stacks = new HashMap<String,Map<String,String>>();
            Map<String,String> reviews = new HashMap<String,String>();
            Map<String,String> reputations = new HashMap<String,String>();
            Map<String,String> recommendations = new HashMap<String,String>();
            Map<String,String> users = new HashMap<String,String>();
            
            recommendations.put ("View latest recommednation", "#");
            recommendations.put ("Make a recommendation", "#");            
            reputations.put     ("View hiest reputations", "#");
            reputations.put     ("Find a reputation", "#");            
            reviews.put         ("Show reviews", "products/list");            
            users.put           ("Show users", "user/list");
            
            
            stacks.put("recommendations", recommendations);
            stacks.put("reputations", reputations);
            stacks.put("reviews", reviews);
            stacks.put("users", users);
            
            model.addAttribute("stacks",stacks);
            // Get the current URL
            model.addAttribute("current_url", new UrlPathHelper().getOriginatingRequestUri(request));             
            return "NavMenu"; 
	}
        
        /***
         * Creates the source of all the links that will appear on the teop menu.
         * @param model
         * @param request
         * @return the view which is the top menu
         * @throws Exception 
         */
	@RequestMapping(value="TopMenu", method = RequestMethod.GET)
	public String getTopMenu(ModelMap model, HttpServletRequest request ) throws Exception
	{	
            Map<String,String> links = new HashMap<String,String>();
            /* Links are all relative to '/' ie they are not absolute as in http://server/app*/
            links.put("home", "");
            links.put("about", "about");
            links.put("welcome", "welcome"); 
            model.addAttribute("productName", "Recommendations, Reputations and Reviews");            
            model.addAttribute("links",links);
            // Get the current URL
            model.addAttribute("current_url", new UrlPathHelper().getOriginatingRequestUri(request));
            return "TopMenu"; 
	}        
}