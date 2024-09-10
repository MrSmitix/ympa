package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FeedPublicationFullDTO;
import org.openapitools.model.FeedPublicationPriceAndStockUpdateDTO;
import org.openapitools.model.FeedStatusType;

@Canonical
class FeedPublicationDTO {
    
    FeedStatusType status
    
    FeedPublicationFullDTO full
    
    FeedPublicationPriceAndStockUpdateDTO priceAndStockUpdate
}
