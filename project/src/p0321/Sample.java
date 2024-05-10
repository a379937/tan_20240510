package p0321;

import java.util.HashMap;
import java.util.Map;

import ScIf.Sc;

public class Sample {
	public static void main(String[] args) {
		//new Login().getUser();
		while (true) {
			try {
				Login l = new Login();
				if (l.is_Adm()) {
					while (true) {
						System.out.println("Enter 1 to get user data;\n2 to change adm data"
								+ ";\nelse to log out");
						String s = Sc.nextString();
						if (s.equals("1")) {
							l.getUser();
						} else if (s.equals("2")) {
							System.out.println("Enter new name and password");
							l.change(Sc.nextString(), Sc.nextString());
						} else {
							l.Logout();
						}
					}
				}
				System.out.println("User using ... end");
			} catch (LogOut e) {
				System.out.println("catch log out");
			}

		}

	}
}

class Login {
	private static Map<String, String> user = new HashMap<>();
	private static Map<String, String> adm = new HashMap<>();
	private static boolean isAdm = false;

	static {
		adm.put("adm", "pass");
		String[] usernames = { "a", "b", "c", "d", "e" };
		String[] passwords = { "aa", "bb", "cc", "dd", "ee" };
		int i = 0;
		for (String s : usernames) {
			user.put(s, passwords[i]);
			i++;
		}
	}

	Login() throws LogOut {
		while (true) {
			System.out.println("Enter uesr name and password");
			String s1 = Sc.nextString();
			String s2 = Sc.nextString();

			if (adm.containsKey(s1) && s2.equals(adm.get(s1))) {
				System.out.println("adm login");
				isAdm = true;
				break;
			}

			boolean b1 = user.containsKey(s1);
			boolean b2 = false;
			if (b1) {
				b2 = user.get(s1).equals(s2);
			}
			if (b1 && !b2) {
				System.out.println("Wrong password.You have 3 times to try password");
				for (int i = 0; i < 3; i++) {
					if (Sc.nextString().equals(user.get(s1))) {
						b2 = true;
						break;
					} else
						System.out.println("Wrong password");
				}
				if (!b2)
					System.out.println("Fail");
			}
			if (b1 && b2) {
				System.out.println("Login successfully");
				break;
			}
			if (!b1)
				System.out.println("User name doesn't exist");
		}
		if (isAdm) {
			System.out.println("Enter [ in ] to start");
			if (!Sc.nextString().equals("in"))
				Logout();
		}
	}

	void Logout() throws LogOut {
		System.out.println("Log out");
		isAdm = false;
		throw new LogOut();
	}

	boolean is_Adm() {

		return isAdm;
	}

	void getUser() {
		if (!isAdm) {
			System.out.println("ILLEGAL OPTION");
		} else {
			for (Map.Entry<String, String> e : user.entrySet()) {
				System.out.println(e.getKey() + " : " + e.getValue());
			}
		}
	}

	void change(String s1, String s2) {
		if (!isAdm) {
			System.out.println("ILLEGAL OPTION");
		} else {
			if (user.containsKey(s1)) {
				System.out.println("The name is used.Try again");
			} else {
				adm.clear();
				adm.put(s1, s2);
				System.out.println("Changed successfully");
			}
		}
	}
}

class LogOut extends Exception {
}

