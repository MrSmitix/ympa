package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;



/**
 * Данные, необходимые для генерации отчета.
 **/

@ApiModel(description = "Данные, необходимые для генерации отчета.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GeneratePricesReportRequest   {
  @JsonProperty("businessId")
  private Long businessId;

  @JsonProperty("campaignId")
  private Long campaignId;

  @JsonProperty("categoryIds")
  private List<Long> categoryIds = null;

  @JsonProperty("creationDateFrom")
  private Date creationDateFrom;

  @JsonProperty("creationDateTo")
  private Date creationDateTo;

  /**
   * Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`. 
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
  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  /**
   * Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно. 
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
  public void setCategoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
  }

  /**
   * Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`. 
   **/
  public GeneratePricesReportRequest creationDateFrom(Date creationDateFrom) {
    this.creationDateFrom = creationDateFrom;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`. ")
  @JsonProperty("creationDateFrom")
  public Date getCreationDateFrom() {
    return creationDateFrom;
  }
  public void setCreationDateFrom(Date creationDateFrom) {
    this.creationDateFrom = creationDateFrom;
  }

  /**
   * Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`. 
   **/
  public GeneratePricesReportRequest creationDateTo(Date creationDateTo) {
    this.creationDateTo = creationDateTo;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`. ")
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
    return Objects.equals(businessId, generatePricesReportRequest.businessId) &&
        Objects.equals(campaignId, generatePricesReportRequest.campaignId) &&
        Objects.equals(categoryIds, generatePricesReportRequest.categoryIds) &&
        Objects.equals(creationDateFrom, generatePricesReportRequest.creationDateFrom) &&
        Objects.equals(creationDateTo, generatePricesReportRequest.creationDateTo);
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

