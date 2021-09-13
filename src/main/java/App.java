/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 zain yousaffuentes
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        float []prices = new float[3];
        float []quantities = new float[3];

        float subtotal = 0.0f, tax = 0.0f, total = 0.0f;

        final float TAX_RATE = 0.055f;


        for (int x = 0; x < 3; x++) {

            System.out.println(String.format("Enter the price of item %d: ", x + 1));
            String inputPrice = s.nextLine();
            prices[x] = Integer.parseInt(inputPrice);

            System.out.println(String.format("Enter the quantity of item %d: ", x + 1));
            String inputQuantity = s.nextLine();
            quantities[x] = Integer.parseInt(inputQuantity);

            subtotal += prices[x] * quantities[x];

        };

        tax = TAX_RATE * subtotal;
        total = subtotal + tax;

        System.out.println(String.format("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f", subtotal, tax, total));

    }
}
