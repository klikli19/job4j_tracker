package ru.job4j.tracker.tracker;

import lombok.*;

@ToString
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@RequiredArgsConstructor
public class Category {

    @NonNull
    @EqualsAndHashCode.Include
    private Integer id;

    @Setter
    private String name;
}