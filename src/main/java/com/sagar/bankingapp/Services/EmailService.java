package com.sagar.bankingapp.Services;

import com.sagar.bankingapp.Dtos.EmailDetails;

public interface EmailService {
    void SendEmailAlert(EmailDetails emailDetails);
}
