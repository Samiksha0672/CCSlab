import java.util.Scanner;
public class Assignment3DH {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the prime number:");
        int p = sc.nextInt();

        System.out.println("Enter the valid primitive root of prime number:");
        int g = sc.nextInt();

        int a=4;
        int b=3;

        int YA = (int) Math.pow(g, a)%p;  
        int YB = (int) Math.pow(g, b)%p;  
        

        System.out.println("1st user public key (YA): " + YA);
        System.out.println("2nd user public key (YB): " + YB);

        int KA = (int) Math.pow(YB, a) % p;
        System.out.println("1st user computed shared key (Ka): " + KA);

        
        int KB = (int) Math.pow(YA, b) % p;
        System.out.println("2nd user computed shared key (Kb): " + KB);
        System.out.println("Shared key is:"+KA);
        }

       
}






        

