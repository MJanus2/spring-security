package com.mjanus.practice.model;

import lombok.Data;
import lombok.Value;

@Data
@Value(staticConstructor = "of")
public class Book {
    String title;
    String author;
    int year;
}