package in.reqres.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Users {
    private Integer id;
    private String email, password, firstName, lastName, job;
}