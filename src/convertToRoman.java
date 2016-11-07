
public class convertToRoman {

	String romanNumeralString = "";
	
	public String convert(Integer num) {
		while (num >= 9) {
			num = num - 9;
			romanNumeralString = romanNumeralString + "IX";
		}
		while (num > 0) {
			num = num - 1;
			romanNumeralString = romanNumeralString + "I";
		}
		return romanNumeralString;
	}
	
}
