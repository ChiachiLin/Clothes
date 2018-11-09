package Shoes;

public class Shoes {
	private String name;
	private String size;
	private String color;
	private int price;
	public Shoes(String name) {
		super();
		this.name = name;
	}
	public Shoes(String name, String size) {
		this(name);
		this.size = size;
	}
	public Shoes(String name, String size, String color) {
		this(name,size);
		this.color = color;
	}
	public Shoes(String name, String size, String color, int price) {
		this(name,size,color);
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
