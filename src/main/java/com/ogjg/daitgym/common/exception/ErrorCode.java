package com.ogjg.daitgym.common.exception;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode implements ErrorType {

    SUCCESS(HttpStatus.OK, "200", "OK"),
    NOT_FOUND_USER(HttpStatus.NOT_FOUND, "404", "유저를 찾을 수 없습니다"),
    INVALID_FORMAT(HttpStatus.BAD_REQUEST, "400", "데이터 검증 실패"),
    NOT_FOUND_FEED_JOURNAL(HttpStatus.BAD_REQUEST,"400","운동일지 피드를 찾을 수 없습니다"),
    NOT_FOUND_FEED_JOURNAL_COMMENT(HttpStatus.BAD_REQUEST,"400" , "운동일지 댓글을 찾을 수 없습니다"),
    WRONG_APPROACH(HttpStatus.FORBIDDEN,"403","잘못된 접근입니다"),
    NOT_FOUND_ROUTINE(HttpStatus.BAD_REQUEST,"400","루틴을 찾을 수 없습니다"),
    NOT_FOUND_ROUTINE_COMMENT(HttpStatus.BAD_REQUEST,"400","루틴 댓글을 찾을 수 없습니다"),
    NOT_FOUND_EXERCISE_JOURNAL(HttpStatus.BAD_REQUEST,"400","운동일지를 찾을 수 없습니다");

    @JsonIgnore
    private final HttpStatus statusCode;
    private final String code;
    private String message;

    ErrorCode(
            HttpStatus statusCode,
            String code,
            String message
    ) {
        this.statusCode = statusCode;
        this.code = code;
        this.message = message;
    }

    public ErrorResult changeMessage(
            String message
    ) {
        return new ErrorResult(this.statusCode, this.getCode(), message);
    }
}