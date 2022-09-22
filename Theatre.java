class Theatre {

   static long
   [] priceOfKannadaMovies = {1000,150,150,200 , 90000L};
       
  static  String[] kannadaMovies = {"KGF Franchise", "Om", "Sampathige Sawaal" , "Googlyy"};
  
 static String hindiMovies[] = {"3 Idiots","DDLJ","pk","Bajarangi bhaijaan"};
   
   //static String movieName3= ;
   
   public static void main(String a[]){
  
   System.out.println("List of kannada Movies ");
  System.out.println(
    kannadaMovies[0] + " "+  
    kannadaMovies[1] + " "+ 
    kannadaMovies[2] + " "+
	kannadaMovies[3]);
	System.out.println("*********************");
	System.out.println("Price of listed kannada Movies ");
	  
	  long ref0 =     priceOfKannadaMovies[0] ; 
	  long ref1 =  priceOfKannadaMovies[1] ; 
	  long  ref3 = priceOfKannadaMovies[3] ;l 
	  long ref4=  priceOfKannadaMovies[4] ; 
	System.out.println(
    + " "+  
    ref0 + " "+ 
    ref1 + " "+
	 ref3+ " "+
	ref4);
	
	System.out.println("List of Hindi Movies ");
	System.out.println(
    hindiMovies[0] + " "+  
    hindiMovies[1] + " "+ 
    hindiMovies[2] + " "+
	hindiMovies[3]);
   
  
   }
  




}