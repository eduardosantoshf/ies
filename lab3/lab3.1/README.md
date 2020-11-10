## 3.1

### Be sure to list all, filter one, insert and update Employees, i.e., try the several web methods. Take note of the URL used and report in the Readme.
* GET requests (type: GET):
	* Allow us to list all employees:
		* URL: `http://localhost:8080/employees/`
	* Lists employee with id 1:
		* URL: `http://localhost:8080/employees/1`
![GET employees id: 1](images/GETemployees1.png)
* PUT request (type: PUT):
	* This will change the employee with id 2:
		* URL: `http://localhost:8080/employees/2`
		* Type: RAW - JSON
		* Content: `{"id":2, "name":"Edu", "role":"Some"}`
![PUT employees id: 2](images/PUTemployees2.png)
* POST request (type: POST):
	* This will add a new employee:
		* URL: `http://localhost:8080/employees/`
		* Type: RAW - JSON
		* Content: `{"name":"Bastitos", "role":"Tabaqueiro"}`
![POST employees](images/POSTemployees.png)
* DELETE request (type: DELETE):
	* This will delete the employee with id 4:
		* URL: `http://localhost:8080/employees/4`
	* This will delete the employee with id 5:
		* URL: `http://localhost:8080/employees/5`

### What would be the proper HTTP Status code to get when searching an API for non-existent `http://localhost:8080/employees/987987`?
404 Not found

## 3.2

### Explain the annotations @Table, @Colum, @Id found in the Employee entity.

