package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrderBuyerType;

@Canonical
class OrderBuyerDTO {
    /* Идентификатор покупателя. */
    String id
    /* Фамилия покупателя. */
    String lastName
    /* Имя покупателя. */
    String firstName
    /* Отчество покупателя. */
    String middleName
    
    OrderBuyerType type
}
