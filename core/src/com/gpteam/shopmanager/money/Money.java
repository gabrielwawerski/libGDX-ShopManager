package com.gpteam.shopmanager.money;

import com.gpteam.shopmanager.variables.Variables;

import java.math.BigDecimal;

public abstract class Money {

    /**
     * Instantiates and returns a BigDecimal object from the given value. Sets the scale
     * and rounding mode to class default.
     *
     * <p>Scale: {@link com.gpteam.shopmanager.variables.Variables#MONEY_SCALE}
     * <p>Rounding Mode: {@link BigDecimal#ROUND_HALF_UP}
     * @param value the value that the object will have
     * @return new BigDecimal object set to the given value
     */
    public static BigDecimal toBigDecimal(String value) {
        return new BigDecimal(value).setScale(Variables.MONEY_SCALE, BigDecimal.ROUND_HALF_UP);
    }

    public static boolean isLess(BigDecimal bigDecimal, BigDecimal otherBigDecimal) {
        return bigDecimal.compareTo(otherBigDecimal) == -1;
    }

    public static boolean isGreater(BigDecimal bigDecimal, BigDecimal otherBigDecimal) {
        return bigDecimal.compareTo(otherBigDecimal) == 1;
    }

    public static boolean isEqual(BigDecimal bigDecimal, BigDecimal otherBigDecimal) {
        return bigDecimal.compareTo(otherBigDecimal) == 0;
    }

    public static boolean isEqualOrGreater(BigDecimal bigDecimal, BigDecimal otherBigDecimal) {
        return isEqual(bigDecimal, otherBigDecimal) && isGreater(bigDecimal, otherBigDecimal);
    }

    public static boolean isEqualOrLess(BigDecimal bigDecimal, BigDecimal otherBigDecimal) {
        return isEqual(bigDecimal, otherBigDecimal) && isLess(bigDecimal, otherBigDecimal);
    }
}