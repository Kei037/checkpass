package com.checkpass.repository;

import com.checkpass.domain.User;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class UserRepositoryTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testInsert() {
        User user = User.builder().userId("testId").userPw("testPw")
                .name("김자바")
                .email("test1@gamil.com")
                .phoneNumber("01023456789").build();
        User result = userRepository.save(user);
        log.info("UNO: " + result.getUno());
    }


}
