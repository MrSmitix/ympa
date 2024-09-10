package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class GoodsFeedbackIdentifiersDTO {
    /* Идентификатор заказа на Маркете. */
    Long orderId
    /* Идентификатор модели товара. */
    Long modelId
}
