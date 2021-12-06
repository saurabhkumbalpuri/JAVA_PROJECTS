  import java.sql.*;
public class JDBCSample {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Connection con = null;
        Statement stmt= null;
        ResultSet rs = null;
        try{  
            Class.forName("com.mysql.jdbc.Driver");// step1: load driver  
            con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/test","root","root");  // Step 2 : get the connection
              
             stmt=con.createStatement(); // Step 3: from connection object will get statement object 
            stmt.executeUpdate("insert into emp values(2,'Harshada1',31)"); //step 4: execute query with statement object
            
             rs=stmt.executeQuery("select * from emp");  
            while(rs.next())  
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
            
            }catch(Exception e){ System.out.println(e);}
        finally {
            try {
                if(con !=null) {
                con.close();
                }
                if(stmt !=null) {
                stmt.close();
                }
                if(rs != null) {
                rs.close();
                }
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
            }
    
    }

 