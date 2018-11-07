package Pants;
public class Pants(){
	private String size;
	private String color;
	
	public Pants(){}
	public Pants(String size){
		this();
		setSize(size);
	}
	public String getSize(){
		return this.size;
	}
	public void setSize(String size){
		this.size = size;
	}
}