package week5Project;

public class Result1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger star = new AsteriskLogger();
		star.Log("Hello");
		System.out.println();
		star.Error("Error:" + "" +  " Hello");
		
		System.out.println();
		
		Logger spaced = new SpacedLogger();
		spaced.Log("Hello");
		System.out.println();
		spaced.Error("Hello");
		
		
	}

}
