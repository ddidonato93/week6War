package week5Project;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String message) {
	
	System.out.println("***" + message + "***");	
		
	}

	@Override
	public void Error(String message) {
	
	String errorMsg = "***" + message + "***";
	String stonkStr = "*".repeat(errorMsg.length());
	System.out.println(stonkStr);
	System.out.println(errorMsg);
	System.out.println(stonkStr);
		
	}


}
