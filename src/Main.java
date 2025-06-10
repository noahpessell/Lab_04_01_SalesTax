//Start
//	OUTPUT “What is the dollar price of your purchase?”
//	INPUT purchasePrice
//	salesTax = purchasePrice * 0.05
//	OUTPUT “The 5% sales tax for your purchase is ” + salesTax
//Stop
public class Main
{
    public static void main(String[] args)
    {
        double salesTax = 0.05;
        double purchasePrice = 23.49;
        double taxCost = 0;
        System.out.println("What is the dollar price of your purchase?"); //input would normally go after this
        taxCost = purchasePrice * salesTax;
        System.out.println("The cost of tax on your $" + purchasePrice + " item is $" + taxCost);
    }
}