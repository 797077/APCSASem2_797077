/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
	    String[] ranks1 = {"a", "b", "c"};
	    String[] suits1 = {"A", "B", "C"};
	    int[] values1 = {1, 2};
	    Deck one = new Deck(ranks1, suits1, values1);
	    while (!one.isEmpty()){
	        System.out.println(one.deal().toString());
	       }
	    System.out.println("\n");
	       
	    String[] ranks2 = {"d", "e", "f"};
	    String[] suits2 = {"D", "E", "F"};
	    int[] values2 = {3, 4};
	    Deck two = new Deck(ranks2, suits2, values2);
	    while (!two.isEmpty()){
	        System.out.println(two.deal().toString());
	       }
	    System.out.println("\n");
	    
	    String[] ranks3 = {"g", "h", "i"};
	    String[] suits3 = {"G", "H", "I"};
	    int[] values3 = {5, 6};
	    Deck three = new Deck(ranks3, suits3, values3);
	    while (!three.isEmpty()){
	        System.out.println(three.deal().toString());
	       }
	}
}
