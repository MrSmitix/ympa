package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class GeneratePricesReportRequest {
    /* Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`.  */
    Long businessId
    /* Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно.  */
    Long campaignId
    /* Фильтр по категориям на Маркете. */
    List<Long> categoryIds
    /* Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`.  */
    Date creationDateFrom
    /* Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`.  */
    Date creationDateTo
}
