
public class convertToArabic {

	int arabicValue = 0;
	int[] arabicValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	String[] romanValues = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	
	public Integer convert(String num) {
		while (!num.equals("")) {
			for	(int i = 0; i < romanValues.length; i++){
				if (num.length() >= romanValues[i].length()){
					if (romanValues[i].equals(num.substring(0, romanValues[i].length()))){
						num = num.substring(romanValues[i].length());
						arabicValue = arabicValue + arabicValues[i];
					}
				}
			}
		}
		return arabicValue;
	}

}
