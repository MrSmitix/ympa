package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.OutletLicenseDTO;

@Canonical
class UpdateOutletLicenseRequest {
    /* Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии.  */
    List<OutletLicenseDTO> licenses = new ArrayList<>()
}
