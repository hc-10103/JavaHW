import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        int answer;
        double amount;
        BankAccount b1 = new BankAccount("abc", 1000);

        
        Scanner sc = new Scanner(System.in);
        while (true) { 
            System.out.println("1 : deposit / 2 : withdraw / 3 : stop");
            answer = sc.nextInt();
            if (answer == 3) System.exit(0);
            
            if (answer == 1) {
                System.out.println("How many do you want to deposit?");
                amount = sc.nextDouble();
                b1.deposit(amount);

            }

            else if(answer == 2) {
                System.out.println("How many do you want to withdraw?");
                amount = sc.nextDouble();
                b1.withdraw(amount);
            }

            System.out.println("Your Balance is " + b1.getBalance() + " now");

        }
    
    
    }
}