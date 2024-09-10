package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AffectedOrderQualityRatingComponentType;

@Canonical
class QualityRatingAffectedOrderDTO {
    /* Идентификатор заказа. */
    Long orderId
    /* Описание проблемы. */
    String description
    
    AffectedOrderQualityRatingComponentType componentType
}
