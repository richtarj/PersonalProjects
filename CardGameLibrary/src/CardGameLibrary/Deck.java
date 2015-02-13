package CardGameLibrary;

public class Deck {
	
	private Card[] _deck;
	private char[] _ranks = {'A','2','3','4','5','6','7','8','9','T','J','Q','K'};
	private char[] _suits = {'H','D','C','S'};
	private int _deckType;
	private int _count;
	public Shuffle<Card> s = new Shuffle<Card>();
	
	//One argument constructor selects a type of deck to create
	//and shuffles it
	public Deck(int deckType){
		_count = 0;
		switch(deckType){
		//Standard 52 card deck
		case 0:
			_deck = new Card[52];
			_deckType = 0;
			for (int i = 0; i < _suits.length; i ++){
				for (int j = 0; j < _ranks.length; j ++){
					_deck[_count] = new Card(_ranks[j],_suits[i]);
					_count++;
				}
			}
			s.shuffle(_deck);
			break;
		//Standard 54 card deck (52 card plus 2 jokers)
		case 1:
			_deck = new Card[54];
			_deckType = 1;
			for (int i = 0; i < _suits.length; i ++){
				for (int j = 0; j < _ranks.length; j ++){
					_deck[_count] = new Card(_ranks[j],_suits[i]);
					_count++;
				}
			}
			_deck[_count] = new Card('L','J');
			_count++;
			_deck[_count] = new Card('H','J');
			_count++;
			s.shuffle(_deck);
			break;
		//Old Maid deck
		case 2:
			_deck = new Card[54];
			_deckType = 2;
			for (int i = 0; i < _suits.length; i ++){
				for (int j = 0; j < _ranks.length; j ++){
					_deck[_count] = new Card(_ranks[j],_suits[i]);
					_count++;
				}
			}
			_deck[_count] = new Card('O','M');
			_count++;
			s.shuffle(_deck);
			break;
		//Standard 52 card deck
		default:
			_deck = new Card[52];
			_deckType = 0;
			for (int i = 0; i < _suits.length; i ++){
				for (int j = 0; j < _ranks.length; j ++){
					_deck[_count] = new Card(_ranks[j],_suits[i]);
					_count++;
				}
			}
			s.shuffle(_deck);
			break;
		}
	}
	
	//Zero argument constructor creates a standard 52 card deck and shuffles it
	public Deck(){
		_count = 0;
		_deck = new Card[52];
		_deckType = 0;
		for (int i = 0; i < _suits.length; i ++){
			for (int j = 0; j < _ranks.length; j ++){
				_deck[_count] = new Card(_ranks[j],_suits[i]);
				_count++;
			}
		}
		s.shuffle(_deck);
	}
	
	public Card draw(){
		_count--;
		return _deck[_count];
	}
	
	public void replace(Card inCard){
		_deck[_count] = inCard;
		_count++;
	}
	
	//method to debug new deck types
	public void display(){
		System.out.println("Deck: ");
		for (int i = 0; i < _count; i++){
			if (i%13 == 0){
				System.out.print("\n" + _deck[i].toString() + " ");
			}
			else{
				System.out.print("" + _deck[i].toString() + " ");
			}
		}
		System.out.println();
	}
}
