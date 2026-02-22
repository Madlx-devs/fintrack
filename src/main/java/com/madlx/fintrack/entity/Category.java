package com.madlx.fintrack.entity;

import com.madlx.fintrack.utils.TransactionType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "categories")
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    @Enumerated(EnumType.STRING)
    private TransactionType type; // INCOME or EXPENSE

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User user;
    @OneToMany(mappedBy = "category")
    private List<Transaction> transactions;
}