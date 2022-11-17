class Speaker{
  
   static String  brandName =  "Bose";
   static String  frequency = "";
	static boolean isWireLess = true ; 
	static boolean isConnected  ;
      static int minVolume; 
	  static int maxVolume  = 6 ; 
	  static int currentVolume ; 
	  
	  
	 public static void onOrOff(){
		System.out.println("inside onOrOff method");  
		 
		if(isConnected == false){
			   isConnected = true ; 
			   System.out.println("Speaker is turned Onn.. enjoy..");
		}else if(isConnected == true ){
			 isConnected = false ;
			 System.out.println("Speaker is turned Off..."); 
		}	
         System.out.println("onOrOff method ended");  		
	  }
	  
	  
	  public static void increaseVolume(){
		  System.out.println("invoked increase method");
		  System.out.println("No of Parameters:"+ 0);
		     if(isConnected == true){
		   if(currentVolume > minVolume){
			 currentVolume =   currentVolume +1  ;
			               
			   System.out.println("The Current Volume is "+ currentVolume);
		   }
		   else{
			   System.out.println("Max Volume Reached");
		   }
	     } else{
			System.out.println("Gube.. First Turn on the Speaker");   
	      }
		  
	  }
	  public static void decreaseVolume(){
		  
	  }
	  
	 

}