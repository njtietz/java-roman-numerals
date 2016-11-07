import static org.junit.Assert.*;

import org.junit.Test;

public class testConvertToRomanTest {

	@Test
	public void whenConverterIsPassedAOneItReturnsAnI() {
		convertToRoman convertToRoman =  new convertToRoman();
		assertEquals("I", convertToRoman.convert(1));
	}
	
	@Test
	public void whenConverterIsPassedAThreeItReturnsIII() {
		convertToRoman convertToRoman =  new convertToRoman();
		assertEquals("III", convertToRoman.convert(3));
	}
	
	@Test
	public void whenConverterIsPassedANineItReturnsIX(){
		convertToRoman convertToRoman =  new convertToRoman();
		assertEquals("IX", convertToRoman.convert(9));
	}
	
	@Test
	public void whenCOnverterIsPassedOneThousandSixtySixItReturnsMLXVI(){
		convertToRoman convertToRoman =  new convertToRoman();
		assertEquals("MLXVI", convertToRoman.convert(1066));
	}
	
	@Test
	public void whenCOnverterIsPassedOneThousandNineHundredEightyNineItReturnsMCMLXXXIX(){
		convertToRoman convertToRoman =  new convertToRoman();
		assertEquals("MCMLXXXIX", convertToRoman.convert(1989));
	}
}
