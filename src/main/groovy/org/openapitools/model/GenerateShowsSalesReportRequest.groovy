package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ShowsSalesGroupingType;

@Canonical
class GenerateShowsSalesReportRequest {
    /* Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу.  */
    Long businessId
    /* Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу.  */
    Long campaignId
    /* Начало периода, включительно. */
    Date dateFrom
    /* Конец периода, включительно. */
    Date dateTo
    
    ShowsSalesGroupingType grouping
}
