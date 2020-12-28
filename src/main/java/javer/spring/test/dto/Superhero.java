package javer.spring.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Superhero {

    private String name;
    private String nickName;
    private String universe;
}
