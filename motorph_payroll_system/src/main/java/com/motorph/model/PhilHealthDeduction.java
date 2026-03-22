package com.motorph.model;

import com.motorph.util.AppConstants;

/**
 * INHERITANCE: Extends BaseDeduction.
 * POLYMORPHISM: Implements calculate() using a percentage rate.
 */
public class PhilHealthDeduction extends BaseDeduction {

    public PhilHealthDeduction() {
        super("PhilHealth");
    }

    @Override
    public double calculate(double grossPay) {
        return grossPay * AppConstants.PHILHEALTH_EMPLOYEE_CONTRIBUTION_RATE;
    }
}
