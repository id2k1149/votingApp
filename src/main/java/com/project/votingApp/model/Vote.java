package com.project.votingApp.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(callSuper = true)
public class Vote extends BaseEntity {
    @NotNull
    private LocalDate date;
    @ManyToOne
    @NotNull
    private User user;
    @ManyToOne
    @NotNull
    private Restaurant restaurant;
}
