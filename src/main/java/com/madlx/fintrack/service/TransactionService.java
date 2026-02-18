package com.madlx.fintrack.service;

import com.madlx.fintrack.entity.Transaction;


import java.util.List;

public interface TransactionService {

    Transaction createTransaction( Transaction transaction);
    boolean deleteTransaction(Long id);
    List<Transaction> allTransaction();

}
