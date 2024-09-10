package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class PromoOfferDiscountParamsDTO {
    /* Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  */
    Long price
    /* Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  */
    Long promoPrice
    /* Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров.  */
    Long maxPromoPrice
}
