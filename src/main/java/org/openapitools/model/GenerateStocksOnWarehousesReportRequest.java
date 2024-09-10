/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;



/**
 * Данные, необходимые для генерации отчета. 
 */

@ApiModel(description = "Данные, необходимые для генерации отчета. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateStocksOnWarehousesReportRequest   {
  
  private Long campaignId;
  private List<Long> warehouseIds;
  private Date reportDate;
  private List<Long> categoryIds;
  private Boolean hasStocks;

  /**
   * Идентификатор магазина.
   */
  public GenerateStocksOnWarehousesReportRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор магазина.")
  @JsonProperty("campaignId")
  public Long getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
   */
  public GenerateStocksOnWarehousesReportRequest warehouseIds(List<Long> warehouseIds) {
    this.warehouseIds = warehouseIds;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).")
  @JsonProperty("warehouseIds")
  public List<Long> getWarehouseIds() {
    return warehouseIds;
  }
  public void setWarehouseIds(List<Long> warehouseIds) {
    this.warehouseIds = warehouseIds;
  }

  /**
   * Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
   */
  public GenerateStocksOnWarehousesReportRequest reportDate(Date reportDate) {
    this.reportDate = reportDate;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.")
  @JsonProperty("reportDate")
  public Date getReportDate() {
    return reportDate;
  }
  public void setReportDate(Date reportDate) {
    this.reportDate = reportDate;
  }

  /**
   * Фильтр по категориям на Маркете (кроме модели FBY).
   */
  public GenerateStocksOnWarehousesReportRequest categoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по категориям на Маркете (кроме модели FBY).")
  @JsonProperty("categoryIds")
  public List<Long> getCategoryIds() {
    return categoryIds;
  }
  public void setCategoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
  }

  /**
   * Фильтр по наличию остатков (кроме модели FBY).
   */
  public GenerateStocksOnWarehousesReportRequest hasStocks(Boolean hasStocks) {
    this.hasStocks = hasStocks;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по наличию остатков (кроме модели FBY).")
  @JsonProperty("hasStocks")
  public Boolean getHasStocks() {
    return hasStocks;
  }
  public void setHasStocks(Boolean hasStocks) {
    this.hasStocks = hasStocks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest = (GenerateStocksOnWarehousesReportRequest) o;
    return Objects.equals(campaignId, generateStocksOnWarehousesReportRequest.campaignId) &&
        Objects.equals(warehouseIds, generateStocksOnWarehousesReportRequest.warehouseIds) &&
        Objects.equals(reportDate, generateStocksOnWarehousesReportRequest.reportDate) &&
        Objects.equals(categoryIds, generateStocksOnWarehousesReportRequest.categoryIds) &&
        Objects.equals(hasStocks, generateStocksOnWarehousesReportRequest.hasStocks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, warehouseIds, reportDate, categoryIds, hasStocks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateStocksOnWarehousesReportRequest {\n");
    
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    warehouseIds: ").append(toIndentedString(warehouseIds)).append("\n");
    sb.append("    reportDate: ").append(toIndentedString(reportDate)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
    sb.append("    hasStocks: ").append(toIndentedString(hasStocks)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

