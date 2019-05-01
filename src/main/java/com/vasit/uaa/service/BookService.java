package com.vasit.uaa.service;

import com.vasit.uaa.service.dto.BookDTO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {
    private final RestTemplate restTemplate;

    BookService() {
        this.restTemplate = new RestTemplate();
    }

    public List<BookDTO> all() {
        ParameterizedTypeReference<List<BookDTO>> responseType = new ParameterizedTypeReference<List<BookDTO>>() {
        };
        ResponseEntity<List<BookDTO>> responseEntity = restTemplate.exchange(
            "https://scb-test-book-publisher.herokuapp.com/books",
            HttpMethod.GET,
            ResponseEntity.EMPTY,
            responseType
        );

        List<BookDTO> books = responseEntity.getBody();
        List<BookDTO> recommendation = this.recommendation();

        if (books == null) {
           return null;
        }

        return books.stream()
            .peek(bookDTO -> bookDTO.setRecommended(
                recommendation.stream()
                    .anyMatch(recommendBook -> recommendBook.getId().equals(bookDTO.getId()))
            )).collect(Collectors.toList());
    }

    public List<BookDTO> recommendation() {
        ParameterizedTypeReference<List<BookDTO>> responseType = new ParameterizedTypeReference<List<BookDTO>>() {
        };
        ResponseEntity<List<BookDTO>> responseEntity = restTemplate.exchange(
            "https://scb-test-book-publisher.herokuapp.com/books/recommendation",
            HttpMethod.GET,
            ResponseEntity.EMPTY,
            responseType
        );

        return responseEntity.getBody();
    }
}
