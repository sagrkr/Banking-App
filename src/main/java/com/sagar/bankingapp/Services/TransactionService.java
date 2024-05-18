package com.sagar.bankingapp.Services;

import com.sagar.bankingapp.Dtos.TransactionDto;
import com.sagar.bankingapp.Entities.Transaction;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
