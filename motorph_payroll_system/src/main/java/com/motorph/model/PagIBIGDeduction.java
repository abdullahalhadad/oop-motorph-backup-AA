package com.motorph.model;

import com.motorph.util.AppConstants;

/**
 * INHERITANCE: Extends BaseDeduction.
 * POLYMORPHISM: Implements calculate() using a percentage rate with a cap.
 */
public class PagIBIGDeduction extends BaseDeduction {

    public PagIBIGDeduction() {
        super("Pag-IBIG");
    }

    @Override
    public double calculate(double grossPay) {
        return grossPay * AppConstants.PAGIBIG_EMPLOYEE_CONTRIBUTION_RATE;
    }
}
