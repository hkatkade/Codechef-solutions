import java.util.*;
class Solution{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            if(360%n==0)
            {
                System.out.print("y"+" ");
            }
            else
            System.out.print("n"+" ");
            
            if(n<=360)
            System.out.print("y"+" ");
            else
            System.out.print("n"+" ");
            
            if((n*(n+1)/2)<=360)
            System.out.println("y"+" ");
            else
            System.out.println("n"+" ");
            
            t--;
        }
    }
}