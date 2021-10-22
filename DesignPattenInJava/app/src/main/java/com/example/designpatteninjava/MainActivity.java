package com.example.designpatteninjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.designpatteninjava.model.AccountCreationService;
import com.example.designpatteninjava.model.LegacyBankAccount;
import com.example.designpatteninjava.model.PersonalInfoDB;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //create object poling
        //The Adapter acts as a wrapper between two objects. It catches calls for one object and
        // transforms them to format and interface recognizable by the second object.

        LegacyBankAccount legacyBankAccount = new LegacyBankAccount(1, "Javad Shirkhani");
        /* Won't work due to missing parameters!!
        AccountCreationService accountCreationService = new AccountCreationService(legacyBankAccount.getID(), legacyBankAccount.getName())
        */
        PersonalInfoDB personalInfoDB = new PersonalInfoDB();
        personalInfoDB.setName("John Smith");
        personalInfoDB.setEmail("john@smith.com");
        personalInfoDB.setAmount(1000L);

        BankAccountAdapter bankAccountAdapter = new BankAccountAdapter(legacyBankAccount, personalInfoDB);
        AccountCreationService accountCreationService = new AccountCreationService(bankAccountAdapter.getID(),
                bankAccountAdapter.getName(), bankAccountAdapter.getEmail(), bankAccountAdapter.getAmount());

        accountCreationService.createAccount();


    }
}