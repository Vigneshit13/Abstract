import java.io.*;
import java.net.*;
import java.util.*;
public class Client1
{
  public static void main(String[] args) throws Exception
  {
     Socket s = new Socket("127.0.0.1", 3000);
	Scanner sc =new Scanner(System.in);
     	PrintWriter pw = new PrintWriter(s.getOutputStream());
     	BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	System.out.println("Start the Chat and Naasama Po..");

     String receiveMessage, sendMessage;               
     while(true)
     {
        sendMessage = sc.nextLine(); 
        pw.println(sendMessage);      
        pw.flush();                   
        if((receiveMessage = br.readLine()) != null) 
        {
            System.out.println(receiveMessage); 
        }         
      }               
    }                    
}                        