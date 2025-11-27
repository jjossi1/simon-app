package simon.com.core.jwt.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import simon.com.core.jwt.Entity.JwtUser;
import simon.com.core.jwt.repository.AuthRepository;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthRepository authRepository;
    private final PasswordEncoder passwordEncoder;

    public JwtUser authenticate(String id, String rawPassword) {
    	JwtUser user = authRepository.findByLgnId(id)
                .orElseThrow(() -> new RuntimeException("ID not found"));

        if (!passwordEncoder.matches(rawPassword, user.getLgnPw())) {
            throw new RuntimeException("Password not match");
        }

        return user;
    }
}