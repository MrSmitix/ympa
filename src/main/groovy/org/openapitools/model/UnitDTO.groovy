package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class UnitDTO {
    /* Идентификатор единицы измерения. */
    Long id
    /* Сокращенное название единицы измерения. */
    String name
    /* Полное название единицы измерения. */
    String fullName
}
