package com.iso4digit.insuranceapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Country{
    private Id _id;
    private String code;
    private String name;
    private Id regions_id;
    private DateType updated_at;
    private DateType created_at;
    private DateType deleted_at;

    public DateType getDeleted_at() {
        return deleted_at;
    }
    public void setDeleted_at(DateType deleted_at) {
        this.deleted_at = deleted_at;
    }
    public Id get_id() {
        return _id;
    }
    public void set_id(Id _id) {
        this._id = _id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Id getRegions_id() {
        return regions_id;
    }
    public void setRegions_id(Id regions_id) {
        this.regions_id = regions_id;
    }
    public DateType getUpdated_at() {
        return updated_at;
    }
    public void setUpdated_at(DateType updated_at) {
        this.updated_at = updated_at;
    }
    public DateType getCreated_at() {
        return created_at;
    }
    public void setCreated_at(DateType created_at) {
        this.created_at = created_at;
    }
    
}