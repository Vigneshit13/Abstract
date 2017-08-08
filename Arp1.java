import java.io.*;
import java.net.*;
import java.util.*;
class Arp1
{
 public static void main(String args[])
 {
 try
 {
 ServerSocket obj=new ServerSocket(120);
 Socket obj1=obj.accept();
 while(true)
 {
 DataInputStream din=new DataInputStream(obj1.getInputStream());
 DataOutputStream dout=new DataOutputStream(obj1.getOutputStream());
 String str=din.readLine();
 String ip[]={"172.165.90.80","172.165.89.1"};
 String mac[]={"6A:08:AA:C3","8A:BC:E3:FA"};
 for(int i=0;i<ip.length;i++)
 {
 if(str.equals(ip[i]))
 {
 dout.writeBytes(mac[i]+'\n');
break;
 }
 }
 obj.close();
 }

 }
 catch(Exception e)
 {
 System.out.println(e);
 }
 }
}
