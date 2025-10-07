package edutech.backend.dto.emp;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@NotNull
public class EmployeeResponse {

    private Long id;

    private String firstname;

    private String lastName;

    private String department;

    private String designation;
}
