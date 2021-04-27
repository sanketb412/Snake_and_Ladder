package bridgelabz;

public class Snake_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("#####  Welcome to Snake and Ladder Game  #####");
		
		System.out.println("\nYou are at a position '0'");
		
		double empCheck = (Math.floor((Math.random() * 10 ) % 6) + 1);
		int IntValue = (int) Math.round(empCheck);
		System.out.println("You Roll: " +IntValue);
	}

}
