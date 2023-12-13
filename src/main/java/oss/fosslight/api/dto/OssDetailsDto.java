package oss.fosslight.api.dto;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class OssDetailsDto extends OssDto {
    List<String> ossNicknames;
    List<LicenseDto> licenses;
    List<VulnerabilityDto> vulnerabilities;
    String copyright;
    Boolean deactivate;
    String attribution;

    public void setDeactivate(String deactivateFlag) {
        deactivate = !"Y".equals(deactivateFlag);
    }
}
