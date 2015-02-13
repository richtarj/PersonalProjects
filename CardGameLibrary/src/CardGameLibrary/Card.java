package CardGameLibrary;

public class Card {
	private char _rank;
	private char _suit;
	
	public Card(char rank, char suit){
		_rank = rank;
		_suit = suit;
	}
	
	public char Rank(){
		return _rank;
	}
	
	public char Suit(){
		return _suit;
	}
	
	//returns a string representing the card
	public String toString(){
		return "" + _rank + _suit;
	}
	
	//not implemented
	public String fullDisplay(){
		return null;
	}
}
