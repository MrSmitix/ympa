package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class GenerateStocksOnWarehousesReportRequest {
    /* Идентификатор магазина. */
    Long campaignId
    /* Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). */
    List<Long> warehouseIds
    /* Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. */
    Date reportDate
    /* Фильтр по категориям на Маркете (кроме модели FBY). */
    List<Long> categoryIds
    /* Фильтр по наличию остатков (кроме модели FBY). */
    Boolean hasStocks
}
