## 3.2

### Explain the annotations @Table, @Colum, @Id found in the Employee entity.

* `@Table`:
	* By default, each entity class maps a database table with the same name in the default schema of your database. We can customize this mapping using the name, schema, and catalog attributes of the @Table annotation.
* `@Column`:
	* It is an optional annotation that enables us to customize the mapping between the entity attribute and the database column.
* `@Id`:
	* JPA and Hibernate require you to specify at least one primary key attribute for each entity. We can do that by annotating an attribute with the @Id annotation.

### Explain the use of the annotation @AutoWired (in the Rest Controller class).
*"The Spring framework enables automatic dependency injection. In other words, by declaring all the bean dependencies in a Spring configuration file, Spring container can autowire relationships between collaborating beans. This is called Spring bean autowiring."*

In the `EmployeeController` class, the @AutoWired is used to tag the `EmployeeRepository` instance. 
