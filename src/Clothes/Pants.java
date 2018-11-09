package Clothes;

public class Pants{
	private String size;
	private String color;
	private int price;
	
	public Pants(){}
	public Pants(String size){
		this ();
		setSize(size);
	}
	public Pants(String size,String color){
		this(size);
		setColor(color);
	}
	public Pants(String size,String color,int price){
		this(size,color);
		setPrice(price);
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