package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entites.Department;
import model.entites.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		/*System.out.println("=== TEST 1: Department insert ====");
		Department dep = new Department(null, "Dices");
		departmentDao.insert(dep);
		System.out.println("Inserted! New Id: " + dep.getId());*/
		
		System.out.println("=== TEST 1: Department findById ====");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("=== TEST 2: Department findAll ====");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		System.out.println("=== TEST 3: Department update ====");
		department = departmentDao.findById(8);
		department.setName("Cards");
		departmentDao.update(department);
		System.out.println("Update completed! ");
		
		System.out.println("=== TEST 4: Department delete ====");
		System.out.print("Enter id for delete test: ");
		Scanner sc = new Scanner(System.in);
		departmentDao.deleteById(sc.nextInt());
		System.out.println("Delete completed!");
		
		
	}
	
}
