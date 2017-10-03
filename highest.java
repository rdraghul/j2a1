import java.util.Scanner;

public class highest {
   public static void main(String s[])
   {
	    double n1, n2, n3;

	    System.out.print("Enter three numbers: ");
	    Scanner sc = new Scanner(System.in);
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
	    if (n1>=n2)
	    {
	        if(n1>=n3)
	        	System.out.print(" the largest number : "+ n1);
	        else
	        	System.out.print(" the largest number:"+ n3);
	    }
	    else
	    {
	        if(n2>=n3)
	        	System.out.print(" the largest number:"+ n2);
	        else
	        	System.out.print(" the largest number:"+n3);
	    }
   }
}
