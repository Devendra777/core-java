class TubeLight {


	   static boolean isConnected = false ; 
	  

	  public static void main(String a[]){
	  // invoking a giveLight method 
	    giveLight() ; 
		giveLight() ; 
	  }
     
         // declaration of a giveLight method
	      public static void giveLight(){
		        System.out.println("giveLight method invoked ");
				 // false == false
			  if(isConnected == false){
			     isConnected= true ; 
			 System.out.println("Tube Light is turned On");
			  } 
             else	{
			        System.out.println("Gube.. Switched is already turned on");
			 }		  
			  
			   System.out.println("giveLight method ended ");
	      }


}