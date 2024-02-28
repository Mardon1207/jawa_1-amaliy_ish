import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner oby=new Scanner(System.in);
        double x=oby.nextDouble();
        double y=oby.nextDouble();
        double z=Math.pow(x,3)-2.5*x*y+1.78*Math.pow(x,2)-12.5*y+1;
        System.out.print(z);
            }
}
