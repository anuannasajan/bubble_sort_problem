package com.example.Bubble.sort.controller;

import com.example.Bubble.sort.request.SortRequest;
import com.example.Bubble.sort.response.SortResponse;
import com.example.Bubble.sort.service.BubbleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BubbleController {
    private final BubbleService bubbleService;

    @PostMapping("/bubbleSort")
    public SortResponse bubbleSort(@RequestBody SortRequest sortRequest){
        return bubbleService.bubbleSort(sortRequest.getArray());
    }
}
