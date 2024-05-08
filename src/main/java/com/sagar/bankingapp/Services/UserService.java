package com.sagar.bankingapp.Services;

import com.sagar.bankingapp.Dtos.BankResponse;
import com.sagar.bankingapp.Dtos.EnquiryRequest;
import com.sagar.bankingapp.Dtos.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);

    BankResponse creditAccount();
}
