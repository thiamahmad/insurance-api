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
public class Data {

    private String references;
    private String country;
    private String cedants;
    private String validationStatus;
    private String confirmationStatus;
    private String publicationDate;
    private String branche;
    private BigDecimal calculatedREC;
    
    public Data() {
    }
    public Data(String references, String country, String cedants, String validationStatus, String confirmationStatus,
            String publicationDate, String branche, BigDecimal calculatedREC) {
        this.references = references;
        this.country = country;
        this.cedants = cedants;
        this.validationStatus = validationStatus;
        this.confirmationStatus = confirmationStatus;
        this.publicationDate = publicationDate;
        this.branche = branche;
        this.calculatedREC = calculatedREC;
    }
    
    public String getReferences() {
        return references;
    }
    public void setReferences(String references) {
        this.references = references;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCedants() {
        return cedants;
    }
    public void setCedants(String cedants) {
        this.cedants = cedants;
    }
    public String getValidationStatus() {
        return validationStatus;
    }
    public void setValidationStatus(String validationStatus) {
        this.validationStatus = validationStatus;
    }
    public String getConfirmationStatus() {
        return confirmationStatus;
    }
    public void setConfirmationStatus(String confirmationStatus) {
        this.confirmationStatus = confirmationStatus;
    }
    public String getPublicationDate() {
        return publicationDate;
    }
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }
    public String getBranche() {
        return branche;
    }
    public void setBranche(String branche) {
        this.branche = branche;
    }
    public BigDecimal getCalculatedREC() {
        return calculatedREC;
    }
    public void setCalculatedREC(BigDecimal calculatedREC) {
        this.calculatedREC = calculatedREC;
    }
}
