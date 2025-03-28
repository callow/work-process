package Utility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentDB {
	
	private static final Map<String,List<String>> SOFTWARE_DOCS = new HashMap<>();
	
	static {
		SOFTWARE_DOCS.put("Concept(DTI-DTC)", Arrays.asList("Customer Wants","CRD", "CRD Review(checkpoint|dev)", "Tech Assessment(dev)", "Tech Assessment Review(checkpoint|dev)"));
		SOFTWARE_DOCS.put("Definition(DTC-SDC)", null);
		SOFTWARE_DOCS.put("Development(SDC-SMC)", null);
		SOFTWARE_DOCS.put("Manufacture(SMC-CTC)", null);
	}
}
