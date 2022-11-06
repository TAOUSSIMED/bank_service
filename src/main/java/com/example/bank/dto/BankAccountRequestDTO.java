package com.example.bank.dto;

import com.example.bank.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor  @NoArgsConstructor
public class BankAccountRequestDTO {
    private String currency;
    private Double balance;
    private AccountType type;
}
