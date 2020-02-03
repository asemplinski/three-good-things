package com.asemplinski.threegoodthings.domain;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity

public class Thing extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    Integer daysOrder;

    String thing;

    @ManyToOne(targetEntity = Day.class)
    @JoinColumn(name = "Day_Things")

    Day day;


}
