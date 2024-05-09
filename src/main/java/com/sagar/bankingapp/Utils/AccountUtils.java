package com.sagar.bankingapp.Utils;

import java.time.Year;

public class AccountUtils {
    public static final String ACCOUNT_EXIST_CODE = "001";
    public static final String ACCOUNT_EXIST_MESSAGE = "The user already has an account";
    public static final String ACCOUNT_CREATION_SUCCESS = "002";
    public static final String ACCOUNT_CREATION_MESSAGE = "Account has been created successfully!";
    public static final String ACCOUNT_NOT_EXIST_CODE = "003";
    public static final String ACCOUNT_NOT_EXIST_MESSAGE= "User with the provided Account Number does not exist";
    public static final String ACCOUNT_FOUND_CODE = "004";
    public static final String ACCOUNT_FOUND_SUCCESS = "User Account Found";
    public static final String ACCOUNT_CREDITED_SUCCESS = "005";
    public static final String ACCOUNT_CREDITED_SUCCESS_MESSAGE = "User account has been credited successfully.";
    public static final String INSUFFICIENT_BALANCE_CODE = "006";
    public static final String INSUFFICIENT_BALANCE_MESSAGE = "Insufficient Balance";
    public static final String ACCOUNT_DEBITED_SUCCESS = "007";
    public static final String ACCOUNT_DEBITED_SUCCESS_MESSAGE = "User account has been debited successfully.";
    public static final String TRANSFER_SUCCESSFUL_CODE = "008";
    public static final String TRANSFER_SUCCESSFUL_MESSAGE = "Transfer Successful";

    /**
     * 2024+randomSixDigits
     */
    public static String generateAccountNumber() {
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;

        //generate a random number between  min and max

        int randNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randNumber);
        StringBuilder accountNumber = new StringBuilder();

        return accountNumber.append(year).append(randomNumber).toString();
    }

}
