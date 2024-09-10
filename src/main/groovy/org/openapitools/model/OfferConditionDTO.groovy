package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OfferConditionQualityType;
import org.openapitools.model.OfferConditionType;

@Canonical
class OfferConditionDTO {
    
    OfferConditionType type
    
    OfferConditionQualityType quality
    /* Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать.  */
    String reason
}
