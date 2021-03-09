import java.util.*;
public class multi_harshad
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        int n2=n,n3=n;
        int m=0,s=0;
        while(n3>=10)
        {
        while(n2>0)
        {
            m=n2%10;
            s=s+m;
            n2=n2/10;
        }
       if(n3%s==0)
       {
        n2=n3/s;
        n3=n2;
        s=0;
          }
    else
    {
    System.out.println("Not a multiple harshad number");
    break;
}
}
     if(n3<10)
        System.out.println("It is multiple harshad number");
    }
}