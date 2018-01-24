package sunda.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import sunda.logindemo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginInterceptor implements HandlerInterceptor {
 

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
          Object handler) throws Exception {
	  User user = (User) request.getSession().getAttribute("user");
      if (user.getUsername() == null) {
          System.out.println("尚未登录，调到登录页面");
          request.getRequestDispatcher("/").forward(request,response);
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