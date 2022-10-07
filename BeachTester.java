class BeachTester{


   public static void main(String a[]){
   
        Beaches.addBeachNames("Marina");
         Beaches.addBeachNames("Malpe");
         Beaches.addBeachNames("Baga");
         Beaches.addBeachNames("Gokarna");
	  //   Beaches.addBeachNames(null);
	     Beaches.addBeachNames("Murdeshwara");
		  Beaches.addBeachNames("Echo");
        Beaches.getBeachNames();
		 
		 Beaches.updateBeachName("Paradise","Marina");
		 
		  Beaches.getBeachNames();
		 
		 //Beaches.findBeachName("Gokarna");
   }



}