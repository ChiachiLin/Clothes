package Clothes;
public class Clothes{
	private String size;
	private String color;
	private int price;
	private String name;
	
	public Clothes(){}
	public Clothes(String size){
		this ();
		setSize(size);
	}
	public Clothes(String size,String color){
		this(size);
		setColor(color);
	}
	public Clothes(String size,String color,int price){
		this(size,color);
		setPrice(price);
	}
	public Clothes(String size,String color,int price,String name){
		this(size,color,price);
		setName(name);
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize(){
		return this.size;
	}
	public void setSize(String size){
		this.size = size;
	}
	public String getColor(){
		return this.color;
	}
	public void setColor(String color){
		this.color = color; 
	}

	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
	


