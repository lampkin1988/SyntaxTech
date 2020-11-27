package com.syntax.class14;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

//Accept username and password. Confirm from user and check following requirements: 

//1. Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.

//2. Password should be minimum 8 characters, if less → message=”Password is too short”.
//3. Password cannot contain username if so, → message=”Password cannot contain username”.
//4.Password should match confirmed password, if not  → message=“Passwords do not match”. Only after all requirements met → message “Your username and password has been created”

		/*String username;
		String password;
		String confirmedPassword;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter username");
		username = scanner.nextLine();
		System.out.println("Please enter password");
		password = scanner.nextLine();
		System.out.println("Confirm password");
		confirmedPassword = scanner.next();

		if (username.isEmpty() || password.isEmpty()) {
			System.out.println("The username and password can't be empyty");
		} else {
			if (password.length() < 8) {
				System.out.println("Password is too short");
			} else {
				if (password.contains(username)) {
					System.out.println("Password cannot contain username");
				} else {
					if (!password.equals(confirmedPassword)) {
						System.out.println("Password does not match");
					} else {
						System.out.println("Your username and password has been created!");
					}
				}

			}
		}
	}
}*/
		
		String username;
        String password;
        String confirmedPassword;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter username");
        username = scanner.nextLine();
        System.out.println("Please Enter password");
        password = scanner.nextLine();
        System.out.println("Confirm password");
        confirmedPassword = scanner.next();
        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("username and password can't be empty");
        } else {
            if (password.length() < 8) {
                System.out.println("Password is too short");
            } else {
                if (password.contains(username)) {
                    System.out.println("Password cannot contain username");
                } else {
                    if (!password.equals(confirmedPassword)) {
                        System.out.println("Passwords do not match");
                    } else {
                        System.out.println("Your username and password has been created");
                    }
                }
            }
        }
    }
}