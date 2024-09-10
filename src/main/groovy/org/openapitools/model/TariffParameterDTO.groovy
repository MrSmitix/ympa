package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class TariffParameterDTO {
    /* Название параметра. */
    String name
    /* Значение параметра. */
    String value
}
