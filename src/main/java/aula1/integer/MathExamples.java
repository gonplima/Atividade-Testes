package aula1.integer;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathExamples {
    public static void main(String[] args) {
        int intNumA = 5;
        int intNumB = 3;
        double dblNumC = 5.2;
        double dblNumD = 3.1;
        double dblNumE = 0.1f;
        double dblNumF = 0.2f;
        double dblNumG = -9f;
        
        RoundingMode rmHalfUp = RoundingMode.HALF_UP;
        BigDecimal bdNumE = new BigDecimal (0.1).setScale(1, rmHalfUp);
        BigDecimal bdNumF = new BigDecimal (0.2).setScale(1, rmHalfUp);
        
        
        System.out.println(intNumA + " + " + intNumB + " = " + add(intNumA, intNumB));
        System.out.println(intNumA + " - " + intNumB + " = " + sub(intNumA, intNumB));
        System.out.println(intNumA + " x " + intNumB + " = " + mult(intNumA, intNumB));
        System.out.println(intNumA + " " + (char) 247 + " " + intNumB + " = " + div(intNumA, intNumB));
        System.out.println(intNumA + " mod " + intNumB + " = " + mod(intNumA, intNumB));
        System.out.println(intNumA + " to the power of " + intNumB + " = " + exp(intNumA, intNumB));
        System.out.println(dblNumC + " + " + dblNumD + " = " + add(dblNumC, dblNumD));
        System.out.println(dblNumE + " + " + dblNumF + " = " + add(dblNumE, dblNumF));
        System.out.println("\n");
        System.out.println((0.1f == 0.1d));
        System.out.println("\n");
        System.out.println(bdNumE + " + " + bdNumF + " = "+ add(bdNumE, bdNumF));
        System.out.println(dblNumC + " - " + dblNumD + " = " + sub(dblNumC, dblNumD));
        System.out.println(dblNumC + " x " + dblNumD + " = " + mult(dblNumC, dblNumD));
        System.out.printf("%1.1f " + (char) 247 + " %1.1f" + " = " + "%1.3f \n", dblNumC, dblNumD, div(dblNumC, dblNumD));
        System.out.println(dblNumC + " to the power of " + dblNumD + " = " + exp(dblNumC, dblNumD));
        System.out.println("The square root of " + dblNumC + " = " + squareR(dblNumC));
        System.out.println("The cube root of " + dblNumC + " = " + cubeR(dblNumC));
        System.out.println("The absolute value of " + dblNumC + " = " + absoluteVal(dblNumC));
        System.out.println("The absolute value of " + dblNumG + " = " + absoluteVal(dblNumG));
    }

    public static BigDecimal add(BigDecimal bdNum1, BigDecimal bdNum2) {

    	return bdNum1.add(bdNum2);

    	}
	// métodos
    public static int add(int intNum1, int intNum2) {
        return (intNum1 + intNum2);
    }

    public static int sub(int intNum1, int intNum2) {
        return (intNum1 - intNum2);
    }

    public static int mult(int intNum1, int intNum2) {
        return intNum1 * intNum2;
    }

    public static int div(int intDividend, int intDivisor) {
        return intDividend / intDivisor;
    }

    public static int mod(int intDividend, int intDivisor) {
        return intDividend % intDivisor;
    }

    public static int exp(int base, int power) {
        return (int) Math.pow(base, power);
    }

    public static BigDecimal add(double dblNum1, double dblNum2) {
        return BigDecimal.valueOf(dblNum1).add(BigDecimal.valueOf(dblNum2));
    }

    public static BigDecimal sub(double dblNum1, double dblNum2) {
        return BigDecimal.valueOf(dblNum1).subtract(BigDecimal.valueOf(dblNum2));
    }

    public static BigDecimal mult(double dblNum1, double dblNum2) {
        return BigDecimal.valueOf(dblNum1).multiply(BigDecimal.valueOf(dblNum2));
    }

    public static BigDecimal div(double dblNum1, double dblNum2) {
        return BigDecimal.valueOf(dblNum1).divide(BigDecimal.valueOf(dblNum2), 10, RoundingMode.HALF_UP);
    }

    public static BigDecimal exp(double base, double power) {
        return BigDecimal.valueOf(Math.pow(base, power));
    }

    public static BigDecimal squareR(double number) {
        return BigDecimal.valueOf(Math.sqrt(number)).setScale(2, RoundingMode.HALF_UP);
    }

    public static BigDecimal cubeR(double number) {
        return BigDecimal.valueOf(Math.cbrt(number)).setScale(3, RoundingMode.HALF_UP);
    }

    public static BigDecimal absoluteVal(double number) {
        return BigDecimal.valueOf(Math.abs(number));
    }
}
