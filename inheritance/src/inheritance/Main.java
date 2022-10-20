package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		Employee employee=new Employee();
		EmployeeManager employeeManager=new EmployeeManager();
		CustomerManager customerManager=new CustomerManager();
		customerManager.Add();
		employeeManager.BestEmployee();
		customer.age=23;
		employee.id=121212;
		System.out.println(customer.age);
		System.out.println(employee.id);
		
		

	}

}
