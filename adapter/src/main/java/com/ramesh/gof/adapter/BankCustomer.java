package com.ramesh.gof.adapter;

//This is the adapter class  

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard {
	public void giveBankDetails() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Digite o nome do cliente :");
			String cliente = br.readLine();
			System.out.print("\n");

			System.out.print("Digite o número da conta:");
			long numeroConta = Long.parseLong(br.readLine());
			System.out.print("\n");

			System.out.print("Digite o nome do banco:");
			String nomeBanco = br.readLine();

			setAccHolderName(cliente);
			setAccNumber(numeroConta);
			setBankName(nomeBanco);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getCreditCard() {
		long accno = getAccNumber();
		String accholdername = getAccHolderName();
		String bname = getBankName();

		return ("Número da conta " + accno + " do " + accholdername + " no banco " + bname);
	}
}// End of the BankCustomer class.