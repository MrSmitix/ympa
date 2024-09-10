package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class GenerateUnitedOrdersRequest {
    /* Идентификатор бизнеса. */
    Long businessId
    /* Начало периода, включительно. */
    Date dateFrom
    /* Конец периода, включительно. Максимальный период — 1 год. */
    Date dateTo
    /* Список магазинов, которые нужны в отчете. */
    List<Long> campaignIds
    /* Идентификатор акции, товары из которой нужны в отчете. */
    String promoId
}
