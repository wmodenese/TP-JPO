package hello;

import org.junit.Test;
import org.junit.Before;

import static org.assertj.core.api.Assertions.*;

public class RomanNumberConverterTest{
	RomanNumberConverter romanNumberConverter;
	
	@Before
	public void setup() {
		romanNumberConverter = new RomanNumberConverter();
	}
	
	@Test
	public void check() {
		assertThat(romanNumberConverter.convert("MDCLXVI"))
		  .isEqualTo(1666);
	}
	
	@Test
	public void check_soustra(){
		assertThat(romanNumberConverter.convert("IV"))
			.isEqualTo(4);
		assertThat(romanNumberConverter.convert("IX"))
			.isEqualTo(9);
		assertThat(romanNumberConverter.convert("XL"))
			.isEqualTo(40);
		assertThat(romanNumberConverter.convert("LXXXIX"))
			.isEqualTo(89);
		assertThat(romanNumberConverter.convert("XLIX"))
			.isEqualTo(49);
		assertThat(romanNumberConverter.convert("IL"))
			.isEqualTo(49);
	}
}
