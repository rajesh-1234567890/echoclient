import java.io.*; 
import java.net.*; 
import java.util.*;
public class echoclient {
public static void main(String args[])throws Exception {
Socket c=null; 
DataInputStream usr_inp=null;
DataInputStream din=new DataInputStream(System.in); 
DataOutputStream dout=null;
try
{
c=new Socket("127.0.0.1",5678);
usr_inp=new DataInputStream(c.getInputStream());
 dout=new DataOutputStream(c.getOutputStream());
}
catch(IOException e) {
}
if(c!=null || usr_inp!=null || dout!=null)
{
String unip; while((unip=din.readLine())!=null)
{
dout.writeBytes(""+unip);
dout.writeBytes("\n"); 
System.out.println("\n the echoed message");
System.out.println(usr_inp.readLine());
System.out.println("\n enter your message");
}
System.exit(0);
}
din.close(); usr_inp.close(); c.close();
}
}
