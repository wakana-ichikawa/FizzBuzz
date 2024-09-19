
public class FizzBuzz {

    public static void main(String[] args) {
        for (int l = 1; l <= 100; l++){
        	if( l % 3 == 0 && l % 5 == 0 ) 
        		System.out.println("FizzBuzz");
        	else if(l%3==0)
        		System.out.println("Fizz");
        	else if(l%5==0)
        		System.out.println("Buzz");   
        	else
        		System.out.println(l);
        }
    }
}