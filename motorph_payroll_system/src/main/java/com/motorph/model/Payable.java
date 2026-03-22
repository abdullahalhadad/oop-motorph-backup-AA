package com.motorph.model;

/**
 * ABSTRACTION: Defines the contract for any entity that can calculate pay.
 * Any class that is "payable" must implement these methods.
 */
public interface Payable {
    double calculateGrossPay();
    double calculateDeductions();
    double calculateNetPay();
}
