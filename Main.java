import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int belcone=1000;
        int choies;
        while (true){
            System.out.println(" \n ------the bank system------ ");
            System.out.println(" 1. show the money");
            System.out.println("2. Deposit money");
            System.out.println("3. witharaw money");
            System.out.println("4. exit from the program");
            System.out.print("enter the number: ");
            choies= in.nextInt();

            if(choies==1){
                System.out.println(belcone);
            }else if(choies==2){
                int accont;
                System.out.print("enter your money:");
                accont= in.nextInt();
                belcone+=accont;
                System.out.println(belcone);
            }else if(choies==3){
                int number;
                System.out.print("enter the number: ");
                number= in.nextInt();
                belcone-=number;
                System.out.println(belcone);
            }else if(choies==4){
                System.out.println("thank you for join us ");
            }
        }

    }
}




