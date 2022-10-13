package youTubeEgitim;

public class CustomerManager {
	
	private Customer _customer;
	private ICreditManager _creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager)
	{
		set_customer(customer);
		_creditManager=creditManager;
	}
	public void save ()
	{
		System.out.println("Müşteri Kaydedildi: " );
	}
	
	public void Delete ()
	{
		System.out.println("Müşteri Silindi : " );
	}
	
	public void GiveCredit()
	{
		_creditManager.Calculate();
		System.out.println("Kredi Verildi");
	}
	public Customer get_customer() {
		return _customer;
	}
	public void set_customer(Customer _customer) {
		this._customer = _customer;
	}
	
	
	

}
