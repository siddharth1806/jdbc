import java.sql.*;
import sun.jdbc.odbc.*;
class acccon
{
public static void main(String arg[])
{
new JdbcOdbcDriver();
try
{

Connection con=DriverManager.getConnection("jdbc:odbc:exam");
System.out.println("success");
Statement st=con.createStatement();

ResultSet s=st.executeQuery("select * from detail");
while(s.next())
{
System.out.println(s.getInt(1)+","+s.getString(2)+","+s.getInt(3));
}
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}}
