package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private  int Id;
    private  Integer  accountNumber;
    private  Double   amount;
    private  Boolean  isDeleted;
}