package simon.com.core.jwt.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponse {
    private String lgnId;
    private String email;
    private String token;
}
