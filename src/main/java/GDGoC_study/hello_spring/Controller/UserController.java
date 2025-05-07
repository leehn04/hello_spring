package GDGoC_study.hello_spring.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public String getAllUsers() {
        return "모든 사용자 조회";
    }

    @PostMapping
    public String createUser(@RequestBody String userData) {
        return "사용자 생성: " + userData;
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody String userData) {
        return "사용자 수정: ID " + id + ", 내용: " + userData;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        return "사용자 삭제: ID " + id;
    }

}
