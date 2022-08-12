public class CreditPaymentService {
    public static double calculate(double interestRate, int loanAmount, int creditPeriod) {         //процентная ставка, сумма кредита, срок кредита в месяцах//
        double monthPayment;                                            //ежемесячный платеж//
        double monthIr = interestRate / 1200;                           //расчет месячной ставки//
        double annuPayment = monthIr * Math.pow(1 + monthIr, creditPeriod) / (Math.pow(1 + monthIr, creditPeriod) - 1);  //аннуитетный платеж//
        monthPayment = loanAmount * annuPayment;    //финальный расчет ежемесячного платежа//
        return Math.round(monthPayment);
    }

}

