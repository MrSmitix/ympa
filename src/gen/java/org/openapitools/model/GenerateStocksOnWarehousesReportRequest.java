package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Данные, необходимые для генерации отчета. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateStocksOnWarehousesReportRequest   {
  
  private Long campaignId;
  private List<Long> warehouseIds;
  private Date reportDate;
  private List<Long> categoryIds;
  private Boolean hasStocks;

  /**
   * Идентификатор магазина.
   **/
  
  @ApiModelProperty(required = true, value = "Идентификатор магазина.")
  @JsonProperty("campaignId")
  @NotNull
  public Long getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
   **/
  
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
   **/
  
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
   **/
  
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
   **/
  
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

