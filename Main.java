import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Q1)Write a Java method to find the smallest number among three
        //numbers.
        System.out.println("please Enter there numbers to find the smallest: ");
        System.out.print("Enter first number:");
        double num1= input.nextDouble();
        System.out.print("Enter second number:");
        double num2= input.nextDouble();
        System.out.print("Enter third number:");
        double num3= input.nextDouble();
        System.out.println("The smallest number is: "+ smallest(num1,num2,num3));
        System.out.println("    ********     ");
        //Q2)Write a Java method that check if the entered number is negative or
        //positive or zero.
        System.out.println("Enter number to check negative,positive,zero :");
        int num= input.nextInt();
        System.out.println("The number "+num+ " is "+ check(num));
        System.out.println("    ********     ");
        //Q3)Write a Java method to check whether a string is a valid password.
        //Password rules:
        input.nextLine();
        System.out.println("1. A password must have at least eight characters.                                          \n" +
                "2. A password consists of only letters and digits.                                          \n" +
                "3. A password must contain at least two digits  ");
        System.out.print("Enter your strong password: ");
        String password=input.nextLine();

        password=checkPass(password);
        System.out.println("Password is valid: "+password);





    }//end main


    public static double smallest(double n1,double n2,double n3){
        double smallest=n1;
        if(n2<n1 && n2<n3)smallest=n2;
        if(n3<n1 && n3<n2)smallest=n3;
        return smallest;
    }

    public static String check(int num){
        if(num==0)
            return "zero";
        if(num<0)
            return "negative";
        else return "positive";
    }


    public static String checkPass(String pass) {
        Scanner in = new Scanner(System.in);
        String temp_pass = pass;

        while (temp_pass.length() < 8) {
            System.out.println("Password must have at least 8 characters. \nPlease enter a new password:");
            temp_pass = in.nextLine();
        }

        while (true) {
            if (temp_pass.matches("[a-zA-Z0-9]+")) {
                break;
            }else{
            System.out.println("A password consists of only letters and digits.\nPlease enter a new password:");
            temp_pass = in.nextLine();}
        }

        while (true) {
            int digits = 0;
            for (int i = 0; i < temp_pass.length(); i++) {
                char ch = temp_pass.charAt(i);
                if (ch >= '0' && ch <= '9') {
                    digits++;
                }
            }
            if (digits >= 2) {
                break;
            }else{
            System.out.println("A password must contain at least two digits.\nPlease enter a new password:");
            temp_pass = in.nextLine();}
        }
        return temp_pass;
    }
}





