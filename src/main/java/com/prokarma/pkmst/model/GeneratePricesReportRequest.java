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
@ApiModel(description = "Данные, необходимые для генерации отчета.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GeneratePricesReportRequest   {
  @JsonProperty("businessId")
  private Long businessId;

  @JsonProperty("campaignId")
  private Long campaignId;

  @JsonProperty("categoryIds")
  
  private List<Long> categoryIds = null;

  @JsonProperty("creationDateFrom")
  private LocalDate creationDateFrom;

  @JsonProperty("creationDateTo")
  private LocalDate creationDateTo;

  public GeneratePricesReportRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

  /**
   * Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`. 
   * @return businessId
   */
  @ApiModelProperty(value = "Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`. ")
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
  @ApiModelProperty(value = "Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно. ")
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public GeneratePricesReportRequest categoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  public GeneratePricesReportRequest addCategoryIdsItem(Long categoryIdsItem) {
    if (this.categoryIds == null) {
      this.categoryIds = new ArrayList<>();
    }
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

  /**
   * Фильтр по категориям на Маркете.
   * @return categoryIds
   */
  @ApiModelProperty(value = "Фильтр по категориям на Маркете.")
  public List<Long> getCategoryIds() {
    return categoryIds;
  }

  public void setCategoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
  }

  public GeneratePricesReportRequest creationDateFrom(LocalDate creationDateFrom) {
    this.creationDateFrom = creationDateFrom;
    return this;
  }

  /**
   * Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`. 
   * @return creationDateFrom
   */
  @ApiModelProperty(value = "Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`. ")
  public LocalDate getCreationDateFrom() {
    return creationDateFrom;
  }

  public void setCreationDateFrom(LocalDate creationDateFrom) {
    this.creationDateFrom = creationDateFrom;
  }

  public GeneratePricesReportRequest creationDateTo(LocalDate creationDateTo) {
    this.creationDateTo = creationDateTo;
    return this;
  }

  /**
   * Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`. 
   * @return creationDateTo
   */
  @ApiModelProperty(value = "Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`. ")
  public LocalDate getCreationDateTo() {
    return creationDateTo;
  }

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

