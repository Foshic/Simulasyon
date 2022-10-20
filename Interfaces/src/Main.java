
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ICustomerDal customerDal=new OracleCustomerDal();
		CustomerManager customerManager=new CustomerManager(new MySqlCustomerDal());
		
		customerManager.add();
		
		
		

	}

}
