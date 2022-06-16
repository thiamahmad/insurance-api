package com.iso4digit.insuranceapi.repositories;

import java.util.Arrays;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.iso4digit.insuranceapi.models.Branche;
import com.iso4digit.insuranceapi.models.Id;
import com.iso4digit.insuranceapi.models.Slip;
import com.iso4digit.insuranceapi.utils.DataLoader;

@Service
public class SlipRepository {

    private static Slip[] slips;
    static {
        slips = DataLoader.loadData("src/main/resources/slips_premium.json", Slip[].class);
    }

    public Slip findSlipeById(String id) {
        return Arrays.stream(slips)
                .filter(c -> Objects.equals(c.get_id().getOid(), id))
                .findFirst()
                .orElse(null);
    }

    public Slip getData(String id) {
        return Arrays.stream(slips)
                .filter(c -> Objects.equals(c.get_id().getOid(), id))
                .findFirst()
                .orElse(null);
    }

    public String getValidationStatus(Id slipId){
        return this.findSlipeById(slipId.getOid()).getValidation_status();
    }
    public String getConfirmationStatus(Id slipId){
        return this.findSlipeById(slipId.getOid()).getConfirmation_status();
    }
    public String getPublishedDate(Id slipId){
        return this.findSlipeById(slipId.getOid()).getPublished_date();
    }
    public String getEditedPeriode(Id slipId){
        return this.findSlipeById(slipId.getOid()).getEdited_period();
    }

    public Slip[] getSlips() {
        return this.slips;
    }
}
