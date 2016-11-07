import static org.junit.Assert.*;

import org.junit.Test;

public class testConvertToRomanTest {

	@Test
	public void whenConverterIsPassedAOneItReturnsAnI() {
		convertToRoman convertToRoman =  new convertToRoman();
		assertEquals("I", convertToRoman.convert(1));
	}
	
}
