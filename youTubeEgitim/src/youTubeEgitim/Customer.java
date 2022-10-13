package youTubeEgitim;

public class Customer {
	
	public Customer()
	{
		System.out.println("müşteri nesnesi başlatıldı");
	}


		public int id;
		public String firstName;
		public String lastName;
		public String city;
		public String nationalIdentity;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		}
		

	


