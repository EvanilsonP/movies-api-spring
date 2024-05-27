package com.movies.api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Title field is mandatory.")
    @Column(name = "movie", unique = true)
    private String title;

    @NotBlank(message = "Description field is mandatory.")
    @Column(name = "description")
    private String description;

    @NotBlank(message = "Genre field is mandatory.")
    @Column(name = "genre")
    private String genre;

    @NotNull(message = "Release date field is mandatory.")
    @Column(name = "release_date")
    private LocalDate releaseDate;

    @NotBlank(message = "The Director field is mandatory.")
    @Column(name = "director")
    private String director;

    @NotNull(message = "The Rating field is mandatory.")
    @Column(name = "rating")
    private Double rating;

}

