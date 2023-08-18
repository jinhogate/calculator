package calculatortestprojet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class ExecuteMethodTest {

	/**
	 * Use with moderation
	 *
	 * @throws InterruptedException
	 */
	@Test
	@Timeout(1)
	void testExecuteMethodShouldNotExceedOneSecond() throws InterruptedException {
		Calculator.executeMethod();
	}

}
