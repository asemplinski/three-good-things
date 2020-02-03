package com.asemplinski.ThreeGoodThings.domain;

import lombok.*;

import javax.persistence.Entity;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Day extends BaseEntity{

    Date date;

    @OneToMany(targetEntity = Thing.class)
            @JoinColumn(name="Day_Things")
    List<Thing> thisDaysThings;

}
