package com.Legal.awareness.DigitalAwareness.entity;

import lombok.Data;
import java.util.List;

@Data
public class GeminiResponse {
    private List<Candidate> candidates;
}