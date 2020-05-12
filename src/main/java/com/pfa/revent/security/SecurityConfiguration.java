package com.pfa.revent.security;

import com.pfa.revent.security.web.LoggingAccessDeniedHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    LoggingAccessDeniedHandler accessDeniedHandler;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
    }

    @Bean
    public PasswordEncoder getPaswordEncoder() {
        /*BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;*/
        return NoOpPasswordEncoder.getInstance();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/ManageEditors").hasAnyRole("MODERATOR")
                .antMatchers("/CreateEvents/**").hasAnyRole("EDITOR")
                .antMatchers("/BrowseEvents/**").hasAnyRole("VIEWER")
                .antMatchers("/Profile").hasAnyRole("ADMIN","VIEWER","EDITOR","MODERATOR")
                .antMatchers("/Profile/MyParticipations/**").hasAnyRole("VIEWER")
                .antMatchers("/Profile/MyEvents/**").hasAnyRole("EDITOR")
                .antMatchers("/Profile/MyEditors/**").hasAnyRole("MODERATOR")
                .antMatchers("/AboutUsLogout").hasAnyRole("ADMIN","VIEWER","EDITOR","MODERATOR")
                .antMatchers("/Home").hasAnyRole("ADMIN","VIEWER","EDITOR","MODERATOR")
                .antMatchers("/").permitAll()
                .antMatchers("/AboutUs").permitAll()
                .antMatchers("/**").hasRole("ADMIN")
                .antMatchers( "/js/**", "/css/**", "/img/**", "/webjars/**").permitAll() //edit
                .and()
                .formLogin();
                //.loginPage("/login").permitAll()
                //.and()
                //.logout()
                //.invalidateHttpSession(true) //edit
                //.clearAuthentication(true)  //edit
                //.logoutRequestMatcher(new AntPathRequestMatcher("/logout")) //edit
                //.logoutSuccessUrl("/")
                //.logoutSuccessUrl("/login?logout").permitAll()
                //.and()
                //.exceptionHandling()
                //.accessDeniedPage("/access-denied");
                //.accessDeniedHandler(accessDeniedHandler);

        /*       .antMatchers("/ManageEditors").hasAnyRole("ADMIN","MODERATOR")
                .antMatchers("/CreateEvents/**").hasAnyRole("ADMIN","EDITOR","MODERATOR")
                .antMatchers("/BrowseEvents/**").hasAnyRole("ADMIN","VIEWER","EDITOR","MODERATOR")
                .antMatchers("/Profile").hasAnyRole("ADMIN","VIEWER","EDITOR","MODERATOR")
                .antMatchers("/Profile/Participations/**").hasAnyRole("ADMIN","VIEWER","EDITOR","MODERATOR")
                .antMatchers("/Profile/MyEvents/**").hasAnyRole("ADMIN","EDITOR","MODERATOR")
                .antMatchers("/Profile/MyEditors/**").hasAnyRole("ADMIN","MODERATOR")
                .antMatchers("/AboutUsLogout").hasAnyRole("ADMIN","VIEWER","EDITOR","MODERATOR")
                .antMatchers("/Home").hasAnyRole("ADMIN","VIEWER","EDITOR","MODERATOR")
                .antMatchers("/").permitAll()
                .antMatchers("/AboutUs").permitAll()
                .antMatchers("/**").hasRole("ADMIN")
                .and().formLogin();*/
    }
}
