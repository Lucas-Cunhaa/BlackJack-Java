package dir.com.game;

import java.util.Scanner; 
import java.util.Random; 

public class BlackJack {
	
		public static final String[] cards = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "Valete", "Dama", "Rei"}; 
		public static final String[] naipes = {"Ouro", "Copas", "Espada", "Paus"};
		
		public static void game() {
			Scanner sc = new Scanner(System.in); 
			String start = "";
			
			do {
				start = startGame(sc);
				int dealer = 0; 
				int player = 0;
				
				player = showCard(2);
				
				
			} while(start != "y");
		}
		
		public static String startGame(Scanner sc) {
			System.out.println("Start game? Y/N");
			return sc.nextLine();
		}
		
		public static int getRandomElement(String[] elements) {
			Random rd = new Random(); 
			return rd.nextInt(elements.length);
		}
		
		public static int showCard(int times) {
			int total = 0; 
			for (int i = 0; i < times; i++) {
				int card = getRandomElement(cards);
				int naipe = getRandomElement(naipes);
			
				total += card + 1;
				
				System.out.println("The card is: " + cards[card] + "of " + cards[card]);
			}
			
			return total;
		}
		
		public static void main(String[] args ) {
			
		}
		
		
		
}
