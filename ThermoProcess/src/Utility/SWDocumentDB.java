package Utility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SWDocumentDB {
	
	private static final Map<String,List<String>> SOFTWARE_DOCS = new HashMap<>();
	
	public static final String PHASE_ONE_CONCEPT = "Concept(DTI-DTC)";
	public static final String PHASE_TWO_DEFINITION = "Definition(DTC-SDC)";
	public static final String PHASE_THREE_DEVELOPMENT = "Development(SDC-SMC)";
	public static final String PHASE_FOUR_MANUFACTURES = "Manufacture(SMC-CTC)";
	public static final String PHASE_FIVE_CONFIRMATION = "Confirmation(CTC-PRC)";
	public static final String PHASE_SIX_CONMERCIAL = "Commercial(PRC-PCC)";
	
	static {
		SOFTWARE_DOCS.put(PHASE_ONE_CONCEPT, Arrays.asList("Customer Wants","CRD", "CRD Review(Dev)", "Tech Assessment(Dev)", "Tech Assessment Review(Dev)"));
		SOFTWARE_DOCS.put(PHASE_TWO_DEFINITION, Arrays.asList("Change Request","Software Change Request","Hazard Analysis","PRD", "PRD Review", "Trace Matrix(CR->PR/Risk)","Tech Progress Review(Review feasibility)","Software Dev Plan","Design Transfer and Release Plan(Draft)","Scientific Validity(V&V)","Cybersecurity Plan","Software Configuration Management Plan(SCMP)","Software Verification Plan(SVP Draft)"));
		SOFTWARE_DOCS.put(PHASE_THREE_DEVELOPMENT, Arrays.asList("Development(weeks)","Software Tool Assessment document","Software Architecutre Document(SAD)", "3rd Party Libs(EULA)","Dev Phase Design Slide(Design Review)","Design Review", "PSD","Threat Modeling", "Thread Modeling Review","Bug fix after feature complete(weeks)","Translation & Online Helps Translation", "Pen Test & Remediation", "Translation Integration","Design Verification Test Plan", "Verification Readiness Slide","Verification Readiness Review","Formal Verification(weeks)","Verification Result Slide","Verification Result Review","Design Verification Test Report","Trace Matrix","Open Anomalities List","Hazard Analysis","SRA", "Software Design & Release Plan", "Software Maintenance & Decommissiong and disposal Plan(SMP)","SCR Update","SCR Closure Review","SRN + Deployment + FA Report(weeks)"));
		SOFTWARE_DOCS.put(PHASE_FOUR_MANUFACTURES, Arrays.asList("Production Builds/MTSS","Design Validation Readiness Review","Design Validation Test Plan", "Design Validation Protocol","SVT","Design Validation Result Review","Design Validation Test Report","Clinical Performace Testing", "Open Anomalies List(Add Validation Defects)", "Trace Matrix(Add Design Validation Result)", "Hazard Analysis(Add validation evidences)"));
		SOFTWARE_DOCS.put(PHASE_FIVE_CONFIRMATION, Arrays.asList("Software Design and Release Transfer Plan","Software Maintenance, Decommission and Disposal Plan(SMP)","SCR Doc Update","SCR Closure Review","Release note", "SRC Doc","SRN + Deployment + FA Report(weeks|Desktop SW)", "SW Dev Report(SDR)","SRA","SBOM","Cybersecurity Report","SW Revision History"));
		SOFTWARE_DOCS.put(PHASE_SIX_CONMERCIAL, Arrays.asList("PRC"));
	}
	
	
	public static void print(String phase) {
		String blue = "\u001B[34m";
		String red = "\u001B[31m";
		String reset = "\u001B[0m";
		System.out.println(red + phase + ":" + reset);
		for(String file : SOFTWARE_DOCS.get(phase)) {
			System.out.println(blue + file + reset);
		}
		
	}
}
