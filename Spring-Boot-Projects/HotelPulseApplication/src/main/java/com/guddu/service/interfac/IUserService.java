package com.guddu.service.interfac;

import com.guddu.dto.LoginRequest;
import com.guddu.dto.Response;
import com.guddu.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
