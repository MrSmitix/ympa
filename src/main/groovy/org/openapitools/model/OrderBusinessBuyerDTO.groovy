package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class OrderBusinessBuyerDTO {
    /* ИНН. */
    String inn
    /* КПП. */
    String kpp
    /* Наименование юридического лица. */
    String organizationName
    /* Юридический адрес. */
    String organizationJurAddress
}
