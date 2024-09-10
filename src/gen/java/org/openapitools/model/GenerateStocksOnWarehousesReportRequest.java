package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Данные, необходимые для генерации отчета. 
 */
@ApiModel(description="Данные, необходимые для генерации отчета. ")

public class GenerateStocksOnWarehousesReportRequest  {
  
 /**
  * Идентификатор магазина.
  */
  @ApiModelProperty(required = true, value = "Идентификатор магазина.")
  private Long campaignId;

 /**
  * Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
  */
  @ApiModelProperty(value = "Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).")
  private List<Long> warehouseIds;

 /**
  * Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
  */
  @ApiModelProperty(value = "Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate reportDate;

 /**
  * Фильтр по категориям на Маркете (кроме модели FBY).
  */
  @ApiModelProperty(value = "Фильтр по категориям на Маркете (кроме модели FBY).")
  private List<Long> categoryIds;

 /**
  * Фильтр по наличию остатков (кроме модели FBY).
  */
  @ApiModelProperty(value = "Фильтр по наличию остатков (кроме модели FBY).")
  private Boolean hasStocks;
 /**
  * Идентификатор магазина.
  * @return campaignId
  */
  @JsonProperty("campaignId")
  @NotNull
  public Long getCampaignId() {
    return campaignId;
  }

  /**
   * Sets the <code>campaignId</code> property.
   */
 public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Sets the <code>campaignId</code> property.
   */
  public GenerateStocksOnWarehousesReportRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

 /**
  * Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
  * @return warehouseIds
  */
  @JsonProperty("warehouseIds")
  public List<Long> getWarehouseIds() {
    return warehouseIds;
  }

  /**
   * Sets the <code>warehouseIds</code> property.
   */
 public void setWarehouseIds(List<Long> warehouseIds) {
    this.warehouseIds = warehouseIds;
  }

  /**
   * Sets the <code>warehouseIds</code> property.
   */
  public GenerateStocksOnWarehousesReportRequest warehouseIds(List<Long> warehouseIds) {
    this.warehouseIds = warehouseIds;
    return this;
  }

  /**
   * Adds a new item to the <code>warehouseIds</code> list.
   */
  public GenerateStocksOnWarehousesReportRequest addWarehouseIdsItem(Long warehouseIdsItem) {
    this.warehouseIds.add(warehouseIdsItem);
    return this;
  }

 /**
  * Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
  * @return reportDate
  */
  @JsonProperty("reportDate")
  public LocalDate getReportDate() {
    return reportDate;
  }

  /**
   * Sets the <code>reportDate</code> property.
   */
 public void setReportDate(LocalDate reportDate) {
    this.reportDate = reportDate;
  }

  /**
   * Sets the <code>reportDate</code> property.
   */
  public GenerateStocksOnWarehousesReportRequest reportDate(LocalDate reportDate) {
    this.reportDate = reportDate;
    return this;
  }

 /**
  * Фильтр по категориям на Маркете (кроме модели FBY).
  * @return categoryIds
  */
  @JsonProperty("categoryIds")
  public List<Long> getCategoryIds() {
    return categoryIds;
  }

  /**
   * Sets the <code>categoryIds</code> property.
   */
 public void setCategoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
  }

  /**
   * Sets the <code>categoryIds</code> property.
   */
  public GenerateStocksOnWarehousesReportRequest categoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  /**
   * Adds a new item to the <code>categoryIds</code> list.
   */
  public GenerateStocksOnWarehousesReportRequest addCategoryIdsItem(Long categoryIdsItem) {
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

 /**
  * Фильтр по наличию остатков (кроме модели FBY).
  * @return hasStocks
  */
  @JsonProperty("hasStocks")
  public Boolean getHasStocks() {
    return hasStocks;
  }

  /**
   * Sets the <code>hasStocks</code> property.
   */
 public void setHasStocks(Boolean hasStocks) {
    this.hasStocks = hasStocks;
  }

  /**
   * Sets the <code>hasStocks</code> property.
   */
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

