package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FeedStatusType;

@Canonical
class FeedPlacementDTO {
    
    FeedStatusType status
    /* Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса. */
    Integer totalOffersCount
}
