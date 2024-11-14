package sourse.crud.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import sourse.crud.dto.request.UserCreationRequest;
import sourse.crud.dto.response.UserResponse;
import sourse.crud.entity.User;

@Mapper (componentModel = "spring")
public interface UserMapper {

//    @Mapping(target = "confirmPassword", ignore = true)
    User toUser (UserCreationRequest request);

    @Mapping(source = "firstName", target = "lastName")
    UserResponse toUserResponse (User user);
    void updateUser (@MappingTarget User user, UserCreationRequest request);
}
