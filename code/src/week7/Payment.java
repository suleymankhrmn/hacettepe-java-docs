package week7;

import week5.Order;


import java.util.Date;

public abstract class Payment {
    private Order order;
    private int installment;
    private boolean delay;
    private Date paymentDate;
    private Date createdDate;

    public Payment(Order order, int installment, boolean delay) {
        this.order = order;
        this.installment = installment;
        this.delay = delay;
        this.createdDate = new Date();
    }

    public abstract void pay();
    public abstract void rollbackPay();

    public Order getOrder() {
        return order;
    }

    public int getInstallment() {
        return installment;
    }

    public boolean isDelay() {
        return delay;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setPaymentDate(){
        Date currentDate = new Date();
        paymentDate = currentDate;
    }
    double getAmount() {
        Order order = getOrder();
        final double amount = order.getAmount();
        return amount;
    }

    void setPaymentStatus(boolean status){
        order.paymentStatus = status;
    }
}
