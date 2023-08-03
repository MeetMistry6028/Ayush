import java.util.Scanner;

class calculator
{
    public static void main(String args[])
    {
        int c,a,b,ans;
        boolean r=true;
        Scanner sc= new Scanner(System.in);

        do{
        System.out.println("Enter n1=");
        a = sc.nextInt();

        System.out.println("Enter n2=");
        b = sc.nextInt();

        System.out.println("choice... \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Divison \n");
        System.out.println("Enter your choice=");
        c = sc.nextInt();

        switch(c)
        {
            case 1:
                ans = a + b;
                System.out.println("Ans= "+ans);
                break;

            case 2:
                ans = a - b;
                System.out.println("Ans= "+ans);
                break;

            case 3:
                ans = a * b;
                System.out.println("Ans= "+ans);
                break;

            case 4:
                ans = a / b;
                System.out.println("Ans= "+ans);
                break;

            default:
            System.out.println("Enter appropriate choice");
        }

            System.out.println("do u want to continue(true/false)??");
            r = sc.nextBoolean();
        }while(r);
    }
}