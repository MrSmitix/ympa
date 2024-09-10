package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OfferContentErrorType;

@Canonical
class OfferContentErrorDTO {
    
    OfferContentErrorType type
    /* Идентификатор характеристики, с которой связана ошибка. */
    Long parameterId
    /* Текст ошибки. */
    String message
}
