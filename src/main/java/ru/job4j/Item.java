package ru.job4j;

import lombok.*;

import javax.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "items")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    private String name;

    private LocalDateTime created = LocalDateTime.now();

}

