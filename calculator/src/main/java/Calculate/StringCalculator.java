/**
 * 
 */
package Calculate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mitali
 *
 */
public class StringCalculator {
	
	public static final int emptystringthemethodwillreturn0(final String numbers) {
		String[] numbersArray = numbers.split(",");
		if (numbersArray.length > 2) {
			throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
		} else {
			for (String number : numbersArray) {
				if (!number.isEmpty()) {
					Integer.parseInt(number);
				}
			}
		}
		return 0; 
	}

	public static final long methodcantake01or2numbersseparatedbycomma(String numbers) {
		String[] numbersArray = numbers.split(",");
		if (numbersArray.length > 2) {
			System.out.println("Up to 2 numbers separated by comma (,) are allowed");
		} else {
			for (String number : numbersArray) {
				Integer.parseInt(number);
			}

		}
		return 0;
	}

	public static final long Methodwilreturntheirsumofnumbers(String numbers1) {
		int returnValue = 0;
		String[] numbersArray1 = numbers1.split(",");

		for (String number : numbersArray1) {
			if (!number.trim().isEmpty()) {
				returnValue += Integer.parseInt(number);
			}

			//return returnValue;
		}
		return returnValue;

	}

	public static int AllowtheAddmethodtohandleanunknownamountofnumbers(final String numbers) {
		int returnValue = 0;
		String[] numbersArray = numbers.split(",");
		
		for (String number : numbersArray) {
			if (!number.trim().isEmpty()) { 
				returnValue += Integer.parseInt(number);
			}
		}
		return returnValue;
	}

	public static int tohandlenewlinebetweennumbers(final String numbers) {
		int returnValue = 0;
		String[] numbersArray = numbers.split(",|n");
		for (String number : numbersArray) {
			if (!number.trim().isEmpty()) {
				returnValue += Integer.parseInt(number.trim());
			}
		}
		return returnValue;
	}

	
	static int whenNegativeNumbersAreUsedThenRuntimeExceptionIsThrown(final String numbers) {
		int returnValue = 0;
		String[] numbersArray = numbers.split(numbers);
		List negativeNumbers = new ArrayList();
		for (String number : numbersArray) {
			if (!number.trim().isEmpty()) {
				int numberInt = Integer.parseInt(number.trim());
				if (numberInt < 0) {
					negativeNumbers.add(numberInt);
				}
				returnValue += numberInt;
			}
		}
		if (negativeNumbers.size() > 0) {
			throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
		}
		return returnValue;
	}

	static int Numbersbiggertha1000shouldbeignored(final String numbers) {
		int returnValue = 0;
		String[] numbersArray = numbers.split(numbers);
		List negativeNumbers = new ArrayList();
		for (String number : numbersArray) {
			if (!number.trim().isEmpty()) {
				int numberInt = Integer.parseInt(number.trim());
				if (numberInt < 0) {
					negativeNumbers.add(numberInt);
				} else if (numberInt <= 1000) {
					returnValue += numberInt;
				}
			}
		}
		if (negativeNumbers.size() > 0) {
			throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
		}
		return returnValue;
	}

	public static int Supportdifferentdelimiters(final String numbers) {
		String delimiter = ",|n";
		String numbersWithoutDelimiter = numbers;
		if (numbers.startsWith("//")) {
			int delimiterIndex = numbers.indexOf("//") + 2;
			delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
			numbersWithoutDelimiter = numbers.substring(numbers.indexOf("n") + 1);
		}
		return Supportdifferentdelimiters1(numbersWithoutDelimiter, delimiter);
	}

	private static int Supportdifferentdelimiters1(final String numbers, final String delimiter) {
		int returnValue = 0;
		String[] numbersArray = numbers.split(delimiter);
		for (String number : numbersArray) {
			if (!number.trim().isEmpty()) {
				returnValue += Integer.parseInt(number.trim());
			}
		}
		return returnValue;
	}
}
