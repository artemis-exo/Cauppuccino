package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @ParameterizedTest
    @ArgumentsSource(UserArgumentsProvider.class)
    public void testSaveNewUser(User user) {
        assertTrue(userService.saveNewUser(user));

    }

    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "2,2,4",
            "32,2,34"
    })
    public void test(int a, int b, int expected){
        assertEquals(expected,a+b);
    }

    @ParameterizedTest
    @ValueSource(strings={
            "Vedaant",
            "Damsel",
            "Collins"
    })
    public void testFindByUsername(String name){
        assertNotNull(userRepository.findByUsername(name));
    }
}
