import java.util.*;

class EvenOddSum{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        int result = findEvenOddSum(n1,n2,n3,n4);
        System.out.println(result);
    }

    public static int findEvenOddSum(int n1, int n2, int n3, int n4){

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        int sum1 = 0, sum2 = 0, finalSum = 0;
        while(n1>0){
            int r = n1%10;
            if(r%2==0){
                even.add(r);
            }else{
                odd.add(r);
            }
            n1/=10;
        }

        while(n2>0){
            int r = n2%10;
            if(r%2==0){
                even.add(r);
            }else{
                odd.add(r);
            }
            n2/=10;
        }

        while(n3>0){
            int r = n3%10;
            if(r%2==0){
                even.add(r);
            }else{
                odd.add(r);
            }
            n3/=10;
        }

        for(int e:even){
            sum1+=e;
        }
        for(int o:odd){
            sum2+=o;
        }
        if(n4%2==0){
            finalSum = sum1-sum2;
        }else{
            finalSum = sum2-sum1;
        }
        return finalSum;
    }
}