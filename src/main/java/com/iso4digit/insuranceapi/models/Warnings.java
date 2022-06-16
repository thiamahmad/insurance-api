package com.iso4digit.insuranceapi.models;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Warnings {

    @JsonIgnore
    public PremiumSlipCaseCheck premium_slip_case_check;

    private ArrayList<NonBlockingCase> non_blocking_cases;
    private ArrayList<CriticalCase> critical_cases;
    private ArrayList<NoIssuesCase> no_issues_cases;

    public ArrayList<NonBlockingCase> getNon_blocking_cases() {
        return non_blocking_cases;
    }

    public void setNon_blocking_cases(ArrayList<NonBlockingCase> non_blocking_cases) {
        this.non_blocking_cases = non_blocking_cases;
    }

    public ArrayList<CriticalCase> getCritical_cases() {
        return critical_cases;
    }

    public void setCritical_cases(ArrayList<CriticalCase> critical_cases) {
        this.critical_cases = critical_cases;
    }

    public ArrayList<NoIssuesCase> getNo_issues_cases() {
        return no_issues_cases;
    }

    public void setNo_issues_cases(ArrayList<NoIssuesCase> no_issues_cases) {
        this.no_issues_cases = no_issues_cases;
    }

    public PremiumSlipCaseCheck getPremium_slip_case_check() {
        return premium_slip_case_check;
    }

    public void setPremium_slip_case_check(PremiumSlipCaseCheck premium_slip_case_check) {
        this.premium_slip_case_check = premium_slip_case_check;
    }
}