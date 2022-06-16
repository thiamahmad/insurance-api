package com.iso4digit.insuranceapi.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Slip{
    private Id _id;
    private String approval_status;
    private Id cedants_id;
    private Id cedants_type_id;
    private Object commission_refunded_total;
    private String confirmation_date;
    private String confirmation_status;
    private DateType created_at;
    private String edited_period;
    private String file_url;
    private Object invoice_premium_total;
    private int is_paid;
    private Object net_amount_total;
    private String published_date;
    private String reference;
    private Id reinsurances_id;
    private String slip_type;
    private int update_progress;
    private int update_status;
    private DateType updated_at;
    private Id user_cedant_id;
    private String validation_date;
    private String validation_status;
    @JsonIgnore
    private Warnings warnings;
    private int warnings_saved;
    public Id get_id() {
        return _id;
    }
    public void set_id(Id _id) {
        this._id = _id;
    }
    public String getApproval_status() {
        return approval_status;
    }
    public void setApproval_status(String approval_status) {
        this.approval_status = approval_status;
    }
    public Id getCedants_id() {
        return cedants_id;
    }
    public void setCedants_id(Id cedants_id) {
        this.cedants_id = cedants_id;
    }
    public Id getCedants_type_id() {
        return cedants_type_id;
    }
    public void setCedants_type_id(Id cedants_type_id) {
        this.cedants_type_id = cedants_type_id;
    }
    public Object getCommission_refunded_total() {
        return commission_refunded_total;
    }
    public void setCommission_refunded_total(Object commission_refunded_total) {
        this.commission_refunded_total = commission_refunded_total;
    }
    public String getConfirmation_date() {
        return confirmation_date;
    }
    public void setConfirmation_date(String confirmation_date) {
        this.confirmation_date = confirmation_date;
    }
    public String getConfirmation_status() {
        return confirmation_status;
    }
    public void setConfirmation_status(String confirmation_status) {
        this.confirmation_status = confirmation_status;
    }
    public DateType getCreated_at() {
        return created_at;
    }
    public void setCreated_at(DateType created_at) {
        this.created_at = created_at;
    }
    public String getEdited_period() {
        return edited_period;
    }
    public void setEdited_period(String edited_period) {
        this.edited_period = edited_period;
    }
    public String getFile_url() {
        return file_url;
    }
    public void setFile_url(String file_url) {
        this.file_url = file_url;
    }
    public Object getInvoice_premium_total() {
        return invoice_premium_total;
    }
    public void setInvoice_premium_total(Object invoice_premium_total) {
        this.invoice_premium_total = invoice_premium_total;
    }
    public int getIs_paid() {
        return is_paid;
    }
    public void setIs_paid(int is_paid) {
        this.is_paid = is_paid;
    }
    public Object getNet_amount_total() {
        return net_amount_total;
    }
    public void setNet_amount_total(Object net_amount_total) {
        this.net_amount_total = net_amount_total;
    }
    public String getPublished_date() {
        return published_date;
    }
    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }
    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    public Id getReinsurances_id() {
        return reinsurances_id;
    }
    public void setReinsurances_id(Id reinsurances_id) {
        this.reinsurances_id = reinsurances_id;
    }
    public String getSlip_type() {
        return slip_type;
    }
    public void setSlip_type(String slip_type) {
        this.slip_type = slip_type;
    }
    public int getUpdate_progress() {
        return update_progress;
    }
    public void setUpdate_progress(int update_progress) {
        this.update_progress = update_progress;
    }
    public int getUpdate_status() {
        return update_status;
    }
    public void setUpdate_status(int update_status) {
        this.update_status = update_status;
    }
    public DateType getUpdated_at() {
        return updated_at;
    }
    public void setUpdated_at(DateType updated_at) {
        this.updated_at = updated_at;
    }
    public Id getUser_cedant_id() {
        return user_cedant_id;
    }
    public void setUser_cedant_id(Id user_cedant_id) {
        this.user_cedant_id = user_cedant_id;
    }
    public String getValidation_date() {
        return validation_date;
    }
    public void setValidation_date(String validation_date) {
        this.validation_date = validation_date;
    }
    public String getValidation_status() {
        return validation_status;
    }
    public void setValidation_status(String validation_status) {
        this.validation_status = validation_status;
    }
    public Warnings getWarnings() {
        return warnings;
    }
    public void setWarnings(Warnings warnings) {
        this.warnings = warnings;
    }
    public int getWarnings_saved() {
        return warnings_saved;
    }
    public void setWarnings_saved(int warnings_saved) {
        this.warnings_saved = warnings_saved;
    }
}