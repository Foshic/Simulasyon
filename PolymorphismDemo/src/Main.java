
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseLogger[] loggers=new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger()};
		for(BaseLogger logger:loggers) {
			logger.log("log mesajı");
		}
		
		CustomerManager customerManager= new CustomerManager(new DatabaseLogger());
		
		customerManager.add();
		

	}

}
