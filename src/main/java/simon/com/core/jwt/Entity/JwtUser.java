package simon.com.core.jwt.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name = "userBsc", schema = "simon")
public class JwtUser {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id" )
    private String userId;
    @Column(name = "lgn_id" )
    private String lgnId;
    @Column(name = "lgn_pw" )
    private String lgnPw;   // BCrypt로 저장
    @Column(name = "email" )
    private String eamil;
}