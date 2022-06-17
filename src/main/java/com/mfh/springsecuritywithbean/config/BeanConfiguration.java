package com.mfh.springsecuritywithbean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class BeanConfiguration {

  @Bean
  public BCryptPasswordEncoder bCryptPasswordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Bean
  public UserDetailsService users(PasswordEncoder passwordEncoder) {
    UserDetails user = User.builder()
        .passwordEncoder(passwordEncoder::encode)
        .username("a")
        .password("a")
        .roles("USER")
        .build();
    return new InMemoryUserDetailsManager(user);
  }
}
