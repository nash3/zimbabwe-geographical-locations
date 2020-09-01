package com.nashe.zimbabwe.geographical.locations.province;

import com.nashe.zimbabwe.geographical.locations.common.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

@Data
@Entity
@Audited
@ToString
@Table(name = "province", indexes = {@Index(columnList = "name", unique = true)})
public class Province extends BaseEntity {

    @Column(name = "name")
    public String name;
}
