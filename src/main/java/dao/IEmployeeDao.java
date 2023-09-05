package dao; 
import java.util.List; 
import model.Employee; 

public interface IEmployeeDao {
	void saveEmp(Employee employee); 
	void updateEmp(Employee employee);
	Employee getEmpById(int empId);
	void deleteEmp(int empId);
	
}
