import java.util.ArrayList;

public class Testarray {
public static void main(String[] args){
	ArrayList<String> myList = new ArrayList<String>();
	String a = new String("whoohoo");
	myList.add(a);
	String b = new String("frog");
	myList.add(b);
	
	int theSize = myList.size();
	System.out.println(theSize);
	
	boolean isIn = myList.contains(a);
	System.out.println(isIn);
	
	int i = myList.indexOf(b);
	System.out.println(i);
	
	
}
}
