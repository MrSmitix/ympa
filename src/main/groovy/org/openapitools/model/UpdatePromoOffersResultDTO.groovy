package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.RejectedPromoOfferUpdateDTO;
import org.openapitools.model.WarningPromoOfferUpdateDTO;

@Canonical
class UpdatePromoOffersResultDTO {
    /* Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения.  */
    List<RejectedPromoOfferUpdateDTO> rejectedOffers
    /* Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения.  */
    List<WarningPromoOfferUpdateDTO> warningOffers
}
