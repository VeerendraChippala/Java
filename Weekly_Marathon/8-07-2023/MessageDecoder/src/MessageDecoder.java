/*Secret Message Decoder
 *You are a software engineer at a secret spy agency. The agency often receives 
 *secret messages encoded in Unicode. Your task is to build a method that accepts 
 *a character and displays its Unicode, helping the agents decode the messages 
 *quickly and efficiently.*/

import java.util.Scanner;

class Msg{
	static int decode(char c) {
		 int a=c;
		 return a;
	}
}
public  class MessageDecoder {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char c=scan.next().charAt(0);
		System.out.println(Msg.decode(c));
		scan.close();
	}
}
