package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OfferProcessingNoteType;

@Canonical
class OfferProcessingNoteDTO {
    
    OfferProcessingNoteType type
    /* Дополнительная информация о причине отклонения товара.  */
    String payload
}
