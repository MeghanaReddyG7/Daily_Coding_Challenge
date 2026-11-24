
import java.util.*;
public class cal {
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int a=sc.nextInt();
        System.out.println("Enter number: ");
        int b=sc.nextInt();
        System.out.println("Enter operation: "+ "1-addition, 2-subtraction, 3- multiplication, 4- Division");
        int op=sc.nextInt();
        switch(op){
            case 1:  System.out.println(a+b);
                    break;
            case 2: System.out.println(a-b);
                    break;
            case 3: System.out.println(a*b);
                    break;
            case 4: if(b==0)
                    System.out.println("In division b cannot be zero");
                    else
                        System.out.println(a/b);
                    break;
        }
        sc.close();
    }

}
