package com.madlx.fintrack.service;

import com.madlx.fintrack.entity.Transaction;
import jakarta.annotation.Nonnull;

import java.util.List;

public interface TransactionService {

    Transaction createTransaction( Transaction transaction);
    boolean deleteTransaction(Long id);
    List<Transaction> allTransaction();

}
