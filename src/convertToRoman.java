
public class convertToRoman {

	String romanNumeralString = "";
	
	public String convert(Integer num) {
		while (num >= 1000) {
			num = num - 1000;
			romanNumeralString = romanNumeralString + "M";
		}
		while (num >= 900) {
			num = num - 900;
			romanNumeralString = romanNumeralString + "CM";
		}
		while (num >= 500) {
			num = num - 500;
			romanNumeralString = romanNumeralString + "D";
		}
		while (num >= 400) {
			num = num - 400;
			romanNumeralString = romanNumeralString + "CD";
		}
		while (num >= 100) {
			num = num - 100;
			romanNumeralString = romanNumeralString + "C";
		}
		while (num >= 90) {
			num = num - 90;
			romanNumeralString = romanNumeralString + "XC";
		}
		while (num >= 50) {
			num = num - 50;
			romanNumeralString = romanNumeralString + "L";
		}
		while (num >= 40) {
			num = num - 40;
			romanNumeralString = romanNumeralString + "XL";
		}
		while (num >= 10) {
			num = num - 10;
			romanNumeralString = romanNumeralString + "X";
		}
		while (num >= 9) {
			num = num - 9;
			romanNumeralString = romanNumeralString + "IX";
		}
		while (num >= 5) {
			num = num - 5;
			romanNumeralString = romanNumeralString + "V";
		}
		while (num >= 4) {
			num = num - 4;
			romanNumeralString = romanNumeralString + "IV";
		}
		while (num > 0) {
			num = num - 1;
			romanNumeralString = romanNumeralString + "I";
		}
		return romanNumeralString;
	}
	
}
