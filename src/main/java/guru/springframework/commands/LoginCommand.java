package guru.springframework.commands;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

@Getter
@Setter
public class LoginCommand {

    @NotEmpty
    private String username;
    @NotEmpty
    private String password;
}
