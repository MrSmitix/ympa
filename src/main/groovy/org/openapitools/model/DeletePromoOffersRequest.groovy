package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class DeletePromoOffersRequest {
    /* Идентификатор акции. */
    String promoId
    /* Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`. */
    Boolean deleteAllOffers
    /* Товары, которые нужно убрать из акции. */
    List<String> offerIds
}
