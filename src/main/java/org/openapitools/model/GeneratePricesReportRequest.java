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

@Schema(name = "GeneratePricesReportRequest", description = "Данные, необходимые для генерации отчета.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GeneratePricesReportRequest {

  private Long businessId;

  private Long campaignId;

  @Valid
  private JsonNullable<List<Long>> categoryIds = JsonNullable.<List<Long>>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date creationDateFrom;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date creationDateTo;

  public GeneratePricesReportRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

  /**
   * Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`. 
   * @return businessId
   */
  
  @Schema(name = "businessId", description = "Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("businessId")
  public Long getBusinessId() {
    return businessId;
  }

  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  public GeneratePricesReportRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно. 
   * @return campaignId
   */
  
  @Schema(name = "campaignId", description = "Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("campaignId")
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public GeneratePricesReportRequest categoryIds(List<Long> categoryIds) {
    this.categoryIds = JsonNullable.of(categoryIds);
    return this;
  }

  public GeneratePricesReportRequest addCategoryIdsItem(Long categoryIdsItem) {
    if (this.categoryIds == null || !this.categoryIds.isPresent()) {
      this.categoryIds = JsonNullable.of(new ArrayList<>());
    }
    this.categoryIds.get().add(categoryIdsItem);
    return this;
  }

  /**
   * Фильтр по категориям на Маркете.
   * @return categoryIds
   */
  
  @Schema(name = "categoryIds", description = "Фильтр по категориям на Маркете.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryIds")
  public JsonNullable<List<Long>> getCategoryIds() {
    return categoryIds;
  }

  public void setCategoryIds(JsonNullable<List<Long>> categoryIds) {
    this.categoryIds = categoryIds;
  }

  public GeneratePricesReportRequest creationDateFrom(Date creationDateFrom) {
    this.creationDateFrom = creationDateFrom;
    return this;
  }

  /**
   * Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`. 
   * @return creationDateFrom
   */
  @Valid 
  @Schema(name = "creationDateFrom", description = "Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationDateFrom")
  public Date getCreationDateFrom() {
    return creationDateFrom;
  }

  public void setCreationDateFrom(Date creationDateFrom) {
    this.creationDateFrom = creationDateFrom;
  }

  public GeneratePricesReportRequest creationDateTo(Date creationDateTo) {
    this.creationDateTo = creationDateTo;
    return this;
  }

  /**
   * Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`. 
   * @return creationDateTo
   */
  @Valid 
  @Schema(name = "creationDateTo", description = "Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationDateTo")
  public Date getCreationDateTo() {
    return creationDateTo;
  }

  public void setCreationDateTo(Date creationDateTo) {
    this.creationDateTo = creationDateTo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneratePricesReportRequest generatePricesReportRequest = (GeneratePricesReportRequest) o;
    return Objects.equals(this.businessId, generatePricesReportRequest.businessId) &&
        Objects.equals(this.campaignId, generatePricesReportRequest.campaignId) &&
        equalsNullable(this.categoryIds, generatePricesReportRequest.categoryIds) &&
        Objects.equals(this.creationDateFrom, generatePricesReportRequest.creationDateFrom) &&
        Objects.equals(this.creationDateTo, generatePricesReportRequest.creationDateTo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, campaignId, hashCodeNullable(categoryIds), creationDateFrom, creationDateTo);
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
    sb.append("class GeneratePricesReportRequest {\n");
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
    sb.append("    creationDateFrom: ").append(toIndentedString(creationDateFrom)).append("\n");
    sb.append("    creationDateTo: ").append(toIndentedString(creationDateTo)).append("\n");
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

