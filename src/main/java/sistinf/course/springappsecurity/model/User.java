package sistinf.course.springappsecurity.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    private int id;
    private String username;
    private String password;
    private String name;
    private String surname;
    private List<Role> roles;

}
