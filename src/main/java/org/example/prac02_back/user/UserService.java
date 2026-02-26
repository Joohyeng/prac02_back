package org.example.prac02_back.user;

import lombok.RequiredArgsConstructor;
import org.example.prac02_back.user.model.UserDto;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public void signup(UserDto.SignupReq dto) {
        userRepository.save(dto.toEntity());

    }
}
