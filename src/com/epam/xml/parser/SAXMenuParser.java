package com.epam.xml.parser;
import java.io.IOException;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import com.epam.xml.entity.Food;

public class SAXMenuParser {
	public static void parseSAX() throws ParserConfigurationException, SAXException, IOException {
		System.out.println("SAX");
		XMLReader reader = XMLReaderFactory.createXMLReader();
		MenuSaxHandler handler = new MenuSaxHandler();
		reader.setContentHandler(handler);
		reader.parse(new InputSource("menu.xml"));
		reader.setFeature("http://xml.org/sax/features/validation", true);
		reader.setFeature("http://xml.org/sax/features/namespaces", true);
		reader.setFeature("http://xml.org/sax/features/string-interning", true);
		reader.setFeature("http://apache.org/xml/features/validation/schema", false);
		List<Food> menu = handler.getFoodList();
		for (Food food : menu) {
			System.out.println(food.toString());
		}
	}
}
