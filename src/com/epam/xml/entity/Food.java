package com.epam.xml.entity;

public class Food {
	private int id;
	private String category;
	private String name;
	private String price;
	private String description;
	private String weight;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String string) {
		this.weight = string;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		if (category.equals("")) {
			setDescription("?");
		}
		if (price.equals("")) {
			setPrice("?");
		}
		if (description.equals("")) {
			setDescription("?");
		}
		return "Food [id=" + id + ". Category: " + category + ". Name: " + name + ". Description: " + description + ", weight=" + "" + weight
				+ ", price=" + price + "]";
	}
}
