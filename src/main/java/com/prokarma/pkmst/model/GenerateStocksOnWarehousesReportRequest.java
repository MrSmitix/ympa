package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Данные, необходимые для генерации отчета. 
 */
@ApiModel(description = "Данные, необходимые для генерации отчета. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateStocksOnWarehousesReportRequest   {
  @JsonProperty("campaignId")
  private Long campaignId;

  @JsonProperty("warehouseIds")
  
  private List<Long> warehouseIds = null;

  @JsonProperty("reportDate")
  private LocalDate reportDate;

  @JsonProperty("categoryIds")
  
  private List<Long> categoryIds = null;

  @JsonProperty("hasStocks")
  private Boolean hasStocks;

  public GenerateStocksOnWarehousesReportRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Идентификатор магазина.
   * @return campaignId
   */
  @ApiModelProperty(required = true, value = "Идентификатор магазина.")
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public GenerateStocksOnWarehousesReportRequest warehouseIds(List<Long> warehouseIds) {
    this.warehouseIds = warehouseIds;
    return this;
  }

  public GenerateStocksOnWarehousesReportRequest addWarehouseIdsItem(Long warehouseIdsItem) {
    if (this.warehouseIds == null) {
      this.warehouseIds = new ArrayList<>();
    }
    this.warehouseIds.add(warehouseIdsItem);
    return this;
  }

  /**
   * Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
   * @return warehouseIds
   */
  @ApiModelProperty(value = "Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).")
  public List<Long> getWarehouseIds() {
    return warehouseIds;
  }

  public void setWarehouseIds(List<Long> warehouseIds) {
    this.warehouseIds = warehouseIds;
  }

  public GenerateStocksOnWarehousesReportRequest reportDate(LocalDate reportDate) {
    this.reportDate = reportDate;
    return this;
  }

  /**
   * Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
   * @return reportDate
   */
  @ApiModelProperty(value = "Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.")
  public LocalDate getReportDate() {
    return reportDate;
  }

  public void setReportDate(LocalDate reportDate) {
    this.reportDate = reportDate;
  }

  public GenerateStocksOnWarehousesReportRequest categoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  public GenerateStocksOnWarehousesReportRequest addCategoryIdsItem(Long categoryIdsItem) {
    if (this.categoryIds == null) {
      this.categoryIds = new ArrayList<>();
    }
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

  /**
   * Фильтр по категориям на Маркете (кроме модели FBY).
   * @return categoryIds
   */
  @ApiModelProperty(value = "Фильтр по категориям на Маркете (кроме модели FBY).")
  public List<Long> getCategoryIds() {
    return categoryIds;
  }

  public void setCategoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
  }

  public GenerateStocksOnWarehousesReportRequest hasStocks(Boolean hasStocks) {
    this.hasStocks = hasStocks;
    return this;
  }

  /**
   * Фильтр по наличию остатков (кроме модели FBY).
   * @return hasStocks
   */
  @ApiModelProperty(value = "Фильтр по наличию остатков (кроме модели FBY).")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

