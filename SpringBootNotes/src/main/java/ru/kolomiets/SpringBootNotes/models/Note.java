package ru.kolomiets.SpringBootNotes.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDateTime;


@Getter
@Setter
@Entity
public class Note {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String info;

    private LocalDateTime data;

    @PrePersist
    protected void onCreate() {
        this.data = LocalDateTime.now();
    }

    public LocalDateTime getData() {
        return data;
    }
}
