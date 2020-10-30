## Log from the application deployment

```
20-Oct-2020 11:30:07.887 INFO [main] org.apache.coyote.AbstractProtocol.init Initializing ProtocolHandler ["http-nio-8080"]
20-Oct-2020 11:30:07.921 INFO [main] org.apache.catalina.startup.Catalina.load Server initialization in [602] milliseconds
20-Oct-2020 11:30:07.963 INFO [main] org.apache.catalina.core.StandardService.startInternal Starting service [Catalina]
20-Oct-2020 11:30:07.963 INFO [main] org.apache.catalina.core.StandardEngine.startInternal Starting Servlet engine: [Apache Tomcat/9.0.39]
20-Oct-2020 11:30:07.977 INFO [main] org.apache.catalina.startup.HostConfig.deployDirectory Deploying web application directory [/Users/eduardosantos/Downloads/apache-tomcat-9.0.39/webapps/docs]
20-Oct-2020 11:30:08.231 INFO [main] org.apache.catalina.startup.HostConfig.deployDirectory Deployment of web application directory [/Users/eduardosantos/Downloads/apache-tomcat-9.0.39/webapps/docs] has finished in [254] ms
20-Oct-2020 11:30:08.231 INFO [main] org.apache.catalina.startup.HostConfig.deployDirectory Deploying web application directory [/Users/eduardosantos/Downloads/apache-tomcat-9.0.39/webapps/manager]
20-Oct-2020 11:30:08.277 INFO [main] org.apache.catalina.startup.HostConfig.deployDirectory Deployment of web application directory [/Users/eduardosantos/Downloads/apache-tomcat-9.0.39/webapps/manager] has finished in [45] ms
20-Oct-2020 11:30:08.280 INFO [main] org.apache.catalina.startup.HostConfig.deployDirectory Deploying web application directory [/Users/eduardosantos/Downloads/apache-tomcat-9.0.39/webapps/examples]
20-Oct-2020 11:30:08.616 INFO [main] org.apache.catalina.startup.HostConfig.deployDirectory Deployment of web application directory [/Users/eduardosantos/Downloads/apache-tomcat-9.0.39/webapps/examples] has finished in [335] ms
20-Oct-2020 11:30:08.616 INFO [main] org.apache.catalina.startup.HostConfig.deployDirectory Deploying web application directory [/Users/eduardosantos/Downloads/apache-tomcat-9.0.39/webapps/ROOT]
20-Oct-2020 11:30:08.642 INFO [main] org.apache.catalina.startup.HostConfig.deployDirectory Deployment of web application directory [/Users/eduardosantos/Downloads/apache-tomcat-9.0.39/webapps/ROOT] has finished in [26] ms
20-Oct-2020 11:30:08.643 INFO [main] org.apache.catalina.startup.HostConfig.deployDirectory Deploying web application directory [/Users/eduardosantos/Downloads/apache-tomcat-9.0.39/webapps/host-manager]
20-Oct-2020 11:30:08.664 INFO [main] org.apache.catalina.startup.HostConfig.deployDirectory Deployment of web application directory [/Users/eduardosantos/Downloads/apache-tomcat-9.0.39/webapps/host-manager] has finished in [21] ms
20-Oct-2020 11:30:08.669 INFO [main] org.apache.coyote.AbstractProtocol.start Starting ProtocolHandler ["http-nio-8080"]
20-Oct-2020 11:30:08.675 INFO [main] org.apache.catalina.startup.Catalina.start Server startup in [753] milliseconds
20-Oct-2020 11:45:42.200 INFO [http-nio-8080-exec-6] org.apache.catalina.startup.HostConfig.deployWAR Deploying web application archive [/Users/eduardosantos/Downloads/apache-tomcat-9.0.39/webapps/webapp-javaee7.war]
20-Oct-2020 11:45:42.251 INFO [http-nio-8080-exec-6] org.apache.catalina.startup.HostConfig.deployWAR Deployment of web application archive [/Users/eduardosantos/Downloads/apache-tomcat-9.0.39/webapps/webapp-javaee7.war] has finished in [51] ms
```
## What are the responsibilities/services of a “servlet container”?
* A **web container** (**servlet container**) is responsible for managing the **lifecycle** of servlets, mapping a URL to a particular servlet and ensuring that the URL requester has the **correct access-rights**.
* A web container handles requests to servlets, Jakarta Server Pages (JSP) files, and other types of files that include server-side code. The Web container creates servlet instances, loads and unloads servlets, creates and manages request and response objects, and performs other servlet-management tasks.
* A web container implements the web component contract of the Jakarta EE architecture. This architecture specifies a runtime environment for additional web components, including **security**, **concurrency**, **lifecycle management**, **transaction**, **deployment**, and other services.


