package utils;

import java.security.SecureRandom;

public class PasswordGenerator {

	private static SecureRandom random;

	private final static String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private final static String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	private final static String specialCharacters = "!@#$%^&*";
	private final static String numbers = "1234567890";
	private final static String dictionary = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;

	public static String generateRandomPassword() {

		random = new SecureRandom();

		String result = "";

		for (int i = 0; i < 12; i++) {
			int index = random.nextInt(dictionary.length());
			result += dictionary.charAt(index);
		}

		return result;
	}

}
