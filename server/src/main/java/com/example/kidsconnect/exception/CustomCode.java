package com.example.kidsconnect.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
@Getter
@AllArgsConstructor
public enum CustomCode {

        DUPLICATED_EMAIL(HttpStatus.BAD_REQUEST, "DUPLICATED_EMAIL", "이미 사용 중인 이메일입니다."),
        DUPLICATED_NICKNAME(HttpStatus.BAD_REQUEST, "DUPLICATED_NICKNAME", "이미 사용 중인 닉네임입니다."),
        NOT_VALID_FORMAT(HttpStatus.BAD_REQUEST, "NOT_VALID_FORMAT", "지정된 양식을 사용해주세요."),
        NOT_VALID_PASSWORD(HttpStatus.BAD_REQUEST, "NOT_VALID_PASSWORD", "비밀번호를 다시 확인해주세요."),
        NOT_INPUT_INFORMATION(HttpStatus.BAD_REQUEST, "NOT_INPUT_INFORMATION", "변경될 정보를 입력해주세요."),
        NOT_ABLE_SEND_MESSAGE(HttpStatus.BAD_REQUEST, "NOT_ABLE_SEND_MESSAGE", "본인에게 메세지를 보낼 수 없습니다."),
        NOT_ABLE_FOLLOW(HttpStatus.BAD_REQUEST, "NOT_ABLE_FOLLOW", "본인을 팔로우할 수 없습니다."),
        EXCEED_FEED_CONTENT(HttpStatus.BAD_REQUEST, "EXCEED_FEED_CONTENT", "컨텐츠 내용은 최대 100자까지 등록 가능합니다."),
        EXCEED_MEMBER_TAG(HttpStatus.BAD_REQUEST, "EXCEED_MEMBER_TAG", "관심사 태그는 최대 3개까지 등록 가능합니다."),
        NOT_OBTAINED_BADGES(HttpStatus.BAD_REQUEST, "NOT_OBTAINED_BADGES", "획득된 뱃지만 조회 가능합니다."),
        UPLOAD_IMAGE_FAILED(HttpStatus.BAD_REQUEST, "UPLOAD_IMAGE_FAILED", "파일 업로드에 실패했습니다."),

        NOT_VALID_AUTHENTICATION(HttpStatus.UNAUTHORIZED, "NOT_VALID_AUTHENTICATION", "인증이 유효하지 않습니다."),

        NOT_VALID_OWNER(HttpStatus.FORBIDDEN, "NOT_VALID_OWNER", "권한이 없는 이용자 입니다."),
        NOT_VALID_CHATROOM_MEMBER(HttpStatus.FORBIDDEN, "NOT_VALID_CHATROOM_MEMBER", "채팅방을 이용할 수 없는 사용자입니다."),

        NOT_FOUND_MEMBER(HttpStatus.NOT_FOUND, "NOT_FOUND_MEMBER", "찾을 수 없는 사용자입니다."),
        NOT_FOUND_USER(HttpStatus.NOT_FOUND, "NOT_FOUND_USER", "찾을 수 없는 부모 회원입니다."),
        NOT_FOUND_THERAPIST(HttpStatus.NOT_FOUND, "NOT_FOUND_THERAPIST", "찾을 수 없는 치료사 회원입니다."),
        NOT_FOUND_THERAPIST_INFO(HttpStatus.NOT_FOUND, "NOT_FOUND_THERAPIST_INFO", "찾을 수 없는 치료사 상세정보입니다."),
        NOT_FOUND_RESERVATION(HttpStatus.NOT_FOUND,"NOT_FOUND_RESERVATION","찾을 수 없는 예약정보입니다."),
        NOT_FOUND_CENTER(HttpStatus.NOT_FOUND,"NOT_FOUND_CENTER","찾을 수 없는 센터정보입니다."),
        NOT_FOUND_CHILD(HttpStatus.NOT_FOUND, "NOT_FOUND_CHILD","찾을 수 없는 아이입니다."),
        NOT_FOUND_THERAPIST_SYMPTOM(HttpStatus.NOT_FOUND,"NOT_FOUND_THERAPIST_SYMPTOM","찾을 수 없는 치료사 증상입니다"),
        NOT_FOUND_CHILD_SYMPTOM(HttpStatus.NOT_FOUND,"NOT_FOUND_CHILD_SYMPTOM","찾을 수 없는 아이증상입니다."),
        NOT_FOUND_FEED(HttpStatus.NOT_FOUND, "NOT_FOUND_FEED", "찾을 수 없는 피드입니다."),
        NOT_FOUND_REACTION(HttpStatus.NOT_FOUND, "NOT_FOUND_REACTION", "찾을 수 없는 리액션입니다."),
        NOT_FOUND_COMMENT(HttpStatus.NOT_FOUND, "NOT_FOUND_COMMENT", "찾을 수 없는 댓글입니다."),
        NOT_FOUND_SYMPTOM(HttpStatus.NOT_FOUND, "NOT_FOUND_SYMPTOM", "찾을 수 없는 증상입니다."),
        NOT_FOUND_PAGE(HttpStatus.NOT_FOUND, "NOT_FOUND_PAGE", "더 이상 페이지를 찾을 수 없습니다."),

        NOT_VALID_IMAGE(HttpStatus.UNSUPPORTED_MEDIA_TYPE, "NOT_VALID_IMAGE", "jpg, jpeg, png 형식만 업로드 가능합니다.");
        private final HttpStatus httpStatus;
        private final String code;
        private final String message;
    }

