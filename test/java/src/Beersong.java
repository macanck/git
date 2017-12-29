public class Beersong{
public static void main(String[] args){
    int beerNum = 10;
    String words = "bottles";
    while(beerNum > 0 )
    {        
        System.out.println(beerNum + " " + words + " " + "on the wall");
        System.out.println("take two"+ " " + words + " " + "on the wall");
        beerNum = beerNum -2;
        
        if( beerNum == 0 )
        {
        	words = "bottle";
            System.out.println("NO" + " " + words + " " + "on the wall");
        }
    }
} 
}