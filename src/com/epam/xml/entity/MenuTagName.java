package com.epam.xml.entity;

public enum MenuTagName {
	NAME, DESCRIPTION, WEIGHT, PRICE, FOOD, BREAKFAST_MENU;

	// for stax only?
	public static MenuTagName getElementTagName(String element) {
		switch (element) {
		case "name":
			return NAME;
		case "description":
			return DESCRIPTION;
		case "weight":
			return WEIGHT;
		case "price":
			return PRICE;

		case "food":
			return FOOD;

		case "breakfast-menu":
			return BREAKFAST_MENU;

		default:
			throw new EnumConstantNotPresentException(MenuTagName.class, element);
		}
	}
}
