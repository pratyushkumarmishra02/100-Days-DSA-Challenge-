import java.util.*;

class FindFreqKeyFromLast{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result = findFreqKeyFromLast(arr,n);
        System.out.println(result);
    }
    public static int findFreqKeyFromLast(int []arr,int n){
        //only positive integer
        int res = 0;
        boolean isPositive = false;
        Set<Integer> set = new HashSet<>();
        for(int i=n-1;i>=0;i--){
            int x =arr[i];
            if(x>0){
                isPositive = true;
                if(set.contains(x)){
                    return x;
                }
                set.add(x);
                res=x;
            }
        }
        if(!isPositive){
            return 0;
        }
        return res;
    }
}