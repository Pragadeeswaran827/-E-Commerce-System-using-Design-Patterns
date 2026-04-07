class Order {
    private PaymentStrategy payment;

    public Order(PaymentStrategy payment) {
        this.payment = payment;
    }

    public void checkout(int amount) {
        payment.pay(amount);
    }
}