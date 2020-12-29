package javer.spring.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Superhero {

    private Integer id;

    @NotNull
    private String name;

    @NotEmpty
    private String nickName;

    @NotNull
    private String universe;
}
