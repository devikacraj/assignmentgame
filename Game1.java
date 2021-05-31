package pattern;
import java.util.Random;
import java.util.Scanner;
public class Game1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch=0;
		
		do
			{
			   System.out.println("Enter the game to play\n");
		       System.out.println("1.missingword1\n"+"2.Jumble1\n");
		ch=sc.nextInt();
		
		   switch(ch)
		   {
		   case 1:
			  // missingword();
			   missingword();
			   break;
		   case 2:
			   jumble();
			   break;
		   }
			   
		   }while(ch!=3);

	}

	public static void jumble()
	{
		 {
	    	 Scanner sc = new Scanner(System.in);
	    	 Random rand = new Random();
	     	
	    	int count=0;
	    	String[] arr = {"arbtsmy","ackblinkp","igangbb","velvetred","upersiunior"};
	    	String[] brr = {"btsarmy","blackpink","bigbang","redvelvet","superjunior"};
	    	for(int i=0;i<arr.length;i++)
	    	{
	    		int sel = rand.nextInt(arr.length);
	    		System.out.println("jumbled word is:"+arr[sel]);
	    		System.out.println("enter the correct word");
	    		String w1=sc.nextLine();
	    		if(w1.equalsIgnoreCase(brr[i]))
	    		{
	    			count++;
	    			System.out.println("correct "+ brr[i]);
	    			count=count+1;
	    		}
	    	}
	    	System.out.println("the total score is "+ count +" out of 5");
	   	    
	    }

	}
	
	public static void missingword()
	{Scanner sc = new Scanner(System.in);
	Random random = new Random();
	int count = 0;
	String[] wordList = { "arbtsmy","ackblinkp","igangbb","velvetred","upersiunior" };
	for (int i = 0; i < wordList.length; i++) {
		String s = wordList[i];
		int n1 = random.nextInt(s.length());
		int n2 = random.nextInt(s.length());
		int n3 = random.nextInt(s.length());
		int n4 = random.nextInt(s.length());
		for (int j = 0; j < s.length(); j++) {
			int lenOfWord = s.length();
			if (lenOfWord <= 4 || lenOfWord < 10 && lenOfWord >= 4 || lenOfWord >= 10) {
				if (j == n1 || j == n2 || j == n3 || j == n4) {
					System.out.print("*");
				} else {
					System.out.print(s.charAt(j));
				}

			}
		}
		System.out.println();
		System.out.println("Write the correct word");
		String str1 = sc.nextLine();
		if (s.equals(str1)) {
			count++;
		}
	}
	System.out.println("Total score is :" + count+"out of 5");
	    }

	}
