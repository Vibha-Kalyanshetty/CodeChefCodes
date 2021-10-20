import java.util.*;

class firstAndLast{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            int fD =0;
            int lD = num%10;
            while(num!=0){
                fD = num%10;
                num/=10;
            }
            sum=fD+lD;
            System.out.println(sum);
        }
        
    }
}

