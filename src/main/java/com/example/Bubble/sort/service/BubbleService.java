package com.example.Bubble.sort.service;

import com.example.Bubble.sort.response.SortResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BubbleService {
    public SortResponse bubbleSort(int[] array) {
        long startTime = System.nanoTime();

        int n=array.length;
        for (int i=0; i<n; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        return new SortResponse(array, executionTime);
    }
}
