package week7;

import week5.Order;

import java.util.Date;

public class GiftPayment extends Payment{
    // add giftcardNo
    public GiftPayment(Order order) {
        super(order, 0, false);
    }

    @Override
    public void pay() {
        final double amount = getAmount();
        System.out.println("Gift payment is starting");
        System.out.println("Gift payment certificate validation is successful");
        System.out.println("Gift Payment is successful amount: " + amount);
        setPaymentStatus(true);
        setPaymentDate();
    }



    @Override
    public void rollbackPay() {

    }
}
