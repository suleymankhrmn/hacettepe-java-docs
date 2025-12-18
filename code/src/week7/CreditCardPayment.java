package week7;

import week5.Order;

import java.util.Date;

public class CreditCardPayment extends Payment {
    private String cardNo;


    public CreditCardPayment(Order order, int installment, boolean delay, String cardNo) {
        super(order, installment, delay);
        this.cardNo = cardNo;
    }

    @Override
    public void pay() {
        final double amount = getAmount();
        System.out.println("Garanti Pay started");
        String url = Constant.PAY_URL_GARANTIPAY_API;

        System.out.println("GarantiPay Request INFO username:" + Constant.USERNAME_GARANTIPAY_API +
                " password:" + Constant.PASSWORD_GARANTIPAY_API);
        System.out.println("Payment is successful amount: " + amount);
        setPaymentStatus(true);
        setPaymentDate();
    }

    @Override
    public void rollbackPay() {

    }
}
