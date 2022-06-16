package com.iso4digit.insuranceapi.models;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Branche{
    private Id _id;
    private ArrayList<String> alias;
    private String code;
    private DateType created_at;
    private int is_parent;
    private String name;
    private Object parent_branch_id;
    private int status;
    private String type;
    private DateType updated_at;
    private DateType deleted_at;
    
    public Id get_id() {
        return _id;
    }
    public void set_id(Id _id) {
        this._id = _id;
    }
    public ArrayList<String> getAlias() {
        return alias;
    }
    public void setAlias(ArrayList<String> alias) {
        this.alias = alias;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public DateType getCreated_at() {
        return created_at;
    }
    public void setCreated_at(DateType created_at) {
        this.created_at = created_at;
    }
    public int getIs_parent() {
        return is_parent;
    }
    public void setIs_parent(int is_parent) {
        this.is_parent = is_parent;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Object getParent_branch_id() {
        return parent_branch_id;
    }
    public void setParent_branch_id(Object parent_branch_id) {
        this.parent_branch_id = parent_branch_id;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public DateType getUpdated_at() {
        return updated_at;
    }
    public void setUpdated_at(DateType updated_at) {
        this.updated_at = updated_at;
    }
    public DateType getDeleted_at() {
        return deleted_at;
    }
    public void setDeleted_at(DateType deleted_at) {
        this.deleted_at = deleted_at;
    }

    
}




