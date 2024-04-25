public class calculoDeInteres {
    public static void main (String[] args){

        double amount = 1000;
        int years = 10;
        double annualInterest = 0.05;
        double totalAmount, annualProfit;

        System.out.println("Vamos a calcular el interes compuesto de un monto de " + amount + " a un interes del " + (annualInterest*100) + "% durante " + years +  " años");

        for(int cont=1 ; cont <= years ; cont++){

            annualProfit = amount * annualInterest;
            totalAmount = amount + annualProfit;
            amount = totalAmount;

            System.out.println("El monto de el año " + cont + " es de " + totalAmount);

        }
    }
}
