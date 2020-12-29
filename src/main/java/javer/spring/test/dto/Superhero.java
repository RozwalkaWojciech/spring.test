package javer.spring.test.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Superhero {

    private UUID id;

    @NotNull
    private String name;

    @NotEmpty
    private String nickName;

    @NotNull
    private String universe;
}
