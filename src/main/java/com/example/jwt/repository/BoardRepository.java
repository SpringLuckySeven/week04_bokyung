package com.example.jwt.repository;

import com.example.jwt.model.Board;
import com.example.jwt.model.ShowAllBoardList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    List<ShowAllBoardList> findAllByOrderByCreatedAtDesc();
}