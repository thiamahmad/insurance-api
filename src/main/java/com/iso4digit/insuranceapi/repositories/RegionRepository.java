package com.iso4digit.insuranceapi.repositories;

import java.util.Arrays;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.iso4digit.insuranceapi.models.Branche;
import com.iso4digit.insuranceapi.models.Cedant;
import com.iso4digit.insuranceapi.models.Region;
import com.iso4digit.insuranceapi.utils.DataLoader;

@Service
public class RegionRepository {

    private static Region[] regions;
    static {
        regions = DataLoader.loadData("src/main/resources/region.json", Region[].class);
    }

    public Region findRegionById(String id) {
        return Arrays.stream(regions)
                .filter(c -> Objects.equals(c.get_id().getOid(), id))
                .findFirst()
                .orElse(null);
    }

    public Region findCendantRegion(Cedant d) {
        return Arrays.stream(regions)
                .filter(c -> Objects.equals(c.get_id().getOid(), d.getRegion_id().getOid()))
                .findFirst()
                .orElse(null);
    }
}
