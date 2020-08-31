package com.nashe.zimbabwe.geographical.locations.district;

import com.nashe.zimbabwe.geographical.locations.common.BaseEntity;
import com.nashe.zimbabwe.geographical.locations.province.Province;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@ToString
@Table(name = "name", indexes = {@Index(columnList = "name", unique = true)})
public class District extends BaseEntity {

    @Column(name = "name")
    public String name;

    @ManyToOne
    public Province province;

}
