package com.iso4digit.insuranceapi.models;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CaseType{
    private Id _id;
    private int active_status;
    private String branch;
    private Id branches_id;
    private String case_validation_status;
    private String case_variant;
    private String category;
    private Id cedants_id;
    private double commission_cession;
    private Object commission_refunded;
    private String date_effective;
    private String date_transaction;
    private String deadline;
    private String insured_capital;
    private Object invoiced_premium;
    private String nature_risque_id;
    private Object net_amount;
    private double paid_commission;
    private double part_cedant_coass;
    private String policy_number;
    private double premium_ceded;
    private double premium_ht;
    private double prime_net_ceded;
    private Id slipes_prime_id;
    private Id sub_branches_id;
    private DateType updated_at;

    public Id get_id() {
        return _id;
    }
    public void set_id(Id _id) {
        this._id = _id;
    }
    public int getActive_status() {
        return active_status;
    }
    public void setActive_status(int active_status) {
        this.active_status = active_status;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public Id getBranches_id() {
        return branches_id;
    }
    public void setBranches_id(Id branches_id) {
        this.branches_id = branches_id;
    }
    public String getCase_validation_status() {
        return case_validation_status;
    }
    public void setCase_validation_status(String case_validation_status) {
        this.case_validation_status = case_validation_status;
    }
    public String getCase_variant() {
        return case_variant;
    }
    public void setCase_variant(String case_variant) {
        this.case_variant = case_variant;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public Id getCedants_id() {
        return cedants_id;
    }
    public void setCedants_id(Id cedants_id) {
        this.cedants_id = cedants_id;
    }
    public double getCommission_cession() {
        return commission_cession;
    }
    public void setCommission_cession(double commission_cession) {
        this.commission_cession = commission_cession;
    }
    public Object getCommission_refunded() {
        return commission_refunded;
    }
    public void setCommission_refunded(Object commission_refunded) {
        this.commission_refunded = commission_refunded;
    }
    public String getDate_effective() {
        return date_effective;
    }
    public void setDate_effective(String date_effective) {
        this.date_effective = date_effective;
    }
    public String getDate_transaction() {
        return date_transaction;
    }
    public void setDate_transaction(String date_transaction) {
        this.date_transaction = date_transaction;
    }
    public String getDeadline() {
        return deadline;
    }
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
    public String getInsured_capital() {
        return insured_capital;
    }
    public void setInsured_capital(String insured_capital) {
        this.insured_capital = insured_capital;
    }
    public Object getInvoiced_premium() {
        return invoiced_premium;
    }
    public void setInvoiced_premium(Object invoiced_premium) {
        this.invoiced_premium = invoiced_premium;
    }
    public String getNature_risque_id() {
        return nature_risque_id;
    }
    public void setNature_risque_id(String nature_risque_id) {
        this.nature_risque_id = nature_risque_id;
    }
    public Object getNet_amount() {
        return net_amount;
    }
    public void setNet_amount(Object net_amount) {
        this.net_amount = net_amount;
    }
    public double getPaid_commission() {
        return paid_commission;
    }
    public void setPaid_commission(double paid_commission) {
        this.paid_commission = paid_commission;
    }
    public double getPart_cedant_coass() {
        return part_cedant_coass;
    }
    public void setPart_cedant_coass(double part_cedant_coass) {
        this.part_cedant_coass = part_cedant_coass;
    }
    public String getPolicy_number() {
        return policy_number;
    }
    public void setPolicy_number(String policy_number) {
        this.policy_number = policy_number;
    }
    public double getPremium_ceded() {
        return premium_ceded;
    }
    public void setPremium_ceded(double premium_ceded) {
        this.premium_ceded = premium_ceded;
    }
    public double getPremium_ht() {
        return premium_ht;
    }
    public void setPremium_ht(double premium_ht) {
        this.premium_ht = premium_ht;
    }
    public double getPrime_net_ceded() {
        return prime_net_ceded;
    }
    public void setPrime_net_ceded(double prime_net_ceded) {
        this.prime_net_ceded = prime_net_ceded;
    }
    public Id getSlipes_prime_id() {
        return slipes_prime_id;
    }
    public void setSlipes_prime_id(Id slipes_prime_id) {
        this.slipes_prime_id = slipes_prime_id;
    }
    public Id getSub_branches_id() {
        return sub_branches_id;
    }
    public void setSub_branches_id(Id sub_branches_id) {
        this.sub_branches_id = sub_branches_id;
    }
    public DateType getUpdated_at() {
        return updated_at;
    }
    public void setUpdated_at(DateType updated_at) {
        this.updated_at = updated_at;
    }
}