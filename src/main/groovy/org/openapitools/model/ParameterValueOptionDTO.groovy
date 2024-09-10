package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ParameterValueOptionDTO {
    /* Идентификатор значения. */
    Long id
    /* Значение. */
    String value
    /* Описание значения. */
    String description
}
