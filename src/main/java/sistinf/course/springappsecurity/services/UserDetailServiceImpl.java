package sistinf.course.springappsecurity.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sistinf.course.springappsecurity.model.User;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserDetailServiceImpl implements UserDetailsService {


    @Autowired
    UserService userService;


    /**
     * This method implements a logic to retrieve and found a user by username on the DB, Ldap and so on ..
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.getUserByUsername(username);
        if (user==null){
            throw new UsernameNotFoundException("Invalid username....!!!!");
        }
        Set<SimpleGrantedAuthority> authorities = user.getRoles()
                .stream()
                .map(s -> {return new SimpleGrantedAuthority(s.getRole());})
                .collect(Collectors.toSet());

        return new org.springframework.security.core.userdetails.User(username, "pass0",authorities);

    }



}
