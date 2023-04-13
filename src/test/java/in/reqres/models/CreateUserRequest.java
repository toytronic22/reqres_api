package in.reqres.models;

import lombok.Data;
@Data
//@AllArgsConstructor
public class CreateUserRequest {
    private String name, job;
}