package com.sparta.memo.dto;

import com.sparta.memo.entity.Memo;
import lombok.Getter;

@Getter
public class MemoResponseDto {
    private Long id;
    private String username;
    private String contents;

    public MemoResponseDto(Memo memo) {
        this.id = memo.getId();;
        this.username = memo.getUsername();
        this.contents = memo.getContents();
    }
}

// 따로 생성하는 이유: DB와 소통하는 class는 조심스럽게 다루어야 하기 때문에