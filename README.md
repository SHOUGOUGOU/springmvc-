# springmvc-
## 启动方式     
四种都可以   
1.Application.java 右键 run 或者debug   
2.maven任务窗口 maven plugin --> spring boot:run   
3.打成war包， java -jar   xxx.war   
4.打成jar包， java -jar   xxx.jar   

## 注解配置  
1.Application.java  项目入口,替代Application.xml,@Import注解引入2中mvc配置   
2.AppConfig.java  mvc配置，替代web.xml,包括页面配置，拦截器配置等   


