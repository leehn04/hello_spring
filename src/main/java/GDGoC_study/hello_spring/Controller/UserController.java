package GDGoC_study.hello_spring.Controller;

import GDGoC_study.hello_spring.domain.User;
import GDGoC_study.hello_spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    // 회원가입 요청
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestParam String email,
                                               @RequestParam String nickname,
                                               @RequestParam String password) {
        userService.registerUser(email, nickname, password);
        return ResponseEntity.ok("회원가입 완료!");
    }

    // 사용자 수정 요청
    @PutMapping("/{id}")
    public ResponseEntity<String> updateUser(@PathVariable Long id,
                                             @RequestParam String nickname,
                                             @RequestParam String password) {
        userService.updateUser(id, nickname, password);
        return ResponseEntity.ok("수정 완료!");
    }
}
