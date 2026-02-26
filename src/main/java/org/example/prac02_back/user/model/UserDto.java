package org.example.prac02_back.user.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserDto {
    public static class Signupreq{
        private String email;
        private String name;
        private String password;

        public User toEntity(){
            return User.builder()
                    .email(this.email)
                    .name(this.name)
                    .password(this.password)
                    .build();
        }
    }
}
