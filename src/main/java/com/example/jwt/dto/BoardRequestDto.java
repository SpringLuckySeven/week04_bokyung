package com.example.jwt.dto;

import com.example.jwt.model.Comment;
import com.example.jwt.model.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class BoardRequestDto {
    private String title;
    private String content;
    private User user;
    private List<Comment> commentList;
}
