package com.asemplinski.threegoodthings.domain;

import lombok.*;

import javax.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Day extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    LocalDate date;

    @OneToMany(targetEntity = Thing.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "Day_Things")
    List<Thing> thisDaysThings;

}
