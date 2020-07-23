package wooteco.team.ittabi.legenoaroundhere.domain.user;

import java.util.Objects;
import javax.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Password {

    private static final int MIN_LENGTH = 8;
    private static final int MAX_LENGTH = 16;

    private String password;

    protected Password() {
    }

    public Password(String password) {
        validate(password);
        this.password = password; // Todo: Security 적용 할 때 암호화 도입 예정 (bcrypt)
    }

    private void validate(String password) {
        validateNull(password);
    }

    private void validateNull(String password) {
        if (Objects.isNull(password)) {
            throw new IllegalArgumentException("password가 null 입니다.");
        }
    }
}
