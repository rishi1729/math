import java.util.*;
public class multi_harshad2
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=in.nextInt();
        int n1=num,n2=num,mod=0,s=0;
        for(int i=n1;i>=10;i=n1)
        {
            for(int j=n2;j>0;j=n2)
            {
                mod=n2%10;
                s=s+mod;
                n2=n2/10;
            }
            if(n1%s==0)
            {
               
            n2=n1/s;
            n1=n2;
            s=0;
           
        }
        else
        {
            
        break;
    }
        }
    if(n1<10)
    System.out.println("It is multiple harshad number");
    else
    System.out.println("Not a multiple number");
    }
}