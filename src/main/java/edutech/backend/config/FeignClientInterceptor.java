package edutech.backend.config;


import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@Configuration
public class FeignClientInterceptor implements RequestInterceptor {

    // to pass token to feign client wile consuming endpoints from another service

    @Override
    public void apply(RequestTemplate requestTemplate) {
        Authentication auth =SecurityContextHolder.getContext().getAuthentication();

        if (auth != null && auth.getCredentials() != null) {
            String token = auth.getCredentials().toString();

            requestTemplate.header("Authorization", "Bearer "+token);
        }
    }
}