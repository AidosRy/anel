package kz.iitu.anel.controller;

import kz.iitu.anel.model.Account;
import kz.iitu.anel.service.AccountService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
public class AccountController {

    @Autowired
    AccountService service;

    @PostMapping("/account")
    public void addAccount(Account account) {
        service.saveAccount(account);
    }

    @PutMapping("/account")
    @SneakyThrows
    public ResponseEntity<?> updateAccount(Account account) {
        if(service.findAccount(account.getId()).isPresent())
            return service.response(service.saveAccount(account), HttpStatus.OK);
        else
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/account")
    public void deleteAccount(Account account) {
        service.deleteAccount(account);
    }

    @GetMapping("/account{id}")
    public Optional<Account> getAccount(@PathVariable Long id) {
        return service.findAccount(id);
    }
}
