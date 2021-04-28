package bridgelabz;

public class Snake_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("#####  Welcome to Snake and Ladder Game  #####");
		
		for (int i = 0; i <= 0; i++)
		{
			
		System.out.println("\nYou are at a position '0' ");
		int position = 0;
		
		double empCheck1 = (Math.floor((Math.random() * 10 ) % 6) + 1);
		int IntValue1 = (int) Math.round(empCheck1);
		System.out.println("You Roll: " +IntValue1);
		System.out.println("player moves by: "+IntValue1);
		
		final int Ladder = 1;
		final int Snake = 2;
		double diecheck = (Math.floor(Math.random() * 10 ) % 3);
		int IntValue2 = (int) Math.round(diecheck);
		System.out.println("\n" +IntValue2);
		
		switch (IntValue2)
		{
      		case Ladder: 
      			System.out.println("player move ahead through ladder");
      			position += IntValue1;
      			System.out.println("Now you are at  " +position);
      			break;
      		case Snake:
      			if (position <=1 )
      				System.out.println("player stays at 0");
      			else
      				System.out.println("player move behind through snake");
      				position -= IntValue1;
      			break;
      		default:
      			if (position <= 0)
      				position = 0;
      			System.out.println("player doesnt move"); break;     			
		}	
		
		}
	}

}