package com.epam.xml.factory;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.epam.xml.parser.*;

public class BuilderFactory {
	private enum ParserType {
		SAX, STAX, DOM
	}

	public void createFoodBuilder(String typeParser) throws ParserConfigurationException, SAXException, IOException {

		ParserType type = ParserType.valueOf(typeParser.toUpperCase());
		switch(type){
		case SAX:
			SAXMenuParser.parseSAX();
			break;
			//return new SAXBuilder;
		case STAX:
			StAXMenuParser.parseStAX();
			break;
			//return new STAXBuilder;
		case DOM:
			DOMMenuParser.parseDOM();
			break;
			//return new DOMBuilder;
		default:
			System.out.println("No such type of command. Please enter another one.");
		}
	}
}
