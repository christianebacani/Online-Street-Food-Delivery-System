// Online Delivery Street Food Shop
// Created by Christiane A. Bacani

import java.util.Scanner;
public class StreetFoodsShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price[] = {5.0,5.0,5.0,1.0,1.5,8.0,5.0};
        boolean sell = true;
        int total = 0;
        System.out.print("Bacani`s Street Food Online Delivery Shop!\n");
        System.out.print("Username : ");
        String username = input.nextLine();
        
        System.out.print("Password : ");
        String password = input.nextLine();
        
        while(sell){
        System.out.print("\tAVAILABLE FOODS\n");
        System.out.print("FOODS\t\tPRICE\n");
        System.out.print("1.) Isaw\t\tP 5\n");
        System.out.print("2.) Betamax\t\tP 5\n");
        System.out.print("3.) Hotdog\t\tP 5\n");
        System.out.print("4.) Eggball\t\tP 1");
        System.out.print("5.) Fishball\t\tP 1.5");
        System.out.print("6.) Barbeque\t\tP 8");
        System.out.print("7.) Calamares\t\tP 5");
        System.out.print("Enter your order here : ");
        int order = input.nextInt();
        
        System.out.print("Enter quantity : ");
        int quantity = input.nextInt();
        
        total += price[order - 1] * quantity;
        
        System.out.print("Do you want to order more? (y/n) : ");
        String buyMore = input.nextLine();
        
        if(buyMore.equalsIgnoreCase("n")){
            sell = false;
            System.out.print("The total price is : P " + total + "\n");
            
            System.out.print("Enter your payment here : P ");
            int payment = input.nextInt();
            
            int change = payment - total;
            System.out.print("Change : P " + change + "\n");
            System.out.print("\n\nYOUR ORDER IS ON THE WAY!\n");
            
            
        }
        
        }
        
    }
}
