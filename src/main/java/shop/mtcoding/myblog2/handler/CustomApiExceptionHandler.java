package shop.mtcoding.myblog2.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import shop.mtcoding.myblog2.dto.ResponseDto;
import shop.mtcoding.myblog2.handler.ex.CustomApiException;

@RestControllerAdvice
public class CustomApiExceptionHandler {

    // NullPointException <- RuntimeException
    @ExceptionHandler(CustomApiException.class)
    public ResponseEntity<?> customApiException(CustomApiException e) {
        return new ResponseEntity<>(new ResponseDto<>(-1, e.getMessage(), null), e.getStatus());
    }
}