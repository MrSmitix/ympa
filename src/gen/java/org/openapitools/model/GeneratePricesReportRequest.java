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
@ApiModel(description = "Данные, необходимые для генерации отчета.")
@JsonTypeName("GeneratePricesReportRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GeneratePricesReportRequest   {
  private Long businessId;
  private Long campaignId;
  private @Valid List<Long> categoryIds;
  private LocalDate creationDateFrom;
  private LocalDate creationDateTo;

  /**
   * Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан &#x60;campaignId&#x60;. 
   **/
  public GeneratePricesReportRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`. ")
  @JsonProperty("businessId")
  public Long getBusinessId() {
    return businessId;
  }

  @JsonProperty("businessId")
  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  /**
   * Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать &#x60;businessId&#x60; не нужно. 
   **/
  public GeneratePricesReportRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно. ")
  @JsonProperty("campaignId")
  public Long getCampaignId() {
    return campaignId;
  }

  @JsonProperty("campaignId")
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Фильтр по категориям на Маркете.
   **/
  public GeneratePricesReportRequest categoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по категориям на Маркете.")
  @JsonProperty("categoryIds")
  public List<Long> getCategoryIds() {
    return categoryIds;
  }

  @JsonProperty("categoryIds")
  public void setCategoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
  }

  public GeneratePricesReportRequest addCategoryIdsItem(Long categoryIdsItem) {
    if (this.categoryIds == null) {
      this.categoryIds = new ArrayList<>();
    }

    this.categoryIds.add(categoryIdsItem);
    return this;
  }

  public GeneratePricesReportRequest removeCategoryIdsItem(Long categoryIdsItem) {
    if (categoryIdsItem != null && this.categoryIds != null) {
      this.categoryIds.remove(categoryIdsItem);
    }

    return this;
  }
  /**
   * Фильтр по времени появления предложения — начало периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
   **/
  public GeneratePricesReportRequest creationDateFrom(LocalDate creationDateFrom) {
    this.creationDateFrom = creationDateFrom;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`. ")
  @JsonProperty("creationDateFrom")
  public LocalDate getCreationDateFrom() {
    return creationDateFrom;
  }

  @JsonProperty("creationDateFrom")
  public void setCreationDateFrom(LocalDate creationDateFrom) {
    this.creationDateFrom = creationDateFrom;
  }

  /**
   * Фильтр по времени появления предложения — окончание периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
   **/
  public GeneratePricesReportRequest creationDateTo(LocalDate creationDateTo) {
    this.creationDateTo = creationDateTo;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`. ")
  @JsonProperty("creationDateTo")
  public LocalDate getCreationDateTo() {
    return creationDateTo;
  }

  @JsonProperty("creationDateTo")
  public void setCreationDateTo(LocalDate creationDateTo) {
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
        Objects.equals(this.categoryIds, generatePricesReportRequest.categoryIds) &&
        Objects.equals(this.creationDateFrom, generatePricesReportRequest.creationDateFrom) &&
        Objects.equals(this.creationDateTo, generatePricesReportRequest.creationDateTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, campaignId, categoryIds, creationDateFrom, creationDateTo);
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

