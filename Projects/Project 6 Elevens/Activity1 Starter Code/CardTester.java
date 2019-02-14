/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card a = new Card("three", "clubs", 3);
		Card b = new Card("four", "spades", 4);
		Card c = new Card("nine", "diamonds", 9);
		
		System.out.println("rank = "+a.rank());
		System.out.println("suit = "+a.suit());
		System.out.println("pointValue = "+a.pointValue());
		System.out.println(a.toString()+"\n");
		
		System.out.println("rank = "+b.rank());
		System.out.println("suit = "+b.suit());
		System.out.println("pointValue = "+b.pointValue());
		System.out.println(b.toString()+"\n");
		
		System.out.println("rank = "+c.rank());
		System.out.println("suit = "+c.suit());
		System.out.println("pointValue = "+c.pointValue());
		System.out.println(c.toString()+"\n");
	}
}
