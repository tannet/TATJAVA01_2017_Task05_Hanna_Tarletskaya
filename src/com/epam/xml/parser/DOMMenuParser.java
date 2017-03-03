package com.epam.xml.parser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.epam.xml.entity.Food;


public class DOMMenuParser {
	public static void parseDOM() throws SAXException, IOException {
		System.out.println("DOM");
		// создание DOM-анализатора (Xerces)
		DOMParser parser = new DOMParser();
		parser.parse("menu.xml");
		Document document = parser.getDocument();
		Element root = document.getDocumentElement();
		List<Food> menu = new ArrayList<Food>();
		NodeList foodNodes = root.getElementsByTagName("food");
		Food food = null;
		for (int i = 0; i < foodNodes.getLength(); i++) {
			food = new Food();
			Element foodElement = (Element) foodNodes.item(i);
			food.setId(Integer.parseInt(foodElement.getAttribute("id")));
			food.setCategory(getSingleChild(foodElement, "category").getTextContent().trim());
			food.setName(getSingleChild(foodElement, "name").getTextContent().trim());
			food.setPrice(getSingleChild(foodElement, "price").getTextContent().trim());
			food.setDescription(getSingleChild(foodElement, "description").getTextContent().trim());
			food.setWeight(getSingleChild(foodElement, "weight").getTextContent().trim());
			menu.add(food);
		}
		for (Food f : menu) {
			System.out.println(f.toString());
		}
	}

	private static Element getSingleChild(Element element, String childName) {
		NodeList nlist = element.getElementsByTagName(childName);
		Element child = (Element) nlist.item(0);
		return child;
	}
}
