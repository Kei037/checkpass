package com.checkpass.service;


import com.checkpass.dto.BoardDTO;
import com.checkpass.dto.PageRequestDTO;
import com.checkpass.dto.PageResponseDTO;

public interface BoardService {
    Long register(BoardDTO boardDTO);
    BoardDTO readOne(Long bno);
    void modify(BoardDTO boardDTO);
    void remove(Long bno);
    PageResponseDTO<BoardDTO> list(PageRequestDTO pageRequestDTO);
}
