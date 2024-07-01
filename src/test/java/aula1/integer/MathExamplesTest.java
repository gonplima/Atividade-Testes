package aula1.integer;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.jupiter.api.Test;

class MathExamplesTest {
	
	@Test
	void testAdd( ) {

	assertEquals(8,MathExamples.add(5,3));

	}

	@Test
	void testSubtract( ) {

	assertEquals(2,MathExamples.sub(5,3));

	}

	@Test
	void testMultiply() {

	assertEquals(15,MathExamples.mult(5,3));

	}

	@Test
	void testDivide( ) {

	assertEquals(4,MathExamples.div(8,2));

	}

	@Test
	void testModulo( ) {

	assertEquals(2,MathExamples.mod(5,3) );

	}

	@Test
	void testExponent( ) {

	assertEquals(125,MathExamples.exp(5,3));

	}

	@Test
    void testAddDouble() {
        assertEquals(new BigDecimal("8.3"), MathExamples.add(5.2, 3.1));
    }

    @Test
    void testSubDoubleDouble() {
        assertEquals(new BigDecimal("2.1"), MathExamples.sub(5.2, 3.1));
    }

    @Test
    void testMultDoubleDouble() {
        assertEquals(new BigDecimal("16.12"), MathExamples.mult(5.2, 3.1));
    }

    @Test
    void testDivDoubleDouble() {
        assertEquals(new BigDecimal("1.677"), MathExamples.div(5.2, 3.1).setScale(3, RoundingMode.HALF_UP));
    }

    @Test
    void testExpDoubleDouble() {
        assertEquals(new BigDecimal("165.81"), MathExamples.exp(5.2, 3.1).setScale(2, RoundingMode.HALF_UP));
    }

    @Test
    void testSquareR() {
        assertEquals(new BigDecimal("2.28"), MathExamples.squareR(5.2));
    }

    @Test
    void testCubeR() {
        assertEquals(new BigDecimal("1.732"), MathExamples.cubeR(5.2));
    }

    @Test
    void testAbsoluteVal() {
        assertEquals(new BigDecimal("9.0"), MathExamples.absoluteVal(-9));
        assertEquals(new BigDecimal("5.2"), MathExamples.absoluteVal(5.2));
    }

}

