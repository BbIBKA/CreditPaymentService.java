public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double result = service.calculate(9.99, 1000000, 24);
        System.out.println(result);
    }
}
