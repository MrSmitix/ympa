package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PlacementType;

@Canonical
class GenerateUnitedMarketplaceServicesReportRequest {
    /* Идентификатор бизнеса. */
    Long businessId
    /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  */
    Date dateTimeFrom
    /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  */
    Date dateTimeTo
    /* Начало периода, включительно. */
    Date dateFrom
    /* Конец периода, включительно. Максимальный период — 1 год. */
    Date dateTo
    /* Начальный год формирования акта. */
    Integer yearFrom
    /* Начальный номер месяца формирования акта. */
    Integer monthFrom
    /* Конечный год формирования акта. */
    Integer yearTo
    /* Конечный номер месяца формирования акта. */
    Integer monthTo
    /* Список моделей, которые нужны в отчете.  */
    List<PlacementType> placementPrograms
    /* Список ИНН, которые нужны в отчете. */
    List<String> inns
    /* Список магазинов, которые нужны в отчете. */
    List<Long> campaignIds
}
