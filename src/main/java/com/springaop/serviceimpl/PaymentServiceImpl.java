package com.springaop.serviceimpl;

import com.springaop.service.PaymentService;

public class PaymentServiceImpl implements PaymentService {

	@Override
	public void makePayment() {
		
		System.out.println("Amount Debited from your account...");
		
		// performing payment related task
		
		System.out.println("Amount Created to another account...");
		
	}

	@Override
	public void getBalance(long accountNo) {
		
		System.out.println("Fetching balance for account no : " + accountNo);
		
		int i = 10/0;
		
	}

}
