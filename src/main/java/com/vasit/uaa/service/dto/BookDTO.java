package com.vasit.uaa.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

@JsonIgnoreProperties({
    "recommended"
})
public class BookDTO {
    private Long id;

    @JsonProperty("book_name")
    private String bookName;

    @JsonProperty("author_name")
    private String authorName;

    private BigDecimal price;

    @JsonProperty("is_recommended")
    private Boolean isRecommended = false;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getRecommended() {
        return isRecommended;
    }

    public void setRecommended(Boolean isRecommended) {
        this.isRecommended = isRecommended;
    }
}
