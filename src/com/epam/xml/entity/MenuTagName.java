package com.epam.xml.entity;
public enum MenuTagName {
	NAME, PRICE, DESCRIPTION, WEIGHT, FOOD, CATEGORY, MENU;

	public static MenuTagName getElementTagName(String element) {
		switch (element) {
		case "menu":
			return MENU;
		case "food":
			return FOOD;
		case "price":
			return PRICE;
		case "description":
			return DESCRIPTION;
		case "weight":
			return WEIGHT;
		case "category":
			return CATEGORY;
		case "name":
			return NAME;
		default:
			throw new EnumConstantNotPresentException(MenuTagName.class, element);
		}
	}
}
