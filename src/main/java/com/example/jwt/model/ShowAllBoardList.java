package com.example.jwt.model;

import java.time.LocalDateTime;

public interface ShowAllBoardList {
    LocalDateTime getCreatedAt();
    LocalDateTime getModifiedAt();
    Long getId();
    String getTitle();
    String getContent();
    String getUsername();
}
