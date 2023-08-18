package calculatortestprojet;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class CalculatorParameterizedTest {

	private StringUtilis stringUtilis;
	private Calculator calculator;

	@BeforeEach
	void beforeEachTest() {
		this.stringUtilis = new StringUtilis();
		this.calculator = new Calculator();
	}

	@AfterEach
	void afterEachTest() {
		this.stringUtilis = null;
		this.calculator = null;
	}

	@ParameterizedTest(name = "{0} should be KOSSI")
	@ValueSource(strings = { "Kossi", "KossI", "kOssi" })
	void testGetUpperCaseShouldReturnAlwaysUpperCase(String word) {
//		Assertions.assertEquals("KOSSI", this.stringUtilis.getUpperCase(word));
		org.assertj.core.api.Assertions.assertThat(this.stringUtilis.getUpperCase(word)).isEqualTo("KOSSI");
	}

	@ParameterizedTest(name = "{0} + {1} should be {2}")
	@CsvSource({ "2,3,5", "4,3,7", "8,15,23" })
	void testAddTwoNumbersShouldReturnTheirSum(int number1, int number2, int result) {
//		Assertions.assertEquals(result, this.calculator.addTwoPositivesNumbers(number1, number2));
		org.assertj.core.api.Assertions.assertThat(this.calculator.addTwoPositivesNumbers(number1, number2))
				.isEqualTo(result);
	}

}
