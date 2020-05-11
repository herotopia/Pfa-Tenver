package com.pfa.revent.security.service;

import com.pfa.revent.security.entity.MyUserSDetails;
import com.pfa.revent.security.entity.UserS;
import com.pfa.revent.security.repository.UserSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserSDetailsService implements UserDetailsService {
    @Autowired
    UserSRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserS> user = userRepository.findByUsername(username);

        user.orElseThrow(() -> new UsernameNotFoundException("NotFound: " + username));

        return user.map(MyUserSDetails::new).get();
    }
}
