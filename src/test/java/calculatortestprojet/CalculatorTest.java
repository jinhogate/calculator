package calculatortestprojet;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeAll
	static void beforeAllTest() {
		System.out.println("Test occure once and before all test");
	}

	@AfterAll
	static void afterAllTest() {
		System.out.println("Test occure once and after all test");
	}

	@BeforeEach
	void beforeEachTest() {
		System.out.println("Test occure before each test");
	}

	@AfterEach
	void afterEachTest() {
		System.out.println("Test occure after each test");
	}

	@Test
	@DisplayName("test Add 2 and 2 should Return 4")
	void testAdd2and2shouldReturn4() {
		System.out.println("Test - testAdd2and2shouldReturn4");
		// Arrange
		var a = 2;
		var b = 2;

		// Act
		Calculator calculator = new Calculator();
		var resAdd = calculator.addTwoPositivesNumbers(a, b);

		// Assert
//		Assertions.assertEquals(4, resAdd, "2 + 2 devrait retourner 4");
		org.assertj.core.api.Assertions.assertThat(resAdd).isEqualTo(4);
	}

	@Test
	@DisplayName("test Add 3 and 4 should Return 7")
	void testAdd3and4ShouldReturn7() {
		System.out.println("Test - testAdd3and4ShouldReturn7");
		// Arrange
		var a = 3;
		var b = 4;

		// Act
		Calculator calculator = new Calculator();
		var resAdd = calculator.addTwoPositivesNumbers(a, b);

		// Assert
//		Assertions.assertEquals(7, resAdd);
		org.assertj.core.api.Assertions.assertThat(resAdd).isEqualTo(7);
	}

}
