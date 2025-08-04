import java.util.*;
class NxNPattern{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			for(itn j=0;j<n;j++){
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}