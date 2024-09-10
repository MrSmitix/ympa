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
@ApiModel(description="Данные, необходимые для генерации отчета.")

public class GeneratePricesReportRequest  {
  
  @ApiModelProperty(value = "Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`. ")
 /**
   * Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`. 
  **/
  private Long businessId;

  @ApiModelProperty(value = "Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно. ")
 /**
   * Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно. 
  **/
  private Long campaignId;

  @ApiModelProperty(value = "Фильтр по категориям на Маркете.")
 /**
   * Фильтр по категориям на Маркете.
  **/
  private List<Long> categoryIds;

  @ApiModelProperty(value = "Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`. ")
 /**
   * Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`. 
  **/
  private LocalDate creationDateFrom;

  @ApiModelProperty(value = "Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`. ")
 /**
   * Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`. 
  **/
  private LocalDate creationDateTo;
 /**
   * Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан &#x60;campaignId&#x60;. 
   * @return businessId
  **/
  @JsonProperty("businessId")
  public Long getBusinessId() {
    return businessId;
  }

  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  public GeneratePricesReportRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

 /**
   * Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать &#x60;businessId&#x60; не нужно. 
   * @return campaignId
  **/
  @JsonProperty("campaignId")
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public GeneratePricesReportRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

 /**
   * Фильтр по категориям на Маркете.
   * @return categoryIds
  **/
  @JsonProperty("categoryIds")
  public List<Long> getCategoryIds() {
    return categoryIds;
  }

  public void setCategoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
  }

  public GeneratePricesReportRequest categoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  public GeneratePricesReportRequest addCategoryIdsItem(Long categoryIdsItem) {
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

 /**
   * Фильтр по времени появления предложения — начало периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
   * @return creationDateFrom
  **/
  @JsonProperty("creationDateFrom")
  public LocalDate getCreationDateFrom() {
    return creationDateFrom;
  }

  public void setCreationDateFrom(LocalDate creationDateFrom) {
    this.creationDateFrom = creationDateFrom;
  }

  public GeneratePricesReportRequest creationDateFrom(LocalDate creationDateFrom) {
    this.creationDateFrom = creationDateFrom;
    return this;
  }

 /**
   * Фильтр по времени появления предложения — окончание периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
   * @return creationDateTo
  **/
  @JsonProperty("creationDateTo")
  public LocalDate getCreationDateTo() {
    return creationDateTo;
  }

  public void setCreationDateTo(LocalDate creationDateTo) {
    this.creationDateTo = creationDateTo;
  }

  public GeneratePricesReportRequest creationDateTo(LocalDate creationDateTo) {
    this.creationDateTo = creationDateTo;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

