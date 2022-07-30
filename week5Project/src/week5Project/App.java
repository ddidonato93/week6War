package week5Project;

public class App {

	public static void main(String[] args) {
		AsteriskLogger FINISH = new AsteriskLogger();
		SpacedLogger DONE = new SpacedLogger();
		FINISH.Log("Brain hurts");
		System.out.println();
		FINISH.Error("It really hurts.");
		System.out.println();
		DONE.Log("So many spaces");
		DONE.Error("Woweee");
		
		

	}

}
