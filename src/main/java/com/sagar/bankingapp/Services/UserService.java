package com.sagar.bankingapp.Services;

import com.sagar.bankingapp.Dtos.BankResponse;
import com.sagar.bankingapp.Dtos.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);

}
