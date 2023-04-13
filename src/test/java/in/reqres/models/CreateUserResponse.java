package in.reqres.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateUserResponse {
    private String id, name, job, createdAt, updateAt, token;
}