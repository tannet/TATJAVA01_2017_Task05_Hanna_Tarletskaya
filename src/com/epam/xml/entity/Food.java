package com.epam.xml.entity;

public class Food {
	private int id;
	private String type;
	private String name;
	private String description;
	private String weight; //(?)
	private int price;
	
	public Food(){
		
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Food [id=" + id + ", type=" + type + ", name=" + name + ", description=" + description + ", weight="
				+ weight + ", price=" + price + "]";
	}	
}