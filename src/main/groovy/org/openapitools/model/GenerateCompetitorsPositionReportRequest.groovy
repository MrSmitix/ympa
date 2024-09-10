package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class GenerateCompetitorsPositionReportRequest {
    /* Идентификатор бизнеса. */
    Long businessId
    /* Идентификатор категории. */
    Long categoryId
    /* Начало периода, включительно. */
    Date dateFrom
    /* Конец периода, включительно. */
    Date dateTo
}
