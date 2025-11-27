package simon.com.core.jwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import simon.com.core.jwt.Entity.JwtUser;

public interface AuthRepository extends JpaRepository<JwtUser, Long> {
    Optional<JwtUser> findByLgnId(String lgnId);
}
