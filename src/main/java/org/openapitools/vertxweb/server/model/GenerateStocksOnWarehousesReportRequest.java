package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Данные, необходимые для генерации отчета. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenerateStocksOnWarehousesReportRequest   {
  
  private Long campaignId;
  private List<Long> warehouseIds;
  private LocalDate reportDate;
  private List<Long> categoryIds;
  private Boolean hasStocks;

  public GenerateStocksOnWarehousesReportRequest () {

  }

  public GenerateStocksOnWarehousesReportRequest (Long campaignId, List<Long> warehouseIds, LocalDate reportDate, List<Long> categoryIds, Boolean hasStocks) {
    this.campaignId = campaignId;
    this.warehouseIds = warehouseIds;
    this.reportDate = reportDate;
    this.categoryIds = categoryIds;
    this.hasStocks = hasStocks;
  }

    
  @JsonProperty("campaignId")
  public Long getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

    
  @JsonProperty("warehouseIds")
  public List<Long> getWarehouseIds() {
    return warehouseIds;
  }
  public void setWarehouseIds(List<Long> warehouseIds) {
    this.warehouseIds = warehouseIds;
  }

    
  @JsonProperty("reportDate")
  public LocalDate getReportDate() {
    return reportDate;
  }
  public void setReportDate(LocalDate reportDate) {
    this.reportDate = reportDate;
  }

    
  @JsonProperty("categoryIds")
  public List<Long> getCategoryIds() {
    return categoryIds;
  }
  public void setCategoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
  }

    
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
