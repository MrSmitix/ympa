package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PromoOfferParticipationStatusFilterType;

@Canonical
class GetPromoOffersRequest {
    /* Идентификатор акции. */
    String promoId
    
    PromoOfferParticipationStatusFilterType statusType
}
