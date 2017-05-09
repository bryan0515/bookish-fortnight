package crowdfunding.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@Order(1)
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Qualifier("dataSource")
    @Autowired
    private DataSource dataSource;

    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/", "/home", "/login").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .httpBasic().and()
//                .formLogin()
//                .loginPage("/login")
//                .permitAll()
//                .and()
//                .logout()
//                .permitAll();

//        http
//                .csrf().disable()
//                .authorizeRequests()
//                    .antMatchers("/", "/home", "logout").permitAll()
//                    .anyRequest().authenticated()
//                    .and()
//                .httpBasic()
//                    .and()
////                .formLogin()
////                    .loginPage("/login").permitAll()
////                    .and()
//                .logout()
////                    .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                    .permitAll();

//        http
//                .csrf().disable()
//                .authorizeRequests()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .httpBasic()
//                .and()
//                .logout()
//                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                .logoutSuccessUrl("/login")
//                .deleteCookies("JSESSIONID");

    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .inMemoryAuthentication()
//                .withUser("user").password("password").roles("USER");
        auth
                .jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("select uemail, password, 1 from Customer where uemail=?")
                .authoritiesByUsernameQuery("select uemail, 'USER' from Customer where uemail=?");
    }
}
