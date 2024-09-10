package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class UpdatePromoOfferDiscountParamsDTO {
    /* Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым.  */
    Long price
    /* Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым.  */
    Long promoPrice
}
