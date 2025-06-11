package edutech.backend.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class UsersValidationResponse {

    private List<Long> validUserIds;
    private List<Long> invalidUserIds;
}
