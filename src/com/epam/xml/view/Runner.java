package com.epam.xml.view;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.epam.xml.factory.BuilderFactory;

public class Runner {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		Helper.printHelp();// write it!
		Scanner sc = new Scanner(System.in);
		String command;
		while (sc.hasNext()) {
			command = sc.nextLine();
			if (command.equals("EXIT")) {
				System.out.println("Program executing is stopped.");
				return;
			} else {
				BuilderFactory factory = new BuilderFactory();
				factory.createFoodBuilder(command);
			}
		}
	}
}
