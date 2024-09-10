package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class OfferMappingDTO {
    /* SKU на Маркете. */
    Long marketSku
    /* Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара.  */
    Long modelId
    /* Идентификатор категории для текущей карточки товара на Маркете. */
    Long categoryId
}
