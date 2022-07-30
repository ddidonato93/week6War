package week5Project;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String message) {
		System.out.println(WowSoSpaced (message));
		
	}

	private String WowSoSpaced(String message) {
	StringBuilder builder = new StringBuilder();
	for (int i = 0; i < message.length(); i ++) {
		builder.append(message.charAt(i)).append(' ');
	}
	builder.deleteCharAt(builder.length() - 1);
	return builder.toString();
	}

	@Override
	public void Error(String message) {
		
		System.out.println("ERROR: " + WowSoSpaced(message));
		
		
	}

	

}


