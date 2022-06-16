package com.iso4digit.insuranceapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GroupCedant{
    
    private Id _id;
    private DateType created_at;
    private String name;
    private DateType updated_at;

    public Id get_id() {
        return _id;
    }
    public void set_id(Id _id) {
        this._id = _id;
    }
    public DateType getCreated_at() {
        return created_at;
    }
    public void setCreated_at(DateType created_at) {
        this.created_at = created_at;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public DateType getUpdated_at() {
        return updated_at;
    }
    public void setUpdated_at(DateType updated_at) {
        this.updated_at = updated_at;
    }
}