package wooteco.team.ittabi.legenoaroundhere.service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import wooteco.team.ittabi.legenoaroundhere.domain.user.Email;
import wooteco.team.ittabi.legenoaroundhere.domain.user.NickName;
import wooteco.team.ittabi.legenoaroundhere.domain.user.Password;
import wooteco.team.ittabi.legenoaroundhere.domain.user.User;
import wooteco.team.ittabi.legenoaroundhere.domain.user.UserRepository;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    private static final String TEST_EMAIL = "test@test.com";
    private static final String TEST_NAME = "testName";
    private static final String TEST_PASSWORD = "testPassword";

    private UserService userService;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        userService = new UserService(userRepository);
    }

    @Test
    @DisplayName("User 생성")
    void createUser() {
        Email email = new Email(TEST_EMAIL);
        NickName nickName = new NickName(TEST_NAME);
        Password password = new Password(TEST_PASSWORD);

        User user = new User(email, nickName, password);
        userService.createUser(user);

        verify(userRepository).save(any());
    }
}
