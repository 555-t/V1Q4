/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package v1q4;

import java.util.Scanner;
public class V1Q4 {
    public static void main(String[] args) {
        
        double price=0;//running total 
        int pizza=0,drink=0,dessert=0;
        
        Scanner g = new Scanner (System.in);//for choosing in main menu 
        int choice;
        Scanner p = new Scanner (System.in);//for choosing in sub menu
        int pick ;
        
        do{
        System.out.println("Welcome to Maroni's Pizza!");
        System.out.println("1. Pizza");
        System.out.println("2. Drinks");
        System.out.println("3. Dessert");
        System.out.println("CHECKOUT\n");
        System.out.print("Pick an option: ");
        choice = g.nextInt();
        System.out.println("");  
       
          if(choice==1){
              
              do {
                System.out.println("PIZZA");
                System.out.println("1 Chicken Peperoni - RM5");
                System.out.println("2 Chicken Supreme - RM18");
                System.out.println("3 Vegan Indulgence - RM12");
                System.out.println("4 Beef Delight - RM22");
                System.out.println("5 Margherita - RM9");
                System.out.println("6 BACK TO MAIN MENU\n");
                System.out.print("Pick an option: ");
                pick = p.nextInt();
                
                switch (pick){
                    case 1:
                        price+=5;
                        System.out.println("Added Chicken Peperoni");
                        pizza+=1;
                        break;
                    case 2:
                        price+=18;
                        System.out.println("Added Chicken Supreme");
                        pizza+=1;
                        break;
                    case 3:
                        price+=12;
                        System.out.println("Added Vegan Indulgence");
                        pizza+=1;
                        break;
                    case 4:
                        price+=22;
                        System.out.println("Added Beef Delight");
                        pizza+=1;
                        break;
                    case 5: 
                        price+=9;
                        System.out.println("Added Margherita");
                        pizza+=1;
                        break;
                    case 6:
                        break;
                }
                  System.out.println("Current total : "+price);
                  System.out.println("");
              }while(pick!=6);
          }
          
          else if(choice==2){
              do {
            System.out.println("DRINKS");
            System.out.println("1 Strawberry Smoothie - RM8");
            System.out.println("2 Banana Smoothie - RM8");
            System.out.println("3 Mocktail - RM12");
            System.out.println("4 Soft Drink - RM5");
            System.out.println("5 Mineral Water - RM3");
            System.out.println("6 BACK TO MAIN MENU\n");
            System.out.print("Pick an option: ");  
                pick = p.nextInt();
                switch (pick){
                    case 1:
                        price+=8;
                        System.out.println("Added Strawberry Smoothie");
                        drink+=1;
                        break;
                    case 2:
                        price+=8;
                        System.out.println("Added Banana Smoothie");
                        drink+=1;
                        break;
                    case 3:
                        price+=12;
                        System.out.println("Added Mocktail");
                        drink+=1;
                        break;
                    case 4:
                        price+=5;
                        System.out.println("Added Soft Drink");
                        drink+=1;
                        break;
                    case 5:
                        price+=3;
                        System.out.println("Added Mineral Water");
                        drink+=1;
                        break;
                    case 6:
                        break;
                }System.out.println("Current total : RM"+price); 
                 System.out.println("");
              }while(pick!=6);
            }
          else if(choice==3){
              do{
            System.out.println("DESSERT");
            System.out.println("1 Tiramisu - RM7");
            System.out.println("2 Strawberry Shortcake - RM10");
            System.out.println("3 Green Jello - RM15");
            System.out.println("4 Creme Brulee - RM15");
            System.out.println("5 Raspberry Pie - RM20");
            System.out.println("6 BACK TO MAIN MENU\n");
            System.out.print("Pick an option: ");
            
            pick = p.nextInt();
                switch (pick){
                    case 1:
                        price+=7;
                        System.out.println("Added Tiramisu");
                        dessert+=1;
                        break;
                    case 2:
                        price+=10;
                        System.out.println("Added Strawberry Shortcake");
                        dessert+=1;
                        break;
                    case 3:
                        price+=15;
                        System.out.println("Added Green Jello");
                        dessert+=1;
                        break;
                    case 4:
                        price+=15;
                        System.out.println("Added Creme Brulee");
                        dessert+=1;
                        break;
                    case 5:
                        price+=20;
                        System.out.println("Added Raspberry Pie");
                        dessert+=1;
                        break;
                    case 6:
                        break;
                }System.out.println("Current total : RM"+price);  
                 System.out.println("");
              }while(pick!=6);
          }
          
          else if(choice==4){
              if(pizza==0||drink==0||dessert==0){
                System.out.println("Your total is RM"+price+"!");
                System.out.println("Have a nice day!");
                break;
              }
              else
                System.out.println("Your total is RM"+price+"!");
                System.out.println("You've availed the One-of-each offer. You get a 20% discount!");
                System.out.printf("Your new total is RM%4.2f",price*0.8);
                System.out.print("!");
                System.out.println("");
                System.out.println("\nHave a nice day!");  
          }
          
          else
              System.out.println("Error. Try again.");
          
        }while(choice!=4);//program ends when user selects 4/CHECKOUT
    }
   
   }