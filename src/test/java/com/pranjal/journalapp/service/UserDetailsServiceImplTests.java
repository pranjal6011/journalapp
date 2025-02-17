package com.pranjal.journalapp.service;

import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.userdetails.UserDetails;
import static org.mockito.Mockito.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.pranjal.journalapp.entity.User;
import com.pranjal.journalapp.repository.UserRepository;


public class UserDetailsServiceImplTests {

   @InjectMocks
    private UserDetailsServiceImpl userDetailsService;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void loadUserByUsernameTest(){
        when(userRepository.findByUserName(ArgumentMatchers.anyString())).thenReturn(User.builder().userName("Pranjal").password("12fed3").roles(new ArrayList<>()).build());
        UserDetails user = userDetailsService.loadUserByUsername("Pranjal");
        Assertions.assertNotNull(user);
    }
}
