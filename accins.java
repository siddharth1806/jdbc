
import java.sql.*;
import java.io.*;
import sun.jdbc.odbc.*;
class accins
{
public static void main(String arg[])
{
new JdbcOdbcDriver();
try
{
int r; String n; int p;
System.out.print("Enter roll no,name & per");
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
r=Integer.parseInt(br.readLine());
n=br.readLine();
p=Integer.parseInt(br.readLine());

Connection con=DriverManager.getConnection("jdbc:odbc:exam");
System.out.println("success");
Statement st=con.createStatement();
st.executeUpdate("insert into detail values('"+r+"','"+n+"','"+p+"')");
con.close();
}
catch(Exception e)
{
System.out.println("record inserted");
}
}}