package com.fintech.banking.service;

import com.fintech.banking.dto.TransactionDto;
import com.fintech.banking.entity.Transaction;

public interface TransactionService {

    void saveTransaction(TransactionDto transactionDto);

}
