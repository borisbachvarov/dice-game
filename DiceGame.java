import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Eneter three numbers between 1 and 6>");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if ( num1 < 1 || num2 < 1 || num3 < 1){
            System.out.println("Numbers cannot be less than 1! Shutting game down!");
            System.exit(0);
        } 
        if (num1 > 6 || num2 > 6 || num3 > 6){
            System.out.println("Numbers cannot be higher than 6! Shutting game down!");
            System.exit(0);
        }

        int numSum = num1 + num2 + num3;
        int sumRolls = roll1 + roll2 + roll3;
        System.out.println("Dice sum = " + sumRolls + ". Number sum = " + numSum);

        if (checkWin(numSum, sumRolls)){
            System.out.println("Congrats!!! You WIN!!!");
        } else {
            System.out.println("Sorry! You lose!!! :(");
        }

        scan.close();
    }
    public static int rollDice(){
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int)randomNumber;
    }
    public static boolean checkWin (int numSum, int sumRolls) {
        return (numSum > sumRolls && numSum - sumRolls < 3);
    }
}
