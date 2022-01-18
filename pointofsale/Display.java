package com.pointofsale;


public class Display {
    public static void main(String[] args) {
        while (PointOfSale.isActive()) {
            System.out.println("Type in product name to scan or \"quit\" to finish scanning: ");
            PointOfSale.scan();
        }
    }
}
