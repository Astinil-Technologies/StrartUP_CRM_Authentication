package edutech.backend.dto;
import lombok.Data;

@Data
public class UpdatedUserDetails {

    private String mobileNo;

    private String bio;

    private String location;

    private String status;  // TODO : need to update to Online once logged in

}
