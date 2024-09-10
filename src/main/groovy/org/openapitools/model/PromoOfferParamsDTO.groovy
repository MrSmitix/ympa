package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PromoOfferDiscountParamsDTO;
import org.openapitools.model.PromoOfferPromocodeParamsDTO;

@Canonical
class PromoOfferParamsDTO {
    
    PromoOfferDiscountParamsDTO discountParams
    
    PromoOfferPromocodeParamsDTO promocodeParams
}
