//package com.HealthCare.AppointmentSystem.Security;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.provisioning.JdbcUserDetailsManager;
//import org.springframework.security.provisioning.UserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//import javax.sql.DataSource;
//
//@Configuration
////@EnableWebSecurity
//public class SecurityConfig {
//
//    // Configuring JDBC-based user details manager
////    @Bean
////    public UserDetailsManager userDetailsManager(DataSource dataSource) {
////        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);
////
////        // Define query to retrieve a user by username
////        jdbcUserDetailsManager.setUsersByUsernameQuery(
////                "SELECT username, password, enabled FROM users WHERE username=?");
////
////        // Define query to retrieve the authorities/roles by username
////        jdbcUserDetailsManager.setAuthoritiesByUsernameQuery(
////                "SELECT username, authority FROM authorities WHERE username=?");
////
////        return jdbcUserDetailsManager;
////
////    }
//
//	@Bean
//    public UserDetailsManager userDetailsManager(DataSource dataSource) {
//        JdbcUserDetailsManager theUserDetailsManager = new JdbcUserDetailsManager(dataSource);
//        theUserDetailsManager.setUsersByUsernameQuery("select username, password, enabled from users where username=?");
//        theUserDetailsManager.setAuthoritiesByUsernameQuery("select username, authority from authorities where username=?");
//        return theUserDetailsManager;
//    }
//
//	 @Bean
//	    public PasswordEncoder passwordEncoder() {
//	        return new BCryptPasswordEncoder();
//	    }
//    // Configuring security filter chain
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
////        http.authorizeHttpRequests(authorizeRequests ->
////        authorizeRequests.requestMatchers("/Appointment/**").authenticated()
////                    .requestMatchers(HttpMethod.GET, "/Department/**").hasRole("ADMIN")
////                    .requestMatchers(HttpMethod.POST, "/Department/**").hasRole("ADMIN")
////                    .requestMatchers(HttpMethod.PUT, "/Department/**").hasRole("ADMIN")
////                    .requestMatchers(HttpMethod.DELETE, "/Department/**").hasRole("ADMIN")
////                    .requestMatchers(HttpMethod.GET, "/Doctor/**").hasRole("DOCTOR")
////                    .requestMatchers(HttpMethod.POST, "/Doctor/**").hasRole("DOCTOR")
////                    .requestMatchers(HttpMethod.PUT, "/Doctor/**").hasRole("DOCTOR")
////                    .requestMatchers(HttpMethod.DELETE, "/Doctor/**").hasRole("ADMIN")
////                    .requestMatchers(HttpMethod.GET, "/Patient/**").hasRole("PATIENT")
////                    .requestMatchers(HttpMethod.POST, "/Patient/**").hasRole("PATIENT")
////                    .requestMatchers(HttpMethod.PUT, "/Patient/**").hasRole("PATIENT")
////                    .requestMatchers(HttpMethod.DELETE, "/Patient/**").hasRole("DOCTOR")
////                    .requestMatchers(HttpMethod.GET, "/Appointment").hasRole("PATIENT")
////                    .requestMatchers(HttpMethod.GET, "/Appointment/**").hasRole("PATIENT")
////                    .requestMatchers(HttpMethod.GET, "/Appointment/**").hasRole("DOCTOR")
////                    .requestMatchers(HttpMethod.POST, "/Appointment/**").hasRole("PATIENT")
////                    .requestMatchers(HttpMethod.PUT, "/Appointment/**").hasRole("PATIENT")
////                    .requestMatchers(HttpMethod.DELETE, "/Appointment/**").hasRole("DOCTOR")
////                    .anyRequest().permitAll()
////            );
//    	http.authorizeHttpRequests(configurer ->
//        configurer.
//        requestMatchers(HttpMethod.GET, "/Appointment").hasRole("PATIENT")
//      .requestMatchers(HttpMethod.GET, "/Doctor").hasRole("DOCTOR")
////        .requestMatchers(HttpMethod.GET, "/Appointment").hasRole("PATIENT")
//      .anyRequest().permitAll());
//
//
//        http.httpBasic(Customizer.withDefaults());
//        http.csrf(csrf -> csrf.disable());
//
//        return http.build();
//    }
//}
