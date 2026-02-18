package com.madlx.fintrack.service;

import com.madlx.fintrack.entity.Transaction;
import com.madlx.fintrack.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionServiceImpl implements TransactionService{

    private final TransactionRepository repository;

    public TransactionServiceImpl(TransactionRepository repository) {
       this.repository = repository;
    }

    @Override
    public Transaction createTransaction(Transaction transaction) {
       return repository.save(transaction);
    }

    @Override
    public boolean deleteTransaction(Long id) {
        Optional<Transaction> t = repository.findById(id);
        t.ifPresent(repository::delete);
        return true;
    }

    @Override
    public List<Transaction> allTransaction() {
        return repository.findAll();
    }
}
