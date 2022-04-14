package dev.vitorvidal.charactercreator.model.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVO {
    private UUID id;
    private String username;
    private String email;
}