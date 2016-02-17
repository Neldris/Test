package test;

import java.util.Arrays;

public class TestMain {

	public static void main(String[] args) {
		for(int i = 1; i <= 50; i++) {
			 if(i % (3*5) == 0) 
			    System.out.println("FizzBuzz");
		      else if(i % 5 == 0)
				System.out.println("Buzz"); 
		      else if(i % 3 == 0) 
				System.out.println("Fizz"); 
		      else System.out.println(i); 
			 } 
		for(int i=1; i<=10; i++){ 
			System.out.print(fabionasi(i) +" "); } 
		
		String ff = substr("Richard", 0, 8);
		System.out.println(ff);

	}

	
	public static int fabionasi(int num){
		if(num ==1 || num ==2){
			return 1;
		}
		return fabionasi(num -1)+ fabionasi(num -2);
	}
	
	
	 public static String substr(String input, int offset, int length) {
         char []ar = input.toCharArray();
         String str="";
         if( length <= input.length()){
             for( int begin = 0 ; begin < input.length(); begin++ ){
                 if(begin >= offset && begin <= length){
                     str += ar[begin];
                     }
                     
                 }
             }
         return input.length()-1 < 1 ? null: str;
     }
 
	
}

