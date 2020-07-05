package machine;

public class ActualCoffeeMachine {

    private int numWater;
    private int numMilk;
    private int numCoffeeBeans;
    private int numDisposableCups;
    private int numMoney;

    public ActualCoffeeMachine() {
        this.numWater = 400;
        this.numMilk = 540;
        this.numCoffeeBeans = 120;
        this.numDisposableCups = 9;
        this.numMoney = 550;
    }

    public void printStatus() {
        System.out.println("This Coffee machine has: \n" +
                this.numWater + " of water\n" +
                this.numMilk + " of milk\n" +
                this.numCoffeeBeans + " of coffee beans\n" +
                this.numDisposableCups + " of disposable cups\n" +
                this.numMoney + " of money");
    }

    public void fill(int extraWater,int extraMilk, int extraCoffeeBeans, int extraDisposableCups) {
        this.numWater += extraWater;
        this.numMilk += extraMilk;
        this.numCoffeeBeans += extraCoffeeBeans;
        this.numDisposableCups += extraDisposableCups;
    }

    public void buy(int lessWater, int lessMilk, int lessCoffeeBeans, int lessDisposableCups, int extraMoney) {

        if(checkResource(lessWater,lessMilk,lessCoffeeBeans,lessDisposableCups)) {
            this.numWater -= lessWater;
            this.numMilk -= lessMilk;
            this.numCoffeeBeans -= lessCoffeeBeans;
            this.numDisposableCups -= lessDisposableCups;
            this.numMoney += extraMoney;
        }
    }

    public int take(){
        int result = this.numMoney;
        this.numMoney = 0;

        return result;
    }

    public boolean checkResource(int lessWater, int lessMilk, int lessCoffeeBeans, int lessDisposableCups) {
        if(this.numWater < lessWater){
            System.out.println("Sorry, not enough water!");
            return false;
        }

        if(this.numMilk < lessMilk){
            System.out.println("Sorry, not enough milk!");
            return false;
        }

        if(this.numCoffeeBeans < lessCoffeeBeans){
            System.out.println("Sorry, not enough coffee beans!");
            return false;
        }

        if(this.numDisposableCups < lessDisposableCups){
            System.out.println("Sorry, not enough disposable cups!");
            return false;
        }
        return true;
    }

}
