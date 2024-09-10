package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class GenerateGoodsRealizationReportRequest {
    /* Идентификатор кампании. */
    Long campaignId
    /* Год. */
    Integer year
    /* Номер месяца. */
    Integer month
}
