package classesWithAttributes;

public class Product {
	public Product() {
		System.out.println("Yapıcı blok çalıştı");
	}
	int _id;
	String _name;
	String _description;
	double _price;
	int _stockAmount;
	String _renk;
	String _kod;

	public String get_kod() {
		return this._name.substring(0, 1) + _id;
	}

	public void set_kod(String _kod) {
		this._kod = _kod;
	}

	public String get_renk() {
		return _renk;
	}

	public void set_renk(String _renk) {
		this._renk = _renk;
	}

	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double _price) {
		this._price = _price;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String _description) {
		this._description = _description;
	}

	/**
	 * @return the _name
	 */
	public String get_name() {
		return _name;
	}

	/**
	 * @param _name the _name to set
	 */
	public void set_name(String _name) {
		this._name = _name;
	}

}
