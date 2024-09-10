package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class GenerateShipmentListDocumentReportRequest {
    /* Идентификатор кампании. */
    Long campaignId
    /* Идентификатор отгрузки. */
    Long shipmentId
    /* Фильтр по идентификаторам заказа в отгрузке. */
    List<Long> orderIds
}
