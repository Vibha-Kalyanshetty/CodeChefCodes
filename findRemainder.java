import java.util.*;

class findRemainder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            int num3=num1%num2;
            System.out.println(num3);
        }
        
    }
}
