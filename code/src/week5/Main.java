package week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("ONLINE", 4);
        Order order2 = new Order("SHOPE", 2);
        Order order3 = new Order("WAREHOUSE",7);
        Order order4 = new Order("ONLINE", 6);
        Order order5 = new Order("SHOPE", 5);
        Order order6 = new Order("WAREHOUSE",9);

        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        orderList.add(order4);
        orderList.add(order5);
        orderList.add(order6);

        System.out.println("please select ops: 1.List");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Integer answer = Integer.valueOf(str);

        switch (answer){
            case 1:
                showList(orderList);
                
        }


    }

    public static void showList(List<Order> orders){
        for (Order order : orders){
            System.out.println(order.toString());
        }

        /**
         for (int i = 0; i < orders.size() - 1; i++) {
            Order order = orders.get(i);
        }
         **/
    }


}
