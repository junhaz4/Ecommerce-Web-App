package Ecommerce.controller;

import Ecommerce.dto.user.SignInDto;
import Ecommerce.dto.user.SignInResponseDto;
import Ecommerce.dto.user.SignUpResponseDto;
import Ecommerce.dto.user.SignupDto;
import Ecommerce.exceptions.AuthenticationFailException;
import Ecommerce.exceptions.CustomException;
import Ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public SignUpResponseDto Signup(@RequestBody SignupDto signupDto) throws CustomException {
        return userService.signUp(signupDto);
    }

    @PostMapping("/signIn")
    public SignInResponseDto Signup(@RequestBody SignInDto signInDto) throws CustomException, AuthenticationFailException {
        return userService.signIn(signInDto);
    }

}
