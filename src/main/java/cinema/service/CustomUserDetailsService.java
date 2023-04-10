package cinema.service;

import static org.springframework.security.core.userdetails.User.withUsername;

import cinema.model.User;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UserService userService;

    @Autowired
    public CustomUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userOptional = userService.findByEmail(username);
        if (userOptional.isEmpty()) {
            throw new UsernameNotFoundException("User not found");
        }
        User user = userOptional.get();
        UserBuilder userBuilder
                = withUsername(user.getEmail());
        userBuilder.password(user.getPassword());
        userBuilder.authorities(
                user.getRoles().stream()
                        .map(r -> r.getRoleName().name())
                        .toArray(String[]::new));
        return userBuilder.build();
    }
}
