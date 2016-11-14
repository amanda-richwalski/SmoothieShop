package org.elevenfifty.smoothie.util;

import java.util.List;

import org.elevenfifty.smoothie.decoratored.Item;

public final class PrettyPrinter {
	
	private PrettyPrinter() {
	}

	private static String printPretty(String preamble, List<? extends Object> lines) {
		StringBuffer b = new StringBuffer(preamble);
		b.append("\n");
		for (Object line : lines) {
			b.append("\t");
			b.append(line.toString());
			b.append("\n");
		}
		return b.toString();
	}

	public static void print(Item item) {
		out.println(item.getName());
		out.println(printPretty("Ingredients:", item.getIngredients()));
		out.println(printPretty("Instructions:", item.getInstructions()));
		out.println(item.getCost());
	}
}

	
	
