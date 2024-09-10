package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PriceQuarantineVerdictParamNameType;

@Canonical
class PriceQuarantineVerdictParameterDTO {
    
    PriceQuarantineVerdictParamNameType name
    /* Значение параметра. */
    String value
}
