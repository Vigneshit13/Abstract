import java.io.*;
import java.net.*;
import java.util.*;
public class Server1
{
  public static void main(String[] args) throws Exception
  {
      ServerSocket ss = new ServerSocket(3000);
      System.out.println("Server  ready....");
      Socket s = ss.accept( );                          
        Scanner sc=new Scanner(System.in);
	PrintWriter pw = new PrintWriter(s.getOutputStream());																					
	BufferedReader receiveRead = new BufferedReader(new InputStreamReader(s.getInputStream()));

      String receiveMessage, sendMessage;               
      while(true)
      {
        if((receiveMessage = receiveRead.readLine()) != null)  
        {
           System.out.println("Client:"+receiveMessage);         
        }         
        sendMessage = sc.nextLine(); 
        pw.println("Server:"+sendMessage);             
        pw.flush();
      }               
    }                    
}                        