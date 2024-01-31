import java.util.Scanner;
class req
{
	req()
	{
		String cont = new String();
		Scanner obj = new Scanner(System.in);
		System.out.println("<----What you want to Ask me----> ");
		cont= obj.nextLine().toLowerCase(); 
		String que1 = "Hi everyone my name is JARVIS. I am MR. Khan's Assitant. Thank you :)";
		String msg = "Text are left to forget :(";
		if (cont.equals("exit"))
		{
			
			try{
				for(char c:msg.toCharArray() ){
					System.out.print(c);
					Thread.sleep(200);
				}
				System.out.println();
			}
			catch (InterruptedException e) {
					e.printStackTrace();

			}
			
		}
		else if (cont.equals("introduce yourself"))
		{
			try{
				for(char c : que1.toCharArray()){
				System.out.print(c);
				Thread.sleep(200);
				}
			System.out.println();
			}
			
			catch (InterruptedException e){
				e.printStackTrace();
			}
			
		
		}
		else 
		{
			System.out.println("Why are you here!");
			
		} 
	
	}
}





class message
{
	public static void main(String [] args)
	{
		char choice;
		Scanner inp = new Scanner(System.in);
		do{
		req s = new req();
		System.out.println("Do you want to Continue? Y/N");
		choice = inp.next().charAt(0);
		}while (Character.toUpperCase(choice)== 'Y' | Character.toLowerCase(choice) == 'y');	
	}
}