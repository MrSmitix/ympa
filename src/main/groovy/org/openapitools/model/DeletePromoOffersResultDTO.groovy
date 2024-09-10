package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.RejectedPromoOfferDeleteDTO;

@Canonical
class DeletePromoOffersResultDTO {
    /* Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары.  */
    List<RejectedPromoOfferDeleteDTO> rejectedOffers
}
