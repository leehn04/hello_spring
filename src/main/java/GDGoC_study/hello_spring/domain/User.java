package GDGoC_study.hello_spring.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Email
    @NotBlank(message = "이메일은 필수입니다.")
    @Column(nullable = false, unique = true)
    private String email;

    @NotBlank(message = "닉네임은 필수입니다.")
    @Column(nullable = false)
    private String nickname;

    @NotBlank(message = "비밀번호는 필수입니다.")
    @Column(nullable = false)
    private String password;
}
