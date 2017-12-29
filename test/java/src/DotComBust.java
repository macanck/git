import java.util.*;

public class DotComBust {
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;
	
	private void setUpGame(){
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("etoy.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");
		dotComList.add(one);
		dotComList.add(two);
		dotComList.add(three);
		
		System.out.println("YOUR GOAL IS TO SINK THREE DOT COM.");
		System.out.println("Pets.com,eToy.com,Go2.com");
		System.out.println("Try to sink them all in the fewest numb");
		
		for(DotCom dotComToSet : dotComList){
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}
	
	private void startPlaying(){
		while(!dotComList.isEmpty()){
			String userGuess = helper.getUserInput("enter a guess");
			checkUserGuess(userGuess);
		}
		finishGame();
		
	}
	
	private void checkUserGuess(String userGuess){
		numOfGuesses++;
		String result = "miss";
		for(DotCom dotComToTest : dotComList){
			result = dotComToTest.checkYourself(userGuess);
			if(result.equals("hit")){
				break;
			}
			if(result.equals("kill")){
				dotComList.remove(dotComToTest);
				break;
			}
		}
		System.out.println(result);
	}
	
	private void finishGame(){
		System.out.println("all dot coms are dead;your stock is now  worthless.");
		if(numOfGuesses <= 18){
			System.out.println("it only took  you" + numOfGuesses +"guesses.");
			System.out.println("you got out before you options sank.");
		}else{
			System.out.println("took you long enough." + numOfGuesses + "Guess.");
			System.out.println("fish are dancing with your options");
		}
	}
	
	public static void main (String[] args){
		DotComBust game =new DotComBust();
		game.setUpGame();
		game.startPlaying();	
	}
}
