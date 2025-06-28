package com.substring.irctc.dto;

import org.springframework.data.domain.Page;

import java.util.List;
//Records are immutable by default, which means once data is set, it cannot be changed. This is ideal for: DTO
public record PagedResponse<T>(
        List<T> content,
        int page,
        int size,
        long totalElements,
        int totalPages,
        boolean last,
        boolean first
) {


    public static <T> PagedResponse<T> fromPage(Page<T> page) {
        return new PagedResponse<>(
                page.getContent(),
                page.getNumber(),
                page.getSize(),
                page.getTotalElements(),
                page.getTotalPages(),
                page.isLast(),
                page.isFirst()
        );
    }

}
