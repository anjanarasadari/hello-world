import java.util.*;
class Bitwise{
public static String IntToBinary(int n){
   
   String str1="";
   String str2="";
   while(n>0){
     int mod=n%2;
     char c=(char)(mod+'0');
     str1 += c;
     n=n/2;
   } 
for(int j=0;j<str1.length();j++){
   str2+=str1.charAt(str1.length()-1-j);
}
while(str2.length()<4){
	str2="0"+str2;
	
}
  return (str2);
 }
 
public static void Display(String s){
	for(int i=0;i<s.length();i++){
		char ch=s.charAt(s.length()-1-i);
		
		int y=(int)(ch-48);
		System.out.print ("digit"+" "+(i+1)+" "+y+"\n");
		
		}
	}

public static void display_output(String s[]){
		for(int i=0;i<s[0].length();i++){
			char ch0 =s[0].charAt(s[0].length()-1-i);
			char ch1 =s[1].charAt(s[1].length()-1-i);
			// char ch2 =s[2].charAt(s[2].length()-1-i);
			
			int y0 =(int)(ch0-48);
			int y1 =(int)(ch1-48);
			int y2 = y0 * y1;

			System.out.print ("digit"+(i+1)+" "+y0+" "+y1+" "+y2+"\n");
		
		}
}

public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.print("Number 1: ");
int num1=sc.nextInt();
System.out.print("Number 2: ");
int num2=sc.nextInt();

String s1=IntToBinary(num1);
// System.out.println(s1);

String s2=IntToBinary(num2);

String s [] = {s1, s2};

display_output(s);
/*System.out.println(s2);

Display(s1);
System.out.println();
Display(s2);*/



}

}
