package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ShelfsStatisticsAttributionType;

@Canonical
class GenerateShelfsStatisticsRequest {
    /* Идентификатор бизнеса. */
    Long businessId
    /* Начало периода, включительно. */
    Date dateFrom
    /* Конец периода, включительно. */
    Date dateTo
    
    ShelfsStatisticsAttributionType attributionType
}
