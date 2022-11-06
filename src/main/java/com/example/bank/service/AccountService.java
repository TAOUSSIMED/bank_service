package com.example.bank.service;

import com.example.bank.dto.BankAccountRequestDTO;
import com.example.bank.dto.BankAccountResponseDTO;
import com.example.bank.entities.BankAccount;

import java.util.List;

public interface AccountService {
      BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
}
