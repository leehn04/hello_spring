package GDGoC_study.hello_spring.service;

import GDGoC_study.hello_spring.domain.User;
import GDGoC_study.hello_spring.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    // 회원가입
    public User registerUser(String email, String nickname, String password) {
        User user = User.builder()
                .email(email)
                .nickname(nickname)
                .password(password)
                .build();
        return userRepository.save(user);
    }

    // 사용자 정보 수정
    public User updateUser(Long id, String nickname, String password) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 존재하지 않습니다."));
        user.setNickname(nickname);
        user.setPassword(password);
        return user;
    }

    // 이메일로 사용자 검색 (옵션)
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
