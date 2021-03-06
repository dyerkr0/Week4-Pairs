package com.techelevator;

public class VendingMachineItem {
	private String slotId;
	private String name;
	private DollarAmount price;
	private int quantity;
	
	public VendingMachineItem(String slotId, String name, DollarAmount price) {
		this.slotId = slotId;
		this.name = name;
		this.price = price;
		this.quantity = 5;
	}
	
	public String getSlotId() {
		return slotId;
	}
	public String getName() {
		return name;
	}
	public DollarAmount getPrice() {
		return price;
	}
	public void setSlotId(String slotId) {
		this.slotId = slotId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(DollarAmount price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getQuantity() {
		return quantity;
	}
	
	@Override
	public String toString() {
		String result = String.format("%-5s%-20s%-8s", slotId, name, price);
		if (quantity == 0) {
			result += String.format("%-10s", "SOLD OUT");
		} else {
			result += String.format("%-10s", quantity);
		}
		
		return result;
	}

}
