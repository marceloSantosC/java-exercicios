package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {
	@SuppressWarnings("unused")
	private paymentService onlinePaymentService;
	
	public ContractService(paymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int intallments) {
		double basicQuota = contract.getTotalValue() / intallments;
        for (int i = 1; i <= intallments; i++) {
            Date date = addMonth(contract.getDate(), i);
            double updatedQuota = basicQuota;
            double fullQuota =  updatedQuota;
            contract.addInstallment(new Installment(date, fullQuota));
        }
	}
	
	private Date addMonth(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
	
}
