package Clothes;

import Fucntion.Waterproof;

public class RainCoat extends Clothes implements Waterproof {

	public RainCoat() {
		// TODO Auto-generated constructor stub
	}

	public RainCoat(String size) {
		super(size);
		// TODO Auto-generated constructor stub
	}

	public RainCoat(String size, String color) {
		super(size, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return super.getSize();
	}

	@Override
	public void setSize(String size) {
		// TODO Auto-generated method stub
		super.setSize(size);
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return super.getColor();
	}

	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		super.setColor(color);
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}

	@Override
	public void setPrice(int price) {
		// TODO Auto-generated method stub
		super.setPrice(price);
	}

	public RainCoat(String size, String color, int price) {
		super(size, color, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void waterproof() {
		// TODO Auto-generated method stub

	}

}
