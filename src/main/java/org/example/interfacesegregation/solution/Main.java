package org.example.interfacesegregation.solution;

public class Main {
    public static void main(String[] args) {
        OrderBurgerService orderBurgerService = new OrderBurgerService();
        orderBurgerService.orderBurger(2);
    }
}
