package spring.security.Init;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.security.Model.Users;
import spring.security.Repository.UserRepository;

@Component
public class StartApplication implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Transactional
    @Override
    public void run(String... args) throws Exception {
        Users users = repository.findByUsername("admin");
        if (users==null){
            users = new Users();
            users.setName("ADMIN");
            users.setUsername("admin");
            users.setPassword("master123");
            users.getRoles().add("MANAGERS");
            repository.save(users);
        }
        users = repository.findByUsername("user");
        if(users ==null){
            users = new Users();
            users.setName("USER");
            users.setUsername("user");
            users.setPassword("user123");
            users.getRoles().add("USERS");
            repository.save(users);
        }
    }
}
