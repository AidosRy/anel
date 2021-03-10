package kz.iitu.anel;

import kz.iitu.anel.model.Account;
import kz.iitu.anel.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BootTest {

    @Autowired
    AccountService accountService;

    @Test
    public void test() {
        Account acc = accountService.saveAccount(new Account());
        Account acc2 = accountService.findAccount(acc.getId()).get();
        assertThat(acc.getId()).isEqualTo(acc2.getId());
    }
}
