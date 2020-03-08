package operations;

import java.sql.*;
public class Update {
    
int id;
double balance;

Update(int id, double balance){

    this.id = id;
    this.balance = balance; 
}

  public void update()
  {
    try
    {
      
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "root");
    
      // create the java mysql update preparedstatement
      String query = "update info set balance = ? where id = ?";
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setDouble   (1, balance);
      preparedStmt.setInt   (2, id);
     
      preparedStmt.executeUpdate();
      
      conn.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
  }
}

