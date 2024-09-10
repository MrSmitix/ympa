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
public class GeneratePricesReportRequest   {
  
  private Long businessId;
  private Long campaignId;
  private List<Long> categoryIds;
  private LocalDate creationDateFrom;
  private LocalDate creationDateTo;

  public GeneratePricesReportRequest () {

  }

  public GeneratePricesReportRequest (Long businessId, Long campaignId, List<Long> categoryIds, LocalDate creationDateFrom, LocalDate creationDateTo) {
    this.businessId = businessId;
    this.campaignId = campaignId;
    this.categoryIds = categoryIds;
    this.creationDateFrom = creationDateFrom;
    this.creationDateTo = creationDateTo;
  }

    
  @JsonProperty("businessId")
  public Long getBusinessId() {
    return businessId;
  }
  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

    
  @JsonProperty("campaignId")
  public Long getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

    
  @JsonProperty("categoryIds")
  public List<Long> getCategoryIds() {
    return categoryIds;
  }
  public void setCategoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
  }

    
  @JsonProperty("creationDateFrom")
  public LocalDate getCreationDateFrom() {
    return creationDateFrom;
  }
  public void setCreationDateFrom(LocalDate creationDateFrom) {
    this.creationDateFrom = creationDateFrom;
  }

    
  @JsonProperty("creationDateTo")
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
