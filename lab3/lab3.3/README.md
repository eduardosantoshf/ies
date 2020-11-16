## 3.3

### Explain the differences between the RestController and Controller components used in this sample.
The `@Controller` is a common annotation that is used to mark a class as Spring MVC Controller while `@RestController` is a special controller used in **RESTFul web services** and the equivalent of `@Controller` + `@ResponseBody`.

We don't need to use `@Controller` and `@RestponseBody` annotation, instead you can use `@RestController` to provide the same functionality. In short, it is a convenience controller that combines the behavior of `@Controler` and `@Response` body into one.

The `@Controller` is a specialization of @Component annotation while `@RestController` is a specialization of `@Controller` annotation.

### Both the RestController and the Controller need to access the database, using a Repository. How do they get a valid instance of the Repository to work with?
Both the `@RestController` and the `@Controller` possess as atribute an instance of the interface of the repository. But, because this interface is extending the JPA Repository interface, all the validation is inside the menntioned interface, so, they all get a valid instance of the repository to work with.