package bridgelabz;

public class Snake_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("#####  Welcome to Snake and Ladder Game  #####");
		
		
			
		System.out.println("\nYou are at a position '0' "); 		
		int position = 0;
		while (position <= 100)
		{
			double empCheck1 = (Math.floor((Math.random() * 10 ) % 6) + 1);
			int IntValue1 = (int) Math.round(empCheck1);
			System.out.println("\nYou Roll: " +IntValue1);
		
			final int Ladder = 1;
			final int Snake = 2;
			double diecheck = (Math.floor(Math.random() * 10 ) % 3);
			int IntValue2 = (int) Math.round(diecheck);
			System.out.println(IntValue2);
		
			switch (IntValue2)
			{
      			case Ladder: 
      				System.out.println("player move ahead through ladder");
      				position = +position + IntValue1;    					
      				System.out.println("Now you are at  " +position);
      				break;
      			case Snake:
      				if (+position <= 0) {
      					System.out.println("Player stays at 0"); }
      				else {
      					if (+position > 6) {
      						position -= IntValue1;
      						System.out.println("Player move behind through snake");
      						System.out.println("Now you are at " +position);
      					}
      				}
      				break;
      			default:
      				if (position <= 0)
      					position = 0;
      					System.out.println("player doesnt move"); break;     			
			}		
		}
	}
}