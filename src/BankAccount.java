publlic class BankAccount
{
    publlic static void main(String[] args){

        double myBank = 2175.37;
        myBank = myBank-302.50;
        myBank = myBank+50.03;
        myBank = (myBank/2)+20;
        myBank = myBank-1;
        myBank = myBank*2;
        myBank = myBank+1;

        myBank = Math.round(myBank * 100.0) / 100.0;
        System.out.println(String.format("%.2f", myBank));

    }
}
