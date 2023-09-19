package sistinf.course.springappsecurity.services;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;
import sistinf.course.springappsecurity.model.Role;
import sistinf.course.springappsecurity.model.User;

import java.util.Arrays;
import java.util.stream.Collectors;

@Service
public class UserService {

    public User getUserByUsername(String username){
        if (username.equalsIgnoreCase("jhon@some.it")){
            return User.builder()
                    .id(1)
                    .name("Jhon")
                    .surname("Smith")
                    .username(username)
                    .roles(Arrays.asList("ADMIN").stream().map(Role::new).collect(Collectors.toList()))
                    .build();
        }else if (username.equalsIgnoreCase("carl@some.it")){
            return User.builder()
                    .id(1)
                    .name("Carl")
                    .surname("Jhonson")
                    .username(username)
                    .roles(Arrays.asList("USER").stream().map(Role::new).collect(Collectors.toList()))
                    .build();
        }
        return null;
    }
}
