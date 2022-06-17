//package com.mfh.springsecuritywithbean.config;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfiguration {
//  @Autowired
//  public PasswordEncoder passwordEncoder;
//
//  @Autowired
//  public UserDetailsService userDetailsService;
//
//  @Bean
//  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//
//    AuthenticationManagerBuilder authenticationManagerBuilder = http.getSharedObject(
//        AuthenticationManagerBuilder.class);
//    authenticationManagerBuilder.userDetailsService(userDetailsService);
//    AuthenticationManager authenticationManager = authenticationManagerBuilder.build();
//
//    http.csrf()
//        .disable()
//        .cors()
//        .disable()
//        .authorizeHttpRequests((authz) -> authz.anyRequest()
//            .authenticated())
//        .httpBasic(withDefaults())
//        .formLogin()
//        .permitAll()
//        .and()
//        .authenticationManager(authenticationManager);
//
//    // DO NOT ADD THE FOLLOWING LINE -> This will always keep you in login page won't redirect after successful login
////        .sessionManagement()
////        .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//    return http.build();
//  }
//}
