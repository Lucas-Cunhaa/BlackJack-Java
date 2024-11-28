package dir.com.game;

import java.util.Scanner; 

public class BlackJack {
	public static void main(String[] args ) {
		
	}
		public static final String[] cards = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "Valete", "Dama", "Rei"}; 
		public static final String[] naipes = {"Ouro", "Copas", "Espada", "Paus"};
		
		public static void game() {
			Scanner sc = new Scanner(System.in); 
			String start = "";
			
		do {
			start = startGame(sc);
			int dealer = 0; 
			int player = 0;
			
		} while(start != "y");
	}
		
		public static String startGame(Scanner sc) {
			System.out.println("Start game? Y/N");
			return sc.nextLine();
			
		}
}
