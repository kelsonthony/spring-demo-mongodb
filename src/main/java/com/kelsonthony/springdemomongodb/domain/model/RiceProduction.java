package com.kelsonthony.springdemomongodb.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Objects;

@Document("rice_production")
public class RiceProduction {

    @Id
    private String id;
    @Field("Area")
    private String area;
    @Field("Year")
    private String year;
    @Field("Unit")
    private String unit;
    @Field("Value")
    private String value;
    @Field("Flag")
    private String flag;
    @Field("Flag Description")
    private String flagDescription;

    public RiceProduction() {
    }

    public RiceProduction(String id, String area, String year, String unit, String value, String flag, String flagDescription) {
        this.id = id;
        this.area = area;
        this.year = year;
        this.unit = unit;
        this.value = value;
        this.flag = flag;
        this.flagDescription = flagDescription;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getFlagDescription() {
        return flagDescription;
    }

    public void setFlagDescription(String flagDescription) {
        this.flagDescription = flagDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RiceProduction that = (RiceProduction) o;
        return Objects.equals(id, that.id) && Objects.equals(area, that.area) && Objects.equals(year, that.year) && Objects.equals(unit, that.unit) && Objects.equals(value, that.value) && Objects.equals(flag, that.flag) && Objects.equals(flagDescription, that.flagDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, area, year, unit, value, flag, flagDescription);
    }

    @Override
    public String toString() {
        return "RiceProduction{" +
                "id='" + id + '\'' +
                ", area='" + area + '\'' +
                ", year='" + year + '\'' +
                ", unit='" + unit + '\'' +
                ", value='" + value + '\'' +
                ", flag='" + flag + '\'' +
                ", flagDescription='" + flagDescription + '\'' +
                '}';
    }


}
