package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import jakarta.persistence.criteria.CriteriaQuery;

import model.Employee;

import util.HibernateUtil;

public class EmployeeDao implements IEmployeeDao {

	@Override
	public void saveEmp(Employee employee) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.persist(employee);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}

	}
	@Override
	public void updateEmp(Employee employee) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start the transaction
			transaction = session.beginTransaction();
			// save student object
			session.merge(employee);
			// commit the transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}
	
	@Override
	public Employee getEmpById(int empId) {
		Transaction transaction = null;
		Employee employee = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			// start the transaction
			transaction = session.beginTransaction();
			// get student object
			employee = session.get(Employee.class, empId);
			// student = session.load(Student.class, id);
			// commit the transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		return employee;
	}
	
	
	@Override
	public void deleteEmp(int empId) {
		Transaction transaction = null;
		Employee employee = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start the transaction
			transaction = session.beginTransaction();
			employee = session.get(Employee.class, empId);
			// get student object
			session.remove(employee);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}
		
	}
