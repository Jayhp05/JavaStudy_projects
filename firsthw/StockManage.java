package com.javastudy.project.firsthw;

public class StockManage {
	
	private String[] drinkMenu = {"콜라", "사이다", "환타", "핫식스"};
	private int[] stock = {5, 5 , 1, 2};
	private int[] price = {1200, 1200, 800, 2000};
	
	public String[] getDrinkMenu() {
		return drinkMenu;
	}
	public void setDrinkMenu(String[] drinkMenu) {
		this.drinkMenu = drinkMenu;
	}
	
	public int[] getStock() {
		return stock;
	}
	public void setStock(int[] stock) {
		this.stock = stock;
	}
	
	public int[] getPrice() {
		return price;
	}
	public void setPrice(int[] price) {
		this.price = price;
	}
}
