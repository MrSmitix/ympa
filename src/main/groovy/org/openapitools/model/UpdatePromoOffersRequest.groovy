package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.UpdatePromoOfferDTO;

@Canonical
class UpdatePromoOffersRequest {
    /* Идентификатор акции. */
    String promoId
    /* Товары, которые необходимо добавить в акцию или цены которых нужно изменить. */
    List<UpdatePromoOfferDTO> offers = new ArrayList<>()
}
