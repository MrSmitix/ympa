package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.openapitools.server.api.model.ShowsSalesGroupingType;

/**
 * Данные, необходимые для генерации отчета.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenerateShowsSalesReportRequest   {
  
  private Long businessId;
  private Long campaignId;
  private LocalDate dateFrom;
  private LocalDate dateTo;
  private ShowsSalesGroupingType grouping;

  public GenerateShowsSalesReportRequest () {

  }

  public GenerateShowsSalesReportRequest (Long businessId, Long campaignId, LocalDate dateFrom, LocalDate dateTo, ShowsSalesGroupingType grouping) {
    this.businessId = businessId;
    this.campaignId = campaignId;
    this.dateFrom = dateFrom;
    this.dateTo = dateTo;
    this.grouping = grouping;
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

    
  @JsonProperty("dateFrom")
  public LocalDate getDateFrom() {
    return dateFrom;
  }
  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

    
  @JsonProperty("dateTo")
  public LocalDate getDateTo() {
    return dateTo;
  }
  public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }

    
  @JsonProperty("grouping")
  public ShowsSalesGroupingType getGrouping() {
    return grouping;
  }
  public void setGrouping(ShowsSalesGroupingType grouping) {
    this.grouping = grouping;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateShowsSalesReportRequest generateShowsSalesReportRequest = (GenerateShowsSalesReportRequest) o;
    return Objects.equals(businessId, generateShowsSalesReportRequest.businessId) &&
        Objects.equals(campaignId, generateShowsSalesReportRequest.campaignId) &&
        Objects.equals(dateFrom, generateShowsSalesReportRequest.dateFrom) &&
        Objects.equals(dateTo, generateShowsSalesReportRequest.dateTo) &&
        Objects.equals(grouping, generateShowsSalesReportRequest.grouping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, campaignId, dateFrom, dateTo, grouping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateShowsSalesReportRequest {\n");
    
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    grouping: ").append(toIndentedString(grouping)).append("\n");
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
