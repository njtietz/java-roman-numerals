import static org.junit.Assert.*;

import org.junit.Test;

public class testConvertToArabic {

	@Test
	public void whenConverterIsPassedAnIItReturnsAOne() {
		convertToArabic convertToArabic =  new convertToArabic();
		assertTrue(1 == convertToArabic.convert("I"));
	}
	
	@Test
	public void whenConverterIsPassedIIIItReturnsThree() {
		convertToArabic convertToArabic =  new convertToArabic();
		assertTrue(3 == convertToArabic.convert("III"));
	}

	@Test
	public void whenConverterIsPassedIXItReturnsANine() {
		convertToArabic convertToArabic =  new convertToArabic();
		assertTrue(9 == convertToArabic.convert("IX"));
	}
	
	@Test
	public void whenConverterIsPassedMLXVIItReturnsOneThousandSixtySix() {
		convertToArabic convertToArabic =  new convertToArabic();
		assertTrue(1066 == convertToArabic.convert("MLXVI"));
	}
	
	@Test
	public void whenConverterIsPassedMCMLXXXIXItReturnsOneThousandNineHundredEightyNine() {
		convertToArabic convertToArabic =  new convertToArabic();
		assertTrue(1989 == convertToArabic.convert("MCMLXXXIX"));
	}
}
