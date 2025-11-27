package simon.com.core.jwt.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LoginRequest {
    private String lgnId;
    private String password;
}
