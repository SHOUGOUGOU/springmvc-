package com.sunda.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


 
public class LoginInterceptor implements HandlerInterceptor {
 
//	
//	 public boolean preHandle(HttpServletRequest request, HttpServletResponse response,  
//	            Object handler) throws Exception {  
//	        //请求的路径  
//	        String contextPath=request.getContextPath();  
//	        String  url=request.getServletPath().toString();  
//	        HttpSession session = request.getSession();  
//	        String user = (String) session.getAttribute("username");  
//	        //这里可以根据session的用户来判断角色的权限，根据权限来重定向不同的页面，简单起见，这里只是做了一个重定向  
//	        if (user==null) {  
//	            //被拦截，重定向到login界面  
//	        	request.getRequestDispatcher("").forward(request,response);
//	            return false;  
//	        }  
//	        return true; 
//	 }
	
  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response,  
          Object handler) throws Exception {  
	  Object user = request.getSession().getAttribute("username");
      if (user == null) {
          System.out.println("尚未登录，调到登录页面");
          request.getRequestDispatcher("").forward(request,response);
          return false;
      }
      
      else
       {return true;} 
  }
  
  
  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    System.out.println("postHandle");
  }
 
  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    System.out.println("afterCompletion");
  }
 
}