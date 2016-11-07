
public class convertToRoman {

	String romanNumeralString = "";
	int[] arabicValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	String[] romanValues = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	
	public String convert(Integer num) {
		for	(int i = 0; i < arabicValues.length; i++){
			while (num >= arabicValues[i]) {
				num = num - arabicValues[i];
				romanNumeralString = romanNumeralString + romanValues[i];
			}
		}
		return romanNumeralString;
	}
	
}
