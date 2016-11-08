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

}
