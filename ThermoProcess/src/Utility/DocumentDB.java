package Utility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentDB {
	
	private static final Map<String,List<String>> SOFTWARE_DOCS = new HashMap<>();
	public static final String PHASE_ONE_CONCEPT = "Concept(DTI-DTC)";
	
	static {
		SOFTWARE_DOCS.put(PHASE_ONE_CONCEPT, Arrays.asList("Customer Wants","CRD", "CRD Review(Checkpoint|dev)", "Tech Assessment(dev)", "Tech Assessment Review(Checkpoint|dev)"));
		SOFTWARE_DOCS.put("Definition(DTC-SDC)", null);
		SOFTWARE_DOCS.put("Development(SDC-SMC)", null);
		SOFTWARE_DOCS.put("Manufacture(SMC-CTC)", null);
	}
	
	
	public static void print(String phase) {
		String blue = "\u001B[34m";
		String red = "\u001B[31m";
		String reset = "\u001B[0m";
		System.out.println(red + phase + ":" + reset);
		System.out.println(blue + SOFTWARE_DOCS.get(phase) + reset);
	}
}
