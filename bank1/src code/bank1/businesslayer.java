package bank1;

public class businesslayer {
      Dbmanager Db=new Dbmanager();
      
      public void show_amt(int acc) {
    	  Db.show_amt(acc);
      }
      public void add_records(int acc,String name,int age,int amt) {
    	  String cmd="insert into details(accn,name,age,amt)values('"+acc+"','"+name+"','"+age+"','"+amt+"')";
    	  if(Db.add_records(cmd)) {
    		  try {
        	  System.out.println("Record saved successfully");
          }
            catch(Exception e) {
            	System.out.println(e.getMessage());
            }
          
      }
      }
    	  public void add_amt(int acc,int incre) {
          int k=Db.amt_cntrl(acc);
           
           int b=k+incre;
           String cmd="update details set amt='"+b+"'where accn='"+acc+"'";
           if(Db.add_records(cmd)) {
        	   try {
        		   System.out.println("Money added successfully");
        	   }
        	   catch(Exception e) {
        		   System.out.println("Server Failure");
        	   }
           }
    	  }
    	  public void draw_amt(int acc,int decre) {
              int k=Db.amt_cntrl(acc);
               
               int b=k-decre;
               String cmd="update details set amt='"+b+"'where accn='"+acc+"'";
               if(Db.add_records(cmd)) {
            	   try {
            		   System.out.println("Money withdrawn successfully");
            	   }
            	   catch(Exception e) {
            		   System.out.println("Server Failure");
            	   }
               }
        	  }
}
      

      
      

