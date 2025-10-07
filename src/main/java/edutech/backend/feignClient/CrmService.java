package edutech.backend.feignClient;

import edutech.backend.dto.ApiResponse;
import edutech.backend.dto.emp.EmployeeResponse;
import org.springframework.cloud.openfeign.FeignClient;
 import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="startup-crm-service")
public interface CrmService {

    @GetMapping(path="/emp/profile")
    ResponseEntity<ApiResponse<EmployeeResponse>> getEmployeeByUserId();

}
