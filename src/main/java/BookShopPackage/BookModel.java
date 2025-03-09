package BookShopPackage;

public class BookModel {
	private int id;
	private String name;
	private String price;
	private String catagory;
	private int quntity;
	private String description;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public int getQuntity() {
		return quntity;
	}

	public void setQuntity(int quntity) {
		this.quntity = quntity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BookModel(int id, String name, String price, String catagory, int quntity, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.catagory = catagory;
		this.quntity = quntity;
		this.description = description;
	}
	
}
