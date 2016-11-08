
public class convertToArabic {

	int arabicValue = 0;
	int[] arabicValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	String[] romanValues = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	
	public Integer convert(String num) {
		while (num.length() > 0) {
			num = num.substring(romanValues[12].length());
			arabicValue = arabicValue + arabicValues[12];
		}
		return arabicValue;
	}

}
