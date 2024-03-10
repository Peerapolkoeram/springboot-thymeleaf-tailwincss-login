package com.tpk.ThymeleafSpringBoot.configs;

import com.tpk.ThymeleafSpringBoot.dao.UsersDao;
import com.tpk.ThymeleafSpringBoot.reporsitory.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class InitDataLoader implements CommandLineRunner {

    private final UsersRepository usersRepository;

    @Override
    public void run(String... args) throws Exception {

        if (usersRepository.count() == 0) {
            UsersDao admin = new UsersDao(1,"admin","P@ss0rd","admin@gmail.com","admin","admin");
            UsersDao user = new UsersDao(2,"user","P@ss0rd","user@gmail.com","user","user");
            List<UsersDao> result = List.of(admin,user);
            usersRepository.saveAll(result);
        }

    }
}
