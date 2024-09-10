package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ParameterValueConstraintsDTO {
    /* Минимальное число. */
    Double minValue
    /* Максимальное число. */
    Double maxValue
    /* Максимальная длина текста. */
    Integer maxLength
}
