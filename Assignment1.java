//kshitij sahu
//Rollno-->2215000952
import java.util.*;
public class Assignment1{
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = ob.nextInt();
        if (a % 6 == 0) {
            if (a % 7 == 0)
                System.out.println("YES");
        } 
        else
            System.out.println("NO");
}
}

