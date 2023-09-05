package main;

import java.util.List; 
import dao.IEmployeeDao; 
import dao.EmployeeDao; 
import model.Employee;


public class App {
	public static void main(String[] args) { 
		IEmployeeDao employeeDao = new EmployeeDao();
		
		// adding books to the table
		Employee employee1 = new Employee(1,"Amila Silva","Teacher","0712315434","Temple Road,Galle."); 
		employeeDao.saveEmp(employee1);
		Employee employee2 = new Employee(2,"Saman Perera","Assistant","0701212121","No 5,Main Road,Rathgama.");
		employeeDao.saveEmp(employee2);
		Employee employee3 = new Employee(3,"Neela De Silva","Head Teacher","0703232322","No 23,Main Road,Ambalangoda.");
		employeeDao.saveEmp(employee3);
		Employee employee4 = new Employee(4, "Alice Johnson", "Science Teacher", "0765432109", "No 456, Hill road.");
		employeeDao.saveEmp(employee4);
		Employee employee5 = new Employee(5, "Bob Smith", "English Teacher", "0798765432", "No 3, Beach Road,Ambalangoda");
		employeeDao.saveEmp(employee5);
		
		
		//update emp info , changing the employee 1 address
		employee1.setAddress("No 3,Temple Road,Galle"); 
		employeeDao.updateEmp(employee1); 
		
		//update phone number of a employee
		employee1.setPhoneNumber("0716565656"); 
		employeeDao.updateEmp(employee5); 
		
		//get employees by the empid 
		Employee employee = employeeDao.getEmpById(employee2.getEmpId());
		
		//delete employees
		employeeDao.deleteEmp(employee2.getEmpId());
		
		
		
		
	}
}
