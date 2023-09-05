package model;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private int empId;

    @Column(name = "emp_name")
    private String empName;

    @Column(name = "emp_position")
    private String empPosition;

    @Column(name = "phn_num")
    private String phoneNumber;

    @Column(name = "address")
    private String address;

    public Employee() {
    }

    public Employee(int empId, String empName, String empPosition, String phoneNumber, String address) {
        this.empName = empName;
        this.empPosition = empPosition;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Getters and setters for other fields...

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpPosition() {
        return empPosition;
    }

    public void setEmpPosition(String empPosition) {
        this.empPosition = empPosition;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", empPosition=" + empPosition +
                ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
    }

	
}

