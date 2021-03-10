package kz.iitu.anel.service;

import kz.iitu.anel.model.Account;
import kz.iitu.anel.repo.AccountRepo;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AccountService {

    @Autowired
    private final AccountRepo repo;

    @SneakyThrows
    public Account saveAccount(Account account) {
        return repo.save(account);
    }

    public void deleteAccount(Account account) {
        repo.delete(account);
    }

    public Optional<Account> findAccount(Long id) {
        return repo.findById(id);
    }

    public ResponseEntity<?> response(Object obj, HttpStatus status) {
        return new ResponseEntity<>(obj, status);
    }
}
