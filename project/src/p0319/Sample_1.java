package p0319;

import ScIf.Sc;

class KeyAndAccount {

	private static String Account;
	private static String Key;
	private static String Adm;
	private static String AdmKey;

	public static String getAdm() {
		return Adm;
	}

	public static void setAdm(String adm) {
		Adm = adm;
	}

	public static String getAdmKey() {
		return AdmKey;
	}

	public static void setAdmKey(String admKey) {
		AdmKey = admKey;
	}

	public String getAccount() {
		return Account;
	}

	public void setAccount(String account) {
		Account = account;
	}

	public String getKey() {
		return Key;
	}

	public void setKey(String key) {
		Key = key;
	}

	static {
		Account = "Account";
		Key = "Key";
		Adm = "Adm";
		AdmKey = "AdmKey";
	}
}

class Adm {
}

class User {
}

public class Sample_1 {
	static int howManyTimes = 3;

	static int logIn() {
		for (int i = 0; i < howManyTimes; i++) {
			System.out.println("Please enter your acconut");
			String account = Sc.nextString();
			System.out.println("Please enter your password");
			String key = Sc.nextString();
			KeyAndAccount kaa = new KeyAndAccount();
			String trueAccount = kaa.getAccount();
			String trueKey = kaa.getKey();
			String admAccount = kaa.getAdm();
			String admKey = kaa.getAdmKey();
			if (account.equals(trueAccount) && key.equals(trueKey)) {
				System.out.println("Login Succesfully ");
				return 1;
			} else if (account.equals(admAccount) && key.equals(admKey)) {
				System.out.println("Adm login Succesfully ");
				return 2;
			} else if (i == howManyTimes - 1) {
				System.out.println("Fail " + i + " times. Account locked");
				return 0;

			} else {
				System.out.println("Wrong account or password.");
				if (howManyTimes - i >= 2)
					System.out.println("Remain: " + (howManyTimes - i) + " times");
				else
					System.out.println("Remain: " + (howManyTimes - i) + " time");
			}
		}
		return 0;
	}

	public static void main(String[] args) {

		int i = Sample_1.logIn();
	
		switch (i) {
		case 0:
			break;
		case 1:
			User u = new User();
			break;
		case 2:
			Adm a = new Adm();
			break;
		}

	}

}
