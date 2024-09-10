package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Данные, необходимые для генерации отчета. 
 **/
@ApiModel(description="Данные, необходимые для генерации отчета. ")

public class GenerateStocksOnWarehousesReportRequest  {
  
  @ApiModelProperty(required = true, value = "Идентификатор магазина.")
 /**
   * Идентификатор магазина.
  **/
  private Long campaignId;

  @ApiModelProperty(value = "Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).")
 /**
   * Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
  **/
  private List<Long> warehouseIds;

  @ApiModelProperty(value = "Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.")
 /**
   * Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
  **/
  private LocalDate reportDate;

  @ApiModelProperty(value = "Фильтр по категориям на Маркете (кроме модели FBY).")
 /**
   * Фильтр по категориям на Маркете (кроме модели FBY).
  **/
  private List<Long> categoryIds;

  @ApiModelProperty(value = "Фильтр по наличию остатков (кроме модели FBY).")
 /**
   * Фильтр по наличию остатков (кроме модели FBY).
  **/
  private Boolean hasStocks;
 /**
   * Идентификатор магазина.
   * @return campaignId
  **/
  @JsonProperty("campaignId")
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public GenerateStocksOnWarehousesReportRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

 /**
   * Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
   * @return warehouseIds
  **/
  @JsonProperty("warehouseIds")
  public List<Long> getWarehouseIds() {
    return warehouseIds;
  }

  public void setWarehouseIds(List<Long> warehouseIds) {
    this.warehouseIds = warehouseIds;
  }

  public GenerateStocksOnWarehousesReportRequest warehouseIds(List<Long> warehouseIds) {
    this.warehouseIds = warehouseIds;
    return this;
  }

  public GenerateStocksOnWarehousesReportRequest addWarehouseIdsItem(Long warehouseIdsItem) {
    this.warehouseIds.add(warehouseIdsItem);
    return this;
  }

 /**
   * Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
   * @return reportDate
  **/
  @JsonProperty("reportDate")
  public LocalDate getReportDate() {
    return reportDate;
  }

  public void setReportDate(LocalDate reportDate) {
    this.reportDate = reportDate;
  }

  public GenerateStocksOnWarehousesReportRequest reportDate(LocalDate reportDate) {
    this.reportDate = reportDate;
    return this;
  }

 /**
   * Фильтр по категориям на Маркете (кроме модели FBY).
   * @return categoryIds
  **/
  @JsonProperty("categoryIds")
  public List<Long> getCategoryIds() {
    return categoryIds;
  }

  public void setCategoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
  }

  public GenerateStocksOnWarehousesReportRequest categoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  public GenerateStocksOnWarehousesReportRequest addCategoryIdsItem(Long categoryIdsItem) {
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

 /**
   * Фильтр по наличию остатков (кроме модели FBY).
   * @return hasStocks
  **/
  @JsonProperty("hasStocks")
  public Boolean getHasStocks() {
    return hasStocks;
  }

  public void setHasStocks(Boolean hasStocks) {
    this.hasStocks = hasStocks;
  }

  public GenerateStocksOnWarehousesReportRequest hasStocks(Boolean hasStocks) {
    this.hasStocks = hasStocks;
    return this;
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
    return Objects.equals(this.campaignId, generateStocksOnWarehousesReportRequest.campaignId) &&
        Objects.equals(this.warehouseIds, generateStocksOnWarehousesReportRequest.warehouseIds) &&
        Objects.equals(this.reportDate, generateStocksOnWarehousesReportRequest.reportDate) &&
        Objects.equals(this.categoryIds, generateStocksOnWarehousesReportRequest.categoryIds) &&
        Objects.equals(this.hasStocks, generateStocksOnWarehousesReportRequest.hasStocks);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

