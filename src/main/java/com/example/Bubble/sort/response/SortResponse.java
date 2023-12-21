package com.example.Bubble.sort.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SortResponse {
    private int[] sortedArray;
    private long executionTime;
}

