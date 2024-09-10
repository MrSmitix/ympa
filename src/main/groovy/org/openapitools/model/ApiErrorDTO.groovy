package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ApiErrorDTO {
    /* Код ошибки. */
    String code
    /* Описание ошибки. */
    String message
}
