package com.sagar.bankingapp.Services.impl;

import com.sagar.bankingapp.Dtos.TransactionDto;
import com.sagar.bankingapp.Entities.Transaction;
import com.sagar.bankingapp.Repositories.TransactionRepo;
import com.sagar.bankingapp.Services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepo transactionRepo;
    @Override
    public void saveTransaction(TransactionDto transactionDto) {
        Transaction transaction = Transaction.builder()
                .transactionType(transactionDto.getTransactionType())
                .accountNumber(transactionDto.getAccountNumber())
                .amount(transactionDto.getAmount())
                .status("SUCCESS")
                .build();

        transactionRepo.save(transaction);
        System.out.println("Transaction saved successfully");
    }
}
