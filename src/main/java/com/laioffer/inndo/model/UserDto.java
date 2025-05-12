package com.laioffer.inndo.model;

public record UserDto(
        Long id,
        String username,
        UserRole role
) {
    public UserDto(UserEntity entity) {
        this(
                entity.getId(),
                entity.getUsername(),
                entity.getRole()
        );
    }

}
