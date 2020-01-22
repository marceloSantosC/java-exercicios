package services;

public interface paymentService {
	double paymentFee(double amount);
	double interest(double amount, int intallments);
}
