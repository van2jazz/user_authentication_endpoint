package com.user_authentication.user_authentication.exception;

public class APIException extends RuntimeException{


   public APIException(){
   }

   public APIException(String message)
   {
       super(message);
   }
}
