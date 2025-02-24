package com.infinity.nto.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EntryDto {
    private long codeId;
    private LocalDateTime entryTime;
    private boolean isCard;
}
