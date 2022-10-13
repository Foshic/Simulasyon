package youTubeEgitim;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.save();

		Customer customer = new Customer();
		customer.id = 1;
		customer.firstName = "Berkay";
		customer.lastName = "Erçetin";
	    customer.nationalIdentity="8374832";
		customer.city = "İzmir";

		//CustomerManager customerManager = new CustomerManager(customer);
		//customerManager.save();
		//customerManager.Delete();

		Company company = new Company();
		company.companyName = "xxxxxx";
		company.taxNo = "232323232";
		company.id = 100;

		//CustomerManager customerManager2 = new CustomerManager(new Person());

		Person person = new Person();
		person.firstName = "xxxxxx";
		person.lastName = "xxxxx";
		person.nationalIdentity = "378238238";

		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();
		
		
		CustomerManager customerManager1 = new CustomerManager(new Customer(),new MilitaryCreditManager());
		customerManager1.GiveCredit();
		
		
		

	}

}
