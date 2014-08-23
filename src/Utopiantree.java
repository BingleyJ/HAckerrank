
public class Utopiantree {
	
	public static void main(String[] args) {
		
	 
	      calcHeight(4);
	      //calcHeight(2);

	}

	public static void calcHeight(int inN){
	       int outHeight = 1;
	      
	       for (int a = 1; a <= inN; a++){
	           if (a % 2 == 0 && inN != 0){
	        	   outHeight++;
	           }
               if (a % 2 != 0 && inN != 0){
                   outHeight = outHeight + outHeight;
               }
           }
        System.out.println(outHeight);
	}
	       

	
}
