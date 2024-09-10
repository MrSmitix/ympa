package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Данные, необходимые для генерации отчета. 
 **/
@ApiModel(description = "Данные, необходимые для генерации отчета. ")
@JsonTypeName("GenerateStocksOnWarehousesReportRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateStocksOnWarehousesReportRequest   {
  private Long campaignId;
  private @Valid List<Long> warehouseIds;
  private LocalDate reportDate;
  private @Valid List<Long> categoryIds;
  private Boolean hasStocks;

  /**
   * Идентификатор магазина.
   **/
  public GenerateStocksOnWarehousesReportRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор магазина.")
  @JsonProperty("campaignId")
  @NotNull public Long getCampaignId() {
    return campaignId;
  }

  @JsonProperty("campaignId")
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
   **/
  public GenerateStocksOnWarehousesReportRequest warehouseIds(List<Long> warehouseIds) {
    this.warehouseIds = warehouseIds;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).")
  @JsonProperty("warehouseIds")
  public List<Long> getWarehouseIds() {
    return warehouseIds;
  }

  @JsonProperty("warehouseIds")
  public void setWarehouseIds(List<Long> warehouseIds) {
    this.warehouseIds = warehouseIds;
  }

  public GenerateStocksOnWarehousesReportRequest addWarehouseIdsItem(Long warehouseIdsItem) {
    if (this.warehouseIds == null) {
      this.warehouseIds = new ArrayList<>();
    }

    this.warehouseIds.add(warehouseIdsItem);
    return this;
  }

  public GenerateStocksOnWarehousesReportRequest removeWarehouseIdsItem(Long warehouseIdsItem) {
    if (warehouseIdsItem != null && this.warehouseIds != null) {
      this.warehouseIds.remove(warehouseIdsItem);
    }

    return this;
  }
  /**
   * Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
   **/
  public GenerateStocksOnWarehousesReportRequest reportDate(LocalDate reportDate) {
    this.reportDate = reportDate;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.")
  @JsonProperty("reportDate")
  public LocalDate getReportDate() {
    return reportDate;
  }

  @JsonProperty("reportDate")
  public void setReportDate(LocalDate reportDate) {
    this.reportDate = reportDate;
  }

  /**
   * Фильтр по категориям на Маркете (кроме модели FBY).
   **/
  public GenerateStocksOnWarehousesReportRequest categoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по категориям на Маркете (кроме модели FBY).")
  @JsonProperty("categoryIds")
  public List<Long> getCategoryIds() {
    return categoryIds;
  }

  @JsonProperty("categoryIds")
  public void setCategoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
  }

  public GenerateStocksOnWarehousesReportRequest addCategoryIdsItem(Long categoryIdsItem) {
    if (this.categoryIds == null) {
      this.categoryIds = new ArrayList<>();
    }

    this.categoryIds.add(categoryIdsItem);
    return this;
  }

  public GenerateStocksOnWarehousesReportRequest removeCategoryIdsItem(Long categoryIdsItem) {
    if (categoryIdsItem != null && this.categoryIds != null) {
      this.categoryIds.remove(categoryIdsItem);
    }

    return this;
  }
  /**
   * Фильтр по наличию остатков (кроме модели FBY).
   **/
  public GenerateStocksOnWarehousesReportRequest hasStocks(Boolean hasStocks) {
    this.hasStocks = hasStocks;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по наличию остатков (кроме модели FBY).")
  @JsonProperty("hasStocks")
  public Boolean getHasStocks() {
    return hasStocks;
  }

  @JsonProperty("hasStocks")
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

