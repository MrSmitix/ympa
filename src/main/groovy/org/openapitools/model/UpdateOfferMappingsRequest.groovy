package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.UpdateOfferMappingDTO;

@Canonical
class UpdateOfferMappingsRequest {
    /* Перечень товаров, которые нужно добавить или обновить. */
    List<UpdateOfferMappingDTO> offerMappings = new ArrayList<>()
    /* Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`.  */
    Boolean onlyPartnerMediaContent
}
