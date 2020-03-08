package operations;

import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;


public class Delete {
    
    int id;
    
    Delete (int id){
        this.id = id;
    }
   
  public void delete()
  {
    try
    {
    
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "root");
      
     
      String query = "delete from info where id = ?";
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setInt(1, id);

      // execute the preparedstatement
      preparedStmt.execute();
      
      conn.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }

  }
}
