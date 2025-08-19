import java.util.*;
import java.lang.*;
class SumofPrimeASCII{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ascii = 0;
        int sum = 0;

        StringBuilder sb = new StringBuilder();
        for(char ch:s.toCharArray()){
            ascii =(int)ch;
            if(isPrime(ascii)) {
                sb.append(ch);
                sum+=ascii;
            }
        }
        if(sb.length()>0){
            System.out.println(sb.toString()+":"+sum);
        }else{
            
        System.out.println(s.charAt(0)+":"+s.charAt(s.length()-1));
        }
    }
    public static boolean isPrime(int n){
        if(n<2) return false;
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
        }
        return count==2;
    }
}