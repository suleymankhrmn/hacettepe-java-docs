package week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Order>  orderList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Order order1 = new Order("ONLINE", 4);
        Order order2 = new Order("SHOPE", 2);
        Order order3 = new Order("WAREHOUSE",7);
        Order order4 = new Order("ONLINE", 6);
        Order order5 = new Order("SHOPE", 5);
        Order order6 = new Order("WAREHOUSE",9);


        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        orderList.add(order4);
        orderList.add(order5);
        orderList.add(order6);

        boolean loopValue = true;

        while (loopValue) {


            System.out.println("please select ops: 1.List");
            System.out.println(" 2.Add Order");

            String str = scanner.nextLine();
            Integer answer = Integer.valueOf(str);

            switch (answer) {
                case 1:
                    showList(orderList);
                    break;
                case 2:
                    System.out.println("Starting Add Value OP");
                    String type = checkAndGetValue("type");
                    String count_str = checkAndGetValue("count");
                    Integer count = Integer.valueOf(count_str);
                    Order order = new Order(type, count);
                    add(order);
                    break;
                case 3:
                    System.out.println("Exit App");
                    loopValue = false;
                    

            }
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

    public static void add(Order order){
        orderList.add(order);
    }

    public static String checkAndGetValue(String variableName){
        String strValue = "";
        String typeVariableName = "type";
        if(typeVariableName.equals(variableName)){
            OrderType[] orderTypes = OrderType.values();

                boolean result = false;
                do {
                    System.out.println("pls write type value");
                    strValue = scanner.nextLine();
                    for (OrderType orderType : orderTypes){
                        boolean equals = orderType.getStrValue().equals(strValue);
                        if(equals){
                            result = equals;
                            strValue = orderType.name();
                            break;
                        }
                    }

                }while (!result);


        }else {
            boolean result = false;

            do {
                System.out.println("pls write count value");
                strValue = scanner.nextLine();
                Integer value = Integer.valueOf(strValue);
                result = value > 0 && value < 100;
            }while (!result);

        }
        return strValue;
    }


}
