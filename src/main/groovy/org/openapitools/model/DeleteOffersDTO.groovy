package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class DeleteOffersDTO {
    /* Список SKU товаров, которые не удалось удалить. */
    List<String> notDeletedOfferIds
}
