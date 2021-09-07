package com.project.votingApp.model;

import lombok.*;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(callSuper = true)
public class Dish extends NamedEntity {
    @NotNull
    private LocalDate date;
    @ManyToOne
    @NotNull
    private Restaurant restaurant;
    @NotNull
    private Double price;
}

