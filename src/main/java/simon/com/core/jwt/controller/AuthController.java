package simon.com.core.jwt.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import simon.com.core.jwt.JwtProvider;
import simon.com.core.jwt.Entity.JwtUser;
import simon.com.core.jwt.dto.LoginRequest;
import simon.com.core.jwt.dto.LoginResponse;
import simon.com.core.jwt.service.AuthService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService AuthService;
    private final JwtProvider jwtProvider;

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {

    	JwtUser user = AuthService.authenticate(request.getLgnId(), request.getPassword());

        String token = jwtProvider.generateToken(user.getLgnId());
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setLgnId(user.getLgnId());
        loginResponse.setEmail(user.getEamil());
        loginResponse.setToken(token);
        return loginResponse;
    }
}
