import java.util.*;
class ReverseOfString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		System.out.println(sb.toString());

		//Another method
		String reversed = "";
		for(int i = s.length() -1;i>=0;i--){
			reversed+=i;
		}
		System.out.println(reversed);
	}
}