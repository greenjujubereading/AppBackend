package com.qingzaoreading.service;

import com.qingzaoreading.pojo.po.User;
import com.qingzaoreading.pojo.po.VerifyCode;

public interface UserRegisterLoginService {

    User getUserByPhoneNumber(User user);

    User getUserByPhoneNumberAndPassword(User user);

    int getUserTotal();

    void addUser(User newuser);

    void changeUserTypeToTrue(User user);

    void addVerifyCode(VerifyCode vc);

    VerifyCode getVerifyCodeByphone(String user_phone);

    void deleteVerifyCode(VerifyCode vc);

    void setPassword(User user);

    User getUserById(String user_id);

    void updateUser(User user);
}
