package week5;

import java.util.UUID;

import static week5.OrderType.*;

public class Order {
    /*private final String ONLINE = "ONLINE";
    private final String SHOPE = "SHOPE";
    private final String WAREHOUSE = "WAREHOUSE";*/


    private final double price_online = 5400.13;
    private final double price_shope = 5600.13;
    private final double price_warehouse = 5200.13;

    private String type;
    private double amount;
    private String orderNo;
    private int count;

    public Order(String type , int count) {
        this.type = type;
        this.orderNo = UUID.randomUUID().toString();
        this.count = count;
        calculateAmount(type, count);
    }

    private void calculateAmount(String type, int count) {
        if (SHOPE.name().equals(type)){
            this.amount = count * price_shope;
        } else if (WAREHOUSE.name().equals(type)) {
            this.amount = count * price_warehouse;
        } else if (ONLINE.name().equals(type)) {
            this.amount = count * price_online;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (ONLINE.equals(type) || SHOPE.equals(type) || WAREHOUSE.equals(type)){
            this.type = type;
            calculateAmount(type, this.count);
        }else {
            System.out.println("type value can not set");
        }
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount > 0){
            this.amount = amount;
        }
    }

    public String getOrderNo() {
        return orderNo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Order No: " + this.orderNo + " Order Count: " + this.count + " Order Amount: " + this.amount;
    }
}
