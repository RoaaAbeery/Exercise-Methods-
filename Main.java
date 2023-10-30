import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Q1
//        Scanner s = new Scanner(System.in);
//        System.out.println("please enter the number 1");
//        int num1 = s.nextInt();
//        System.out.println("please enter the number 2");
//        int num2 = s.nextInt();
//        System.out.println("please enter the number 3");
//        int num3 = s.nextInt();
//        small(num1,num2,num3);
//        Q2
//                Scanner s2 = new Scanner(System.in);
//        System.out.println("please enter the number ");
//        int num = s2.nextInt();
//       check(num);
        Scanner s3 = new Scanner(System.in);
        System.out.println("1. A password must have at least eight characters. ");
        System.out.println("2. A password consists of only letters and digits");
        System.out.println("3. A password must contain at least two digits ");
        System.out.println("Input a password (You are agreeing to the above Terms and Conditions.):");
         String pass = s3.nextLine();
psw(pass);

    }
//    public static int small(int num1,int num2,int num3){
//if (num1<num2&&num1<num3){
//    System.out.println("The smallest value is"+ num1);
//        return num1;}
//else if (num2<num1&&num2<num3) {
//    System.out.println("The smallest value is"+ num2);
//            return num2;
//}
//else System.out.printf("The smallest value is"+ num3);
//return num3;
//    }
//public static int  check(int num){
// if (num>0){
//     System.out.println("Number is Positive");
//
// } else if (num<0) {
//     System.out.println("Number is Negative");
// }
//else {
//     System.out.println("Number is Zero ");
//        }
//return num;
//}
//    Q3
public static String psw(String pass){
        if(pass.length()<8){
            System.out.println("invalid password:must have at least eight characters");
        }
         if(!pass.matches("[a-zA-Z0-9]+")){
             System.out.println("invalid password :consists of only letters and digits ");
         }
      if(!pass.matches(".*[0-9].*[0-9].*")){
          System.out.println("invalid password:must contain at least two digits");
      }
             else System.out.printf("Password is valid:"+pass);
return pass;
}

}