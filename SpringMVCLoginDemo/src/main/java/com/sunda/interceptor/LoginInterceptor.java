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
//	        //�����·��  
//	        String contextPath=request.getContextPath();  
//	        String  url=request.getServletPath().toString();  
//	        HttpSession session = request.getSession();  
//	        String user = (String) session.getAttribute("username");  
//	        //������Ը���session���û����жϽ�ɫ��Ȩ�ޣ�����Ȩ�����ض���ͬ��ҳ�棬�����������ֻ������һ���ض���  
//	        if (user==null) {  
//	            //�����أ��ض���login����  
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
          System.out.println("��δ��¼��������¼ҳ��");
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