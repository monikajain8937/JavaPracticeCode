package JavaPrograms;

public class allJavaProgram {

	public static void main(String[] args) {
		//*******Name in Short form*******
//		
//		String name= "Anant kumar Hooda";
//		String f[]= name.split(" ");
//		int len= f.length;
//		for (int i=0; i<2; i++) {
//			System.out.print(f[i].charAt(0)+".");
//		}
//		System.out.print(f[len-1]);
		
		//*******Reverse of String*******
//		String s= "mynameisMonika";
//		int len= s.length();
//		String rvr= "";
//		for (int i=len-1;i>=0;i--)
//		{
//			rvr= rvr+s.charAt(i);
//		}
//		System.out.println(rvr);
		
		//*******Reverse words of String*******
//		int i;
//		String s = "hello world";
//        String reverse = "", ans = "";
//		String[] s1 = s.split(" ");
//		for (i = s1.length - 1; i >= 0; i--) {
//			ans += s1[i] + " ";
//		}
// 
//		int len = ans.length();
//		for (int j = len - 1; j >= 0; j--) {
//			reverse = reverse + ans.charAt(j);
//		}
//		System.out.println(reverse);
		
//		***************Upper and Lower char in String****************
		
//		String s= "MoNiKaJaIn";
//		String upper= "";
//		String lower= "";
//		for(int i=0;i<s.length();i++) {
//			char ch= s.charAt(i);
//			if(ch>=65&& ch<=90) {
//				upper= upper+ch;
//			}
//			else {
//				lower= lower+ch;
//			}
//			
//		}
//		System.out.println(lower);
//		System.out.println(upper);
		
//	*******************Count of Upper & lower char in String******************************
//		int lower= 0;
//		int upper= 0;
//		for (int i=0; i<s.length();i++){
//			char ch= s.charAt(i);
//			if(ch>=65 && ch<=90) {
//				upper++;
//			}
//			else {
//				lower++;
//			}
//		}
//		System.out.println(lower);
//		System.out.println(upper);
		
		// ***** check string is PALINDROME *****//
		 
//		String str1="", str="eye";
//		int i,j;
//		
//		for(i=(str.length()-1);i>=0;i--) {
//			str1=str1+str.charAt(i);
//			//System.out.println(str2);
//		}
//		if(str1.equals(str)) {
//			System.out.println("its palindrome");
//		}
//		else {
//			System.out.println("not palindrome");
		
	/////******* concat using StringBuffer ******/////
		
//			String str ="Neha";
//			StringBuffer str1=new StringBuffer(str);
//			str1.append(" Bharti");
//			System.out.println(str1);
					
			
			/////***** reverse String using StringBuffer ****/////
//			
//			String str="hello world";
//			StringBuilder str1=new StringBuilder(str);
//			str1.reverse();
//			System.out.println(str1);
		
		//SumOfFirst10AdjacentNumbers 
		     
//		        int sum = 0;
//		        for (int i = 1; i <= 10; i++) {
//		            sum = sum ^ i;
//		        }
//		        System.out.println("The sum of the first 10 adjacent numbers is: " + sum);
		
		// ***** String ANAGRAMS using ArraySort*****//
		 
//		String str1 = "race"; // aecr
//		String str2 = "care"; // aecr
//		char[] ana1 = str1.toCharArray();
//		char[] ana2 = str2.toCharArray();
//		if (str1.length() == str2.length()) {
//			Arrays.sort(ana1);
//			Arrays.sort(ana2);
//			boolean status = Arrays.equals(ana1, ana2);
//			if (status) {
//				System.out.println("anagram");
//			} else {
//				System.out.println("not anagram");
//			}
//		} else {
//			System.out.println("not anagram");
//		}
		
		// ***** check string is PALINDROME *****//
		 
//		String str1="", str="eye";
//		int i,j;
//		
//		for(i=(str.length()-1);i>=0;i--) {
//			str1=str1+str.charAt(i);
//			//System.out.println(str2);
//		}
//		if(str1.equals(str)) {
//			System.out.println("its palindrome");
//		}
//		else {
//			System.out.println("not palindrome");
//		}
		//*********************************************
		
//		int i =121;
//		int r;
//		int temp;
//		int sum=0;
//		temp=i;//111
//		while (i>0) {
//			r=i%10;
//			sum= (sum*10)+r;
//			i=i/10;
//		}
//			if (temp==sum) {
//				System.out.println("True");
//			}
//			else {
//				System.out.println("false");
//			}
		    
		//**********************************
//		String fullName= "Neha Bharti Saxena";
//				String fn[]=fullName.split(" ");
//				int len=fn.length;
//				int i;
//				for( i=0;i<2;i++) {
//					System.out.print(fn[i].charAt(0)+".");
//					}
//					System.out.print(fn[len-1]);
		//****************************************
		
//				int i;
//				String s = "hello world";
//		               String reverse = "", ans = "";
//				String[] s1 = s.split(" ");
//				for (i = s1.length - 1; i >= 0; i--) {
//					ans += s1[i] + " ";
//				}
//		 
//				int len = ans.length();
//		 
//				for (int j = len - 1; j >= 0; j--) {
//					reverse = reverse + ans.charAt(j);
//				}
//				System.out.println(reverse);
			
	
		
		
		String str = "selenium";
		int i, j, count;
		char String[] = str.toCharArray();// [s] [e]
		for (i = 0; i < String.length; i++) {
			count = 1;
			for (j = i + 1; j < String.length; j++) {
				if (String[i] == String[j]) {
					count++;
					String[j] = 0;
				}
			}
			if (count > 1 && String[i] != 0) {
				System.out.println(String[i]);
			}
			}
//		}
	}
}

