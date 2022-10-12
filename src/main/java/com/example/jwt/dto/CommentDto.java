package com.example.jwt.dto;

import com.example.jwt.model.Board;
import com.example.jwt.model.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class CommentDto {
    private String comment;
    private Board board;
    private User user;
}