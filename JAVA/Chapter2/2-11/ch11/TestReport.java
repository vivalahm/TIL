package ch11;

public class TestReport {

	public static void main(String[] args) {

		MakeReport firstReport = new MakeReport();
		String builder = firstReport.getReport();
		
		System.out.println(builder);
	}

}
