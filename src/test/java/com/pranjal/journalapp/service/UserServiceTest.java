package com.pranjal.journalapp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pranjal.journalapp.entity.User;

@SpringBootTest
public class UserServiceTest {


    @Autowired
    private UserService userService;

    @ParameterizedTest
    @ArgumentsSource(UserArgumentsProvider.class)
    public void testSaveNewUser(User user) {
        assertTrue(userService.saveNewUser(user));
    }
    
    @Disabled
    @ParameterizedTest
    @CsvSource({
        "1,1,2",
        "2,3,5",
        "13,13,27"
    })
    public void testAdd(int a, int b, int expected) {
        assertEquals(expected, a+b);
    }
}
