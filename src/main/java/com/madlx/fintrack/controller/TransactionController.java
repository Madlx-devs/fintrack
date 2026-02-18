package com.madlx.fintrack.controller;

import com.madlx.fintrack.entity.Transaction;
import com.madlx.fintrack.service.TransactionService;
import jakarta.annotation.Nonnull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/transaction")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping(path = "/create")
    public Transaction createTransaction(@RequestBody @Nonnull Transaction transaction){
        return transactionService.createTransaction(transaction);
    }

    @DeleteMapping(path = "/delete")
    public boolean deleteTransaction( @RequestParam  Long id){
        return  transactionService.deleteTransaction(id);
    }

    @GetMapping(path ="/getAll")
    public List<Transaction> getAll(){
        return transactionService.allTransaction();
    }

}
