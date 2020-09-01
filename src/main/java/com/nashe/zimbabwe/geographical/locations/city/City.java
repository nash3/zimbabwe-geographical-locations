package com.nashe.zimbabwe.geographical.locations.city;

import com.nashe.zimbabwe.geographical.locations.common.BaseEntity;
import com.nashe.zimbabwe.geographical.locations.district.District;
import com.nashe.zimbabwe.geographical.locations.province.Province;
import lombok.Data;
import lombok.ToString;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Data
@Entity
@Audited
@ToString
@Table(name = "city", indexes = {@Index(columnList = "name", unique = true)})
public class City extends BaseEntity {

    @Column(name = "name")
    public String name;

    @Column(name = "telephone_code")
    public String telephoneCode;

    @ManyToOne
    public District district;

    @ManyToOne
    public Province province;
}
