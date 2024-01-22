package com.user_authentication.user_authentication.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.user_authentication.user_authentication.exception.APIException;
import com.user_authentication.user_authentication.payloads.UserDTO;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

class AuthControllerDiffblueTest {
    /**
     * Method under test: {@link AuthController#registerUser(UserDTO)}
     */
    @Test
    void testRegisterUser() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        AuthController authController = new AuthController();
        ResponseEntity<?> actualRegisterUserResult = authController.registerUser(new UserDTO());
        assertEquals("Registration failed", actualRegisterUserResult.getBody());
        assertEquals(500, actualRegisterUserResult.getStatusCodeValue());
        assertTrue(actualRegisterUserResult.getHeaders().isEmpty());
    }

    /**
     * Method under test: {@link AuthController#registerUser(UserDTO)}
     */
    @Test
    void testRegisterUser2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        ResponseEntity<?> actualRegisterUserResult = (new AuthController()).registerUser(null);
        assertEquals("Registration failed", actualRegisterUserResult.getBody());
        assertEquals(500, actualRegisterUserResult.getStatusCodeValue());
        assertTrue(actualRegisterUserResult.getHeaders().isEmpty());
    }

    /**
     * Method under test: {@link AuthController#registerUser(UserDTO)}
     */
    @Test
    void testRegisterUser3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        AuthController authController = new AuthController();
        UserDTO userDTO = mock(UserDTO.class);
        when(userDTO.getEmail()).thenReturn("jane.doe@example.org");
        ResponseEntity<?> actualRegisterUserResult = authController.registerUser(userDTO);
        verify(userDTO).getEmail();
        assertEquals("Registration failed", actualRegisterUserResult.getBody());
        assertEquals(500, actualRegisterUserResult.getStatusCodeValue());
        assertTrue(actualRegisterUserResult.getHeaders().isEmpty());
    }

    /**
     * Method under test: {@link AuthController#registerUser(UserDTO)}
     */
    @Test
    void testRegisterUser4() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        AuthController authController = new AuthController();
        UserDTO userDTO = mock(UserDTO.class);
        when(userDTO.getEmail()).thenThrow(new APIException("An error occurred"));
        ResponseEntity<?> actualRegisterUserResult = authController.registerUser(userDTO);
        verify(userDTO).getEmail();
        assertEquals("An error occurred", actualRegisterUserResult.getBody());
        assertEquals(400, actualRegisterUserResult.getStatusCodeValue());
        assertTrue(actualRegisterUserResult.getHeaders().isEmpty());
    }
}
