package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class BusinessDTO {
    /* Идентификатор кабинета. */
    Long id
    /* Название бизнеса. */
    String name
}
