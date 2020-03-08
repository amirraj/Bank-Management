
package operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Create {
        static Connection con;
        static Statement statement = null;
        
         String naam ;
         String contact ;
         double balance ;
    
     Create(String naam,String contact,double balance){
            
         this.naam = naam;
         this.contact = contact;
         this.balance = balance;
        
        
        
    }
    
      public void create(){
          String query = " insert into info (naam, contact, balance)"
        + " values ('"+naam+"',"+contact+","+balance+")";
       
       try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "root");
			statement = con.createStatement();

			System.out.println(query);

			// execute insert SQL stetement
			statement.executeUpdate(query);

			System.out.println("Record is inserted into DBUSER table!");

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

      

    }                  
    }
    
		
               
    

