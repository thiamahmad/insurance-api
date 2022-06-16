package com.iso4digit.insuranceapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cedant{
    private Id _id;
    private String benefit_percentage;
    private String code;
    private String color1;
    private String color2;
    private String contact;
    private Id countries_id;
    private DateType created_at;
    private Id currencies_id;
    private String email;
    private String estimation_type;
    private Id groups_cedants_id;
    private String logo;
    private String name;
    private Id region_id;
    private Id reinsurances_id;
    private Id types_cedants_id;
    private DateType updated_at;

    public Id get_id() {
        return _id;
    }
    public void set_id(Id _id) {
        this._id = _id;
    }
    public String getBenefit_percentage() {
        return benefit_percentage;
    }
    public void setBenefit_percentage(String benefit_percentage) {
        this.benefit_percentage = benefit_percentage;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getColor1() {
        return color1;
    }
    public void setColor1(String color1) {
        this.color1 = color1;
    }
    public String getColor2() {
        return color2;
    }
    public void setColor2(String color2) {
        this.color2 = color2;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public Id getCountries_id() {
        return countries_id;
    }
    public void setCountries_id(Id countries_id) {
        this.countries_id = countries_id;
    }
    public DateType getCreated_at() {
        return created_at;
    }
    public void setCreated_at(DateType created_at) {
        this.created_at = created_at;
    }
    public Id getCurrencies_id() {
        return currencies_id;
    }
    public void setCurrencies_id(Id currencies_id) {
        this.currencies_id = currencies_id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEstimation_type() {
        return estimation_type;
    }
    public void setEstimation_type(String estimation_type) {
        this.estimation_type = estimation_type;
    }
    public Id getGroups_cedants_id() {
        return groups_cedants_id;
    }
    public void setGroups_cedants_id(Id groups_cedants_id) {
        this.groups_cedants_id = groups_cedants_id;
    }
    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Id getRegion_id() {
        return region_id;
    }
    public void setRegion_id(Id region_id) {
        this.region_id = region_id;
    }
    public Id getReinsurances_id() {
        return reinsurances_id;
    }
    public void setReinsurances_id(Id reinsurances_id) {
        this.reinsurances_id = reinsurances_id;
    }
    public Id getTypes_cedants_id() {
        return types_cedants_id;
    }
    public void setTypes_cedants_id(Id types_cedants_id) {
        this.types_cedants_id = types_cedants_id;
    }
    public DateType getUpdated_at() {
        return updated_at;
    }
    public void setUpdated_at(DateType updated_at) {
        this.updated_at = updated_at;
    }
}