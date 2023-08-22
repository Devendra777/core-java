class Factorial {

  // 5 ! = 0* 1* 2* 3* 4* 5 
  // 0!  = 1
   public static void main(String fact[]){
	   System.out.println("main started");
  getFact(0);
   getFact (7);
   getFact(5) ; 
    System.out.println("main ended");
   }
 
	 // int factNumber = 6;
    public static void getFact(int factNumber){ 
	System.out.println("getFact started");
	  int fact = 1;
	  
	   for(int n=1 ; n <= factNumber ; n++  ){	   
              fact =    fact * n;
		}
		
		// 
		System.out.println("The Factorial of "+ factNumber + " is  "+ fact);
		System.out.println("getFact is ended");
	   }
}