package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Данные, необходимые для генерации отчета. 
 */

@Schema(name = "GenerateStocksOnWarehousesReportRequest", description = "Данные, необходимые для генерации отчета. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateStocksOnWarehousesReportRequest {

  private Long campaignId;

  @Valid
  private JsonNullable<List<Long>> warehouseIds = JsonNullable.<List<Long>>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date reportDate;

  @Valid
  private JsonNullable<List<Long>> categoryIds = JsonNullable.<List<Long>>undefined();

  private Boolean hasStocks;

  public GenerateStocksOnWarehousesReportRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GenerateStocksOnWarehousesReportRequest(Long campaignId) {
    this.campaignId = campaignId;
  }

  public GenerateStocksOnWarehousesReportRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Идентификатор магазина.
   * @return campaignId
   */
  @NotNull 
  @Schema(name = "campaignId", description = "Идентификатор магазина.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("campaignId")
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public GenerateStocksOnWarehousesReportRequest warehouseIds(List<Long> warehouseIds) {
    this.warehouseIds = JsonNullable.of(warehouseIds);
    return this;
  }

  public GenerateStocksOnWarehousesReportRequest addWarehouseIdsItem(Long warehouseIdsItem) {
    if (this.warehouseIds == null || !this.warehouseIds.isPresent()) {
      this.warehouseIds = JsonNullable.of(new ArrayList<>());
    }
    this.warehouseIds.get().add(warehouseIdsItem);
    return this;
  }

  /**
   * Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
   * @return warehouseIds
   */
  
  @Schema(name = "warehouseIds", description = "Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warehouseIds")
  public JsonNullable<List<Long>> getWarehouseIds() {
    return warehouseIds;
  }

  public void setWarehouseIds(JsonNullable<List<Long>> warehouseIds) {
    this.warehouseIds = warehouseIds;
  }

  public GenerateStocksOnWarehousesReportRequest reportDate(Date reportDate) {
    this.reportDate = reportDate;
    return this;
  }

  /**
   * Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
   * @return reportDate
   */
  @Valid 
  @Schema(name = "reportDate", description = "Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reportDate")
  public Date getReportDate() {
    return reportDate;
  }

  public void setReportDate(Date reportDate) {
    this.reportDate = reportDate;
  }

  public GenerateStocksOnWarehousesReportRequest categoryIds(List<Long> categoryIds) {
    this.categoryIds = JsonNullable.of(categoryIds);
    return this;
  }

  public GenerateStocksOnWarehousesReportRequest addCategoryIdsItem(Long categoryIdsItem) {
    if (this.categoryIds == null || !this.categoryIds.isPresent()) {
      this.categoryIds = JsonNullable.of(new ArrayList<>());
    }
    this.categoryIds.get().add(categoryIdsItem);
    return this;
  }

  /**
   * Фильтр по категориям на Маркете (кроме модели FBY).
   * @return categoryIds
   */
  
  @Schema(name = "categoryIds", description = "Фильтр по категориям на Маркете (кроме модели FBY).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryIds")
  public JsonNullable<List<Long>> getCategoryIds() {
    return categoryIds;
  }

  public void setCategoryIds(JsonNullable<List<Long>> categoryIds) {
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
  
  @Schema(name = "hasStocks", description = "Фильтр по наличию остатков (кроме модели FBY).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        equalsNullable(this.warehouseIds, generateStocksOnWarehousesReportRequest.warehouseIds) &&
        Objects.equals(this.reportDate, generateStocksOnWarehousesReportRequest.reportDate) &&
        equalsNullable(this.categoryIds, generateStocksOnWarehousesReportRequest.categoryIds) &&
        Objects.equals(this.hasStocks, generateStocksOnWarehousesReportRequest.hasStocks);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, hashCodeNullable(warehouseIds), reportDate, hashCodeNullable(categoryIds), hasStocks);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

