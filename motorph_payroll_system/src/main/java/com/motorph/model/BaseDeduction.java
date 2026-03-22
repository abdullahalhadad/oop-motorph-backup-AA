package com.motorph.model;

/**
 * INHERITANCE: Abstract base class for all deductions.
 * Provides common functionality shared by all deduction types.
 * Subclasses must implement the calculate() method with their own logic.
 */
public abstract class BaseDeduction implements Deduction {

    private final String deductionName;

    protected BaseDeduction(String deductionName) {
        this.deductionName = deductionName;
    }

    @Override
    public String getDeductionName() {
        return deductionName;
    }

    @Override
    public String toString() {
        return deductionName;
    }
}
