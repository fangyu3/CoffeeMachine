package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        ActualCoffeeMachine coffeeMachine = new ActualCoffeeMachine();

        Scanner scanner = new Scanner(System.in);

        String option = "";

        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");

            option = scanner.nextLine();

            switch (option) {
                case "buy":
                    buy(coffeeMachine);
                    break;
                case "fill":
                    fill(coffeeMachine);
                    break;
                case "take":
                    System.out.println("I gave you $" + coffeeMachine.take());
                    break;
                case "remaining":
                    coffeeMachine.printStatus();
                    break;
                case "exit":
                    break;
            }
        }
        while(!option.equals("exit"));

    }

    public static void buy(ActualCoffeeMachine coffeeMachine){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String option = scanner.nextLine();

        switch(option){
            case "1":
                coffeeMachine.buy(250,0,16,1,4);
                break;
            case "2":
                coffeeMachine.buy(350,75,20,1,7);
                break;
            case "3":
                coffeeMachine.buy(200,100,12,1,6);
                break;
            case "back":
                break;
        }
    }

    public static void fill(ActualCoffeeMachine coffeeMachine){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        int numWater = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Write how many ml of milk do you want to add:");
        int numMilk = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Write how many grams of coffeebeans do you want to add:");
        int numCoffeeBeans = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int numDisposableCups = scanner.nextInt();
        scanner.nextLine();

        coffeeMachine.fill(numWater,numMilk,numCoffeeBeans,numDisposableCups);
    }
}
