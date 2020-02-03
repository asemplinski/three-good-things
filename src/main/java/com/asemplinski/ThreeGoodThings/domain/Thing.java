package com.asemplinski.ThreeGoodThings.domain;

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


    Integer daysOrder;

    String thing;

    @ManyToOne(targetEntity = Day.class)
            @JoinColumn(name = "Day_Things")
    Day day;


}
