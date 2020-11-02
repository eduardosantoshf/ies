### Web applications in Java can be deployed to stand-alone applications servers or embedded servers. Elaborate on when to choose one over the other (and relate with Spring Boot).

**Embedded servers** are useful when you treat your application as an OS process and it will be started with something like java -jar youapp.jar. In this scenario, setting up the box upfront with a given app server, say, Tomcat, is **not necessary**. Such applications can be run by the end user **without** needing **extra installation** and **configuration** of an app server.

Applications like Jenkins for example hugely benefit from such packaging. Another scenario is when deploying on cloud services like Heroku. You wrapping the app server within your jar eliminates the need to get the server installed on such cloud boxes.

Here essentially a single web app runs on a given embedded server. However if you wish to install two web apps on lets say two contexts `${root}/app1` `${root}/app2` then embedded app server is **not** a good option for you.

**Standalone servers** are **independent** of domain controllers on the network. They are **not** domain members and function more like workgroup servers. In many cases a standalone server is configured with a minimum of security control with the intent that all data served will be readily accessible to all users.

### Explain, in brief, the “dynamics” of Model-View-Controller approach used in Spring Boot to serve web content. (You may exemplify with the context of the previous exercises.)
The **Spring Web model-view-controller** (**MVC**) **framework** is designed around a DispatcherServlet that dispatches requests to handlers, with configurable handler mappings, view resolution, locale and theme resolution as well as support for uploading files. The default handler is based on the `@Controller` and `@RequestMapping` annotations, offering a wide range of flexible handling methods. With the introduction of Spring 3.0, the `@Controller` mechanism also allows you to create RESTful Web sites and applications, through the `@PathVariable` annotation and other features.

### Inspect the POM.xml for the previous SpringBoot projects. What is the role of the “starters” dependencies?
