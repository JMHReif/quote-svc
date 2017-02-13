package com.example;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by jennifer on 2/13/17.
 */
@Data
@NoArgsConstructor
@Entity
public class Quote {
    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private String source;

    public Quote(String text, String source) {
        this.text = text;
        this.source = source;
    }
}
